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
		int rt_term = restaurant.getRtTerm();
		int totalPrice = resPeople * restaurant.getRtDeposit();
		
		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date formatDate;
		try {
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
