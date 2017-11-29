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
		
		/* dummy - 실 적용시 파라미터가 될 것 */
		int resNum = 116;
		String resDate = "2017/12/05";
		int resPeople = 2;
		String resStartTime = "2017/12/05 12:00:00";
		String resEndTime = resStartTime;
		Date resPaidTime = new Date();
		String resPayStatement = "카드결제";
		int resPrice = 0;
		String memberId = "id-7";
		String businessId = "id-1";
		int orderTableSeq = 6;
		
		/* 예약 추가 */
		Reservation reservation1 = new Reservation(113, "2017/12/02", 4, "2017/12/02 14:00:00", "2017/12/02 16:00:00", today, "카드결제", 10000, "id-13", "id-3");
//		System.out.println(reservation1);
		int result = service.addReservation(resNum, resDate, resPeople, resStartTime, resEndTime, resPaidTime, resPayStatement, resPrice, memberId, businessId, orderTableSeq);
		if (result == 2) {
			System.out.println("예약 + 예약테이블 insert 성공!! : " + result);
		} else {
			System.out.println("뭔가 잘못되었다......" + result);
		}
	
		
		/* 회원ID로 예약조회 */
		List<Reservation> list = service.selectReservationByMemberId(reservation1.getMemberId());
//		for(Reservation res : list) {
//			System.out.println(res);
//		}
		
		/* 사업자ID로 예약조회 */
//		businessId = "id-2";
		list = service.selectReservationByBusinessId(businessId);
		for(Reservation res : list) {
			System.out.println(res);
		}
//		
//		int deleteResult = service.deleteReservation(103);
//		System.out.println(deleteResult);
	}
}
