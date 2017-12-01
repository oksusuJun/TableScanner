package noshow.vo;

import java.io.Serializable;

public class Table implements Serializable{
	private int TabelSeq; /* 테이블리스트 번호*/
	private int tableNum; /* 테이블 번호 */
	private int tableSeats; /* 인원 */
	private int Latitude; /* x좌표 */
	private int Longitude; /* y좌표 */
	private Restaurant businessId; /* 점주 회원 아이디*/
	public Table() {
	}
	public Table(int tabelSeq, int tableNum, int tableSeats, int latitude, int longitude, Restaurant businessId) {
		TabelSeq = tabelSeq;
		this.tableNum = tableNum;
		this.tableSeats = tableSeats;
		Latitude = latitude;
		Longitude = longitude;
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
	public int getLatitude() {
		return Latitude;
	}
	public void setLatitude(int latitude) {
		Latitude = latitude;
	}
	public int getLongitude() {
		return Longitude;
	}
	public void setLongitude(int longitude) {
		Longitude = longitude;
	}
	public Restaurant getBusinessId() {
		return businessId;
	}
	public void setBusinessId(Restaurant businessId) {
		this.businessId = businessId;
	}
	@Override
	public String toString() {
		return "Table [TabelSeq=" + TabelSeq + ", tableNum=" + tableNum + ", tableSeats=" + tableSeats + ", Latitude="
				+ Latitude + ", Longitude=" + Longitude + ", businessId=" + businessId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Latitude;
		result = prime * result + Longitude;
		result = prime * result + TabelSeq;
		result = prime * result + ((businessId == null) ? 0 : businessId.hashCode());
		result = prime * result + tableNum;
		result = prime * result + tableSeats;
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
		if (Latitude != other.Latitude)
			return false;
		if (Longitude != other.Longitude)
			return false;
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
		return true;
	}
	
	
}
