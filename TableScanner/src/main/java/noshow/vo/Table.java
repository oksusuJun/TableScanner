package noshow.vo;

import java.io.Serializable;

public class Table implements Serializable{
	private int TabelSeq; /* 테이블리스트 번호*/
	private int tableNum; /* 테이블 번호 */
	private int tableSeats; /* 인원 */
	private int xLocation; /* x좌표 */
	private int yLocation; /* y좌표 */
	private Restaurant businessId; /* 점주 회원 아이디*/
	
	public Table() {}

	public Table(int tabelSeq, int tableNum, int tableSeats, int xLocation, int yLocation, Restaurant businessId) {
		TabelSeq = tabelSeq;
		this.tableNum = tableNum;
		this.tableSeats = tableSeats;
		this.xLocation = xLocation;
		this.yLocation = yLocation;
		this.businessId = businessId;
	}

	public int getTabelSeq() {
		return TabelSeq;
	}

	public void setTabelSeq(int tabelSeq) {
		TabelSeq = tabelSeq;
	}

	public int getTableNum() {
		return tableNum;
	}

	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}

	public int getTableSeats() {
		return tableSeats;
	}

	public void setTableSeats(int tableSeats) {
		this.tableSeats = tableSeats;
	}

	public int getxLocation() {
		return xLocation;
	}

	public void setxLocation(int xLocation) {
		this.xLocation = xLocation;
	}

	public int getyLocation() {
		return yLocation;
	}

	public void setyLocation(int yLocation) {
		this.yLocation = yLocation;
	}

	public Restaurant getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Restaurant businessId) {
		this.businessId = businessId;
	}

	@Override
	public String toString() {
		return "Table [TabelSeq=" + TabelSeq + ", tableNum=" + tableNum + ", tableSeats=" + tableSeats + ", xLocation="
				+ xLocation + ", yLocation=" + yLocation + ", businessId=" + businessId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + TabelSeq;
		result = prime * result + ((businessId == null) ? 0 : businessId.hashCode());
		result = prime * result + tableNum;
		result = prime * result + tableSeats;
		result = prime * result + xLocation;
		result = prime * result + yLocation;
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
		Table other = (Table) obj;
		if (TabelSeq != other.TabelSeq)
			return false;
		if (businessId == null) {
			if (other.businessId != null)
				return false;
		} else if (!businessId.equals(other.businessId))
			return false;
		if (tableNum != other.tableNum)
			return false;
		if (tableSeats != other.tableSeats)
			return false;
		if (xLocation != other.xLocation)
			return false;
		if (yLocation != other.yLocation)
			return false;
		return true;
	}
	
	
	
	
}
