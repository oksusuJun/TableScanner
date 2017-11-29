package noshow.test;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import noshow.reservation.service.ReservationService;
import noshow.vo.Reservation;

public class ReservationTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("noshow/config/spring/model-context.xml");

		ReservationService service = (ReservationService) ctx.getBean("reservationServiceImpl");

		Date today = new Date();
		
		int resNum = 110;
		String resDate = "2017/12/02";
		int resPeople = 2;
		String resStartTime = "2017/12/02 17:00:00";
		String resEndTime = resStartTime;
		Date resPaidTime = new Date();
		String resPayStatement = "카드결제";
		int resPrice = 0;
		String memberId = "id-9";
		String businessId = "id-3";
		
		
		Reservation reservation1 = new Reservation(106, "2017/12/02", 2, "2017/12/02 14:00:00", "2017/12/02 16:00:00", today, "카드결제", 10000, "id-13", "id-1");
//		System.out.println(reservation1);
		int result = service.addReservation(resNum, resDate, resPeople, resStartTime, resEndTime, resPaidTime, resPayStatement, resPrice, memberId, businessId);
		System.out.println(result);
		
		List<Reservation> list = service.selectReservationByMemberId(reservation1.getMemberId());
//		for(Reservation res : list) {
//			System.out.println(res);
//		}
		
		businessId = "id-3";
		list = service.selectReservationByBusinessId(businessId);
		for(Reservation res : list) {
			System.out.println(res);
		}
//		
//		int deleteResult = service.deleteReservation(103);
//		System.out.println(deleteResult);
	}
}
