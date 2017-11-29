package noshow.reservation.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import noshow.member.dao.OwnerMemberDAO;
import noshow.reservation.dao.ReservationDAO;
import noshow.reservation.service.ReservationService;
import noshow.vo.Reservation;
import noshow.vo.Restaurant;

@Service
public class ReservationServiceImpl implements ReservationService{

	@Resource
	private ReservationDAO dao;
	
	@Resource
	private OwnerMemberDAO restaurantDao;
	
	@Override
	public int addReservation(int resNum, String resDate, int resPeople, String resStartTime, String resEndTime, Date resPaidTime, String resPayStatement,
			int resPrice, String memberId, String businessId) {
		
		
		Restaurant restaurant = restaurantDao.selectRestaurantByBusinessId(businessId);
		
		// 매개변수로 받은 사업주 ID로 rtTerm (Table이용시간) 받아옴
		int rt_term = restaurant.getRtTerm();
		
		// 사업주가 설정한 1인당 예약금을 예약 인원에 맞게 초기화
		int totalPrice = resPeople * restaurant.getRtDeposit();
		
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date formatDate;
		try {
			
			// 예약희망시간을 그대로 받아서 사업주가 지정한 Table 이용시간을 더하는 부분
			formatDate = dateForm.parse(resEndTime);
			Calendar cal = new GregorianCalendar(Locale.KOREA);
			cal.setTime(formatDate);
			cal.add(Calendar.HOUR, rt_term);
			resEndTime = dateForm.format(cal.getTime());
			System.out.println(resEndTime);
			Reservation reservation = new Reservation(resNum, resDate, resPeople, resStartTime, resEndTime, resPaidTime, resPayStatement, totalPrice, memberId, businessId);
			
			int result = dao.insertReservation(reservation);
			System.out.println(result);
			return result;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return 0;
	}

	@Override
	public int updateReservation(Reservation reservation) {
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
	
}
