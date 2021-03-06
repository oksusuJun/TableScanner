package noshow.reservation.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import noshow.member.dao.OwnerMemberDAO;
import noshow.reservation.dao.ReservationDAO;
import noshow.reservation.service.ReservationService;
import noshow.table.dao.OrderTableDao;
import noshow.vo.OrderTable;
import noshow.vo.Reservation;
import noshow.vo.Restaurant;

@Service
public class ReservationServiceImpl implements ReservationService {

	@Resource
	private ReservationDAO dao;
	
	@Resource 
	private OwnerMemberDAO restaurantDao;
	
	@Resource 
	private OrderTableDao orderTableDao;
	
	@Override
	public int addReservation(int resNum, String resDate, int resPeople, String resStartTime, String resEndTime,
			Date resPaidTime, String resPayStatement, int resPrice, String memberId, String businessId, int tableSeq) {

		// 사업주가 설정한 1인당 예약금을 예약 인원에 맞게 초기화
		resPrice = calTotalPrice(businessId, resPeople);
		
		resEndTime = calResEndTime(businessId, resStartTime);
		
		Reservation reservation = new Reservation(resNum, resDate, resPeople, resStartTime, resEndTime, resPaidTime,
				resPayStatement, resPrice, memberId, businessId);

		int result = dao.insertReservation(reservation);
		System.out.println(result);
		
		/* 예약테이블 추가를 위한 부분 */
		resNum = selectResNumByReservationInfo(memberId, businessId, resStartTime);
		result = result + addOrderTable(tableSeq, resNum);
		return result;
	}

	@Override
	public int updateReservation(Reservation reservation, Map<String, OrderTable> orderTableMap) {
		return dao.updateReservationByResNum(reservation);
	}

	@Override
	public int deleteReservation(int resNum) {
		return dao.deleteReservationByResNum(resNum);
	}

	@Override
	public List<Reservation> selectReservationByMemberId(String memberId) {
		return dao.selectReservationByMemberId(memberId);
	}

	@Override
	public List<Reservation> selectReservationByBusinessId(String businessId) {
		return dao.selectReservationByBusinessId(businessId);
	}
	
	@Override
	public int selectResNumByReservationInfo(String memberId, String businessId, String resStartTime) {
		
		Map<String, String> resInfoMap = new HashMap<>();
		resInfoMap.put("memberId", memberId);
		resInfoMap.put("businessId", businessId);
		resInfoMap.put("resStartTime", resStartTime);
		
		return dao.selectResNumByReservationInfo(resInfoMap);
	}

	/**
	 * 매개변수로 받은 사업주 ID로 rt_term (Table이용시간) 를 받고, resStartTime (예약시작시간) 에 re_term 을
	 * 더하여 resEndTime(예약종료시간)을 리턴
	 * 
	 * @param businessId
	 * @param resEndTime
	 * @return
	 */
	private String calResEndTime(String businessId, String resStartTime) {
		
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date formatDate;

		Restaurant restaurant = restaurantDao.selectRestaurantByBusinessId(businessId);
		int rt_term = restaurant.getRtTerm();

		try {
			formatDate = dateForm.parse(resStartTime);
			Calendar cal = new GregorianCalendar(Locale.KOREA);
			cal.setTime(formatDate);
			cal.add(Calendar.HOUR, rt_term);
			String resEndTime = dateForm.format(cal.getTime());
			System.out.println(resEndTime);

			return resEndTime;
		} catch (ParseException e) {
			System.out.println("Date 변환 실패");
			e.printStackTrace();
		}
		return resStartTime;

	}

	/**
	 * 사업주가 지정한 1인당 예약금을 예약인원에 맞추어 계산해서 리턴
	 * @param businessId
	 * @param resPeople
	 * @return
	 */
	private int calTotalPrice(String businessId, int resPeople) {
		System.out.println(businessId);
		Restaurant restaurant = restaurantDao.selectRestaurantByBusinessId(businessId);
		return restaurant.getRtDeposit() * resPeople;
	}

	
	/* OrderTableService */
	@Override
	public int addOrderTable(int tableSeq, int resNum) {
		OrderTable orderTable = new OrderTable(tableSeq, resNum);
		return orderTableDao.insertOrderTable(orderTable);
	}

	@Override
	public int updateOrderTable(Map<String, OrderTable> orderTableMap) {
		return orderTableDao.updateOrderTableByResNum(orderTableMap);
	}

	@Override
	public int deleteOrderTable(int resNum) {
		return orderTableDao.deleteOrderTableByResNum(resNum);
	}

	@Override
	public List<OrderTable> selectOrderTableByResNum(int resNum) {
		return orderTableDao.selectOrderTableByResNum(resNum);
	}

	

}
