package noshow.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import noshow.reservation.service.ReservationService;
import noshow.vo.Reservation;

@Controller
@RequestMapping("/noshow/")
public class ReservationController {
	
	@Autowired
	private ReservationService service;
	
//	@RequestMapping("addReservation")
//	public String addReservation(@ModelAttribute Reservation reservation) {
//		
//		int result = service.addReservation(reservation);
//		if (result == 1) {
//			System.out.println("예약 성공");
//			return "/view/content/reservation/reservationSuccess.jsp";
//		} else {
//			System.out.println("예약 실패");
//			return "/main.jsp";
//		}
//	}
	
}
