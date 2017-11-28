package noshow.reservation.dao;

import java.util.List;

import noshow.vo.Reservation;

public interface ReservationDAO {

	/**
	 *  reservation 추가
	 * @param reservation
	 * @return
	 */
	int insertReservation(Reservation reservation);
	
	/**
	 * 예약번호로 조회하여 예약정보 변경
	 * -> 예약날짜, 시간, 인원만 변경 가능하게 해놓음
	 * @param reservation
	 * @return
	 */
	int updateReservationByResNum(Reservation reservation);
	
	/**
	 * 예약번호로 예약정보 삭제 (예약취소)
	 * @param reservation
	 * @return
	 */
	int deleteReservationByResNum(int resNum);
	
	/**
	 * 회원ID 로 예약내역 조회
	 * @param memberId
	 * @return
	 */
	List<Reservation> selectReservationByMemberId(String memberId);
}
