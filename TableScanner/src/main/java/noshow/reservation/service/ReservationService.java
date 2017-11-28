package noshow.reservation.service;

import java.util.Date;
import java.util.List;

import noshow.vo.Reservation;

public interface ReservationService {
	
	int addReservation(int resNum, String resDate, int resPeople, String resStartTime, String resEndTime, Date resPaidTime, String resPayStatement,
			int resPrice, String memberId, String businessId);
	
	int updateReservation(Reservation reservation);
	
	int deleteReservation(int resNum);
	
	List<Reservation> selectReservationByMemberId(String memberId);
	
	List<Reservation> selectReservationByBusinessId(String businessId);
}
