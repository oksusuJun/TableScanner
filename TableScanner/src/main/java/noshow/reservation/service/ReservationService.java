package noshow.reservation.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import noshow.vo.OrderTable;
import noshow.vo.Reservation;

public interface ReservationService {

	/* ##### ReservationService ##### */
	int addReservation(int resNum, String resDate, int resPeople, String resStartTime, String resEndTime,
			Date resPaidTime, String resPayStatement, int resPrice, String memberId, String businessId, int tableSeq);

	int updateReservation(Reservation reservation, Map<String, OrderTable> orderTableMap);

	int deleteReservation(int resNum);

	List<Reservation> selectReservationByMemberId(String memberId);

	List<Reservation> selectReservationByBusinessId(String businessId);
	
	int selectResNumByReservationInfo(String memberId, String businessId, String resStartTime);

	/* ##### OrderTableService ##### */
	int addOrderTable(int tableSeq, int resNum);

	int updateOrderTable(Map<String, OrderTable> orderTableMap);

	int deleteOrderTable(int resNum);

	List<OrderTable> selectOrderTableByResNum(int resNum);
}
