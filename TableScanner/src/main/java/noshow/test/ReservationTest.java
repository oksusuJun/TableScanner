package noshow.test;

import java.text.SimpleDateFormat;
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

		SimpleDateFormat dateForm = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		Date today = new Date();

		Reservation reservation1 = new Reservation(104, "2017/12/02", 2, "2017/12/02 12:00:00", today, "카드결제", 10000, "id-12", "id-1");
		System.out.println(reservation1);
		int result = service.addReservation(reservation1);
		System.out.println(result);
		
		List<Reservation> list = service.selectReservationByMemberId(reservation1.getMemberId());
		for(Reservation res : list) {
			System.out.println(res);
		}
		
		int deleteResult = service.deleteReservation(103);
		System.out.println(deleteResult);
	}
}
