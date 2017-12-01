package noshow.vo;

import java.io.Serializable;

public class OrderTable implements Serializable{
	private int tableSeq; /* 테이블리스트번호 */
	private int reservationNum; /* 예약리스트번호 */
	
	public OrderTable() {}
	
	public OrderTable(int tableSeq, int reservationNum) {
		this.tableSeq = tableSeq;
		this.reservationNum = reservationNum;
	}
	
	public int getTableSeq() {
		return tableSeq;
	}
	public void setTableSeq(int tableSeq) {
		this.tableSeq = tableSeq;
	}
	public int getReservationNum() {
		return reservationNum;
	}
	public void setReservationNum(int reservationNum) {
		this.reservationNum = reservationNum;
	}
	
	@Override
	public String toString() {
		return "OrderTable [tableSeq=" + tableSeq + ", reservationNum=" + reservationNum + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + reservationNum;
		result = prime * result + tableSeq;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderTable other = (OrderTable) obj;
		if (reservationNum != other.reservationNum)
			return false;
		if (tableSeq != other.tableSeq)
			return false;
		return true;
	}	
	
	
}
