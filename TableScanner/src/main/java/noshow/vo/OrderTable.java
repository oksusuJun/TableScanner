package noshow.vo;

import java.io.Serializable;

public class OrderTable implements Serializable{
	private Table tableSeq; /* 테이블리스트번호 */
	private Reservation resNum; /* 예약리스트번호 */
	
	public OrderTable() {}

	public OrderTable(Table tableSeq, Reservation resNum) {
		this.tableSeq = tableSeq;
		this.resNum = resNum;
	}

	public Table getTableSeq() {
		return tableSeq;
	}

	public void setTableSeq(Table tableSeq) {
		this.tableSeq = tableSeq;
	}

	public Reservation getResNum() {
		return resNum;
	}

	public void setResNum(Reservation resNum) {
		this.resNum = resNum;
	}

	@Override
	public String toString() {
		return "OrderTable [tableSeq=" + tableSeq + ", resNum=" + resNum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((resNum == null) ? 0 : resNum.hashCode());
		result = prime * result + ((tableSeq == null) ? 0 : tableSeq.hashCode());
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
		if (resNum == null) {
			if (other.resNum != null)
				return false;
		} else if (!resNum.equals(other.resNum))
			return false;
		if (tableSeq == null) {
			if (other.tableSeq != null)
				return false;
		} else if (!tableSeq.equals(other.tableSeq))
			return false;
		return true;
	}

	
	
	
	
}
