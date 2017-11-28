package noshow.reservation.service;

import java.util.List;

import noshow.vo.Reservation;

public interface ReservationService {
	
	int addReservation(Reservation reservation);
	
	int updateReservation(Reservation reservation);
	
	int deleteReservation(int resNum);
	
	List<Reservation> selectReservationByMemberId(String memberId);
}
