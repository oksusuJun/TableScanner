package noshow.reservation.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import noshow.reservation.dao.ReservationDAO;
import noshow.reservation.service.ReservationService;
import noshow.vo.Reservation;

@Service
public class ReservationServiceImpl implements ReservationService{

	@Resource
	private ReservationDAO dao;
	
	@Override
	public int addReservation(Reservation reservation) {
		return dao.insertReservation(reservation);
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
	
}
