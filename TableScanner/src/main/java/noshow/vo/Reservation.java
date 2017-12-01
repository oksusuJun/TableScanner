package noshow.vo;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable {
	private int reservationNum; /* 예약리스트번호 */
	private Date reservationDate; /* 예약날짜 */
	private int numberOfPeople; /* 인원 */
	private Date reservationWantedTime; /* 예약원하는시간 */
	private Date reservationPaidTime; /* 예약결제완료한시간 */
	private String reservationPayStatement; /* 결제유무 */
	private int reservationPrice; /* 예약금액 */
	private Member memberId; /* 회원아이디 */
	private Restaurant businessId; /* 점주회원 아이디 */

	public Reservation() {
	}

	public Reservation(int reservationNum, Date reservationDate, int numberOfPeople, Date reservationWantedTime,
			Date reservationPaidTime, String reservationPayStatement, int reservationPrice, Member memberId,
			Restaurant businessId) {
		this.reservationNum = reservationNum;
		this.reservationDate = reservationDate;
		this.numberOfPeople = numberOfPeople;
		this.reservationWantedTime = reservationWantedTime;
		this.reservationPaidTime = reservationPaidTime;
		this.reservationPayStatement = reservationPayStatement;
		this.reservationPrice = reservationPrice;
		this.memberId = memberId;
		this.businessId = businessId;
	}

	public int getReservationNum() {
		return reservationNum;
	}

	public void setReservationNum(int reservationNum) {
		this.reservationNum = reservationNum;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public int getNumberOfPeople() {
		return numberOfPeople;
	}

	public void setNumberOfPeople(int numberOfPeople) {
		this.numberOfPeople = numberOfPeople;
	}

	public Date getReservationWantedTime() {
		return reservationWantedTime;
	}

	public void setReservationWantedTime(Date reservationWantedTime) {
		this.reservationWantedTime = reservationWantedTime;
	}

	public Date getReservationPaidTime() {
		return reservationPaidTime;
	}

	public void setReservationPaidTime(Date reservationPaidTime) {
		this.reservationPaidTime = reservationPaidTime;
	}

	public String getReservationPayStatement() {
		return reservationPayStatement;
	}

	public void setReservationPayStatement(String reservationPayStatement) {
		this.reservationPayStatement = reservationPayStatement;
	}

	public int getReservationPrice() {
		return reservationPrice;
	}

	public void setReservationPrice(int reservationPrice) {
		this.reservationPrice = reservationPrice;
	}

	public Member getMemberId() {
		return memberId;
	}

	public void setMemberId(Member memberId) {
		this.memberId = memberId;
	}

	public Restaurant getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Restaurant businessId) {
		this.businessId = businessId;
	}

	@Override
	public String toString() {
		return "Reservation [reservationNum=" + reservationNum + ", reservationDate=" + reservationDate
				+ ", numberOfPeople=" + numberOfPeople + ", reservationWantedTime=" + reservationWantedTime
				+ ", reservationPaidTime=" + reservationPaidTime + ", reservationPayStatement="
				+ reservationPayStatement + ", reservationPrice=" + reservationPrice + ", memberId=" + memberId
				+ ", businessId=" + businessId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((businessId == null) ? 0 : businessId.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + numberOfPeople;
		result = prime * result + ((reservationDate == null) ? 0 : reservationDate.hashCode());
		result = prime * result + reservationNum;
		result = prime * result + ((reservationPaidTime == null) ? 0 : reservationPaidTime.hashCode());
		result = prime * result + ((reservationPayStatement == null) ? 0 : reservationPayStatement.hashCode());
		result = prime * result + reservationPrice;
		result = prime * result + ((reservationWantedTime == null) ? 0 : reservationWantedTime.hashCode());
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
		Reservation other = (Reservation) obj;
		if (businessId == null) {
			if (other.businessId != null)
				return false;
		} else if (!businessId.equals(other.businessId))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (numberOfPeople != other.numberOfPeople)
			return false;
		if (reservationDate == null) {
			if (other.reservationDate != null)
				return false;
		} else if (!reservationDate.equals(other.reservationDate))
			return false;
		if (reservationNum != other.reservationNum)
			return false;
		if (reservationPaidTime == null) {
			if (other.reservationPaidTime != null)
				return false;
		} else if (!reservationPaidTime.equals(other.reservationPaidTime))
			return false;
		if (reservationPayStatement == null) {
			if (other.reservationPayStatement != null)
				return false;
		} else if (!reservationPayStatement.equals(other.reservationPayStatement))
			return false;
		if (reservationPrice != other.reservationPrice)
			return false;
		if (reservationWantedTime == null) {
			if (other.reservationWantedTime != null)
				return false;
		} else if (!reservationWantedTime.equals(other.reservationWantedTime))
			return false;
		return true;
	}

}
