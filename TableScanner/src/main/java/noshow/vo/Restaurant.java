package noshow.vo;

import java.io.Serializable;
import java.util.Date;

public class Restaurant implements Serializable{
	private String businessId;
	private int rtNum; /* 사업자 번호 */
	private String rtName; /* 음식점 명 */
	private String rtTel; /* 음식점 전화번호 */
	private String rtField; /* 업종 */
	private String rtHoliday; /* 휴무일 */
	private Date rtOpen; /* 오픈시간 */
	private Date rtClose; /* close 시간 */
	private Date term;  /* 테이블 이용시간 */
	private String rtImg; /* 음식점 사진 이름*/
	private String rtSaveImg; /* 저장 이름 */
	private String rtAddress; /* 음식점 위치*/
	private int rtCapacity; /* 수용가능인원 */
	private int rtDeposit; /* 1인 금액 */
	
	private Member business; /* 점주 회원 아이디 */
	
	public Restaurant() {}

	public Restaurant(String businessId, int rtNum, String rtName, String rtTel, String rtField, String rtHoliday,
			Date rtOpen, Date rtClose, Date term, String rtImg, String rtSaveImg, String rtAddress, int rtCapacity,
			int rtDeposit, Member business) {
		this.businessId = businessId;
		this.rtNum = rtNum;
		this.rtName = rtName;
		this.rtTel = rtTel;
		this.rtField = rtField;
		this.rtHoliday = rtHoliday;
		this.rtOpen = rtOpen;
		this.rtClose = rtClose;
		this.term = term;
		this.rtImg = rtImg;
		this.rtSaveImg = rtSaveImg;
		this.rtAddress = rtAddress;
		this.rtCapacity = rtCapacity;
		this.rtDeposit = rtDeposit;
		this.business = business;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public int getRtNum() {
		return rtNum;
	}

	public void setRtNum(int rtNum) {
		this.rtNum = rtNum;
	}

	public String getRtName() {
		return rtName;
	}

	public void setRtName(String rtName) {
		this.rtName = rtName;
	}

	public String getRtTel() {
		return rtTel;
	}

	public void setRtTel(String rtTel) {
		this.rtTel = rtTel;
	}

	public String getRtField() {
		return rtField;
	}

	public void setRtField(String rtField) {
		this.rtField = rtField;
	}

	public String getRtHoliday() {
		return rtHoliday;
	}

	public void setRtHoliday(String rtHoliday) {
		this.rtHoliday = rtHoliday;
	}

	public Date getRtOpen() {
		return rtOpen;
	}

	public void setRtOpen(Date rtOpen) {
		this.rtOpen = rtOpen;
	}

	public Date getRtClose() {
		return rtClose;
	}

	public void setRtClose(Date rtClose) {
		this.rtClose = rtClose;
	}

	public Date getTerm() {
		return term;
	}

	public void setTerm(Date term) {
		this.term = term;
	}

	public String getRtImg() {
		return rtImg;
	}

	public void setRtImg(String rtImg) {
		this.rtImg = rtImg;
	}

	public String getRtSaveImg() {
		return rtSaveImg;
	}

	public void setRtSaveImg(String rtSaveImg) {
		this.rtSaveImg = rtSaveImg;
	}

	public String getRtAddress() {
		return rtAddress;
	}

	public void setRtAddress(String rtAddress) {
		this.rtAddress = rtAddress;
	}

	public int getRtCapacity() {
		return rtCapacity;
	}

	public void setRtCapacity(int rtCapacity) {
		this.rtCapacity = rtCapacity;
	}

	public int getRtDeposit() {
		return rtDeposit;
	}

	public void setRtDeposit(int rtDeposit) {
		this.rtDeposit = rtDeposit;
	}

	public Member getBusiness() {
		return business;
	}

	public void setBusiness(Member business) {
		this.business = business;
	}

	@Override
	public String toString() {
		return "Restaurant [businessId=" + businessId + ", rtNum=" + rtNum + ", rtName=" + rtName + ", rtTel=" + rtTel
				+ ", rtField=" + rtField + ", rtHoliday=" + rtHoliday + ", rtOpen=" + rtOpen + ", rtClose=" + rtClose
				+ ", term=" + term + ", rtImg=" + rtImg + ", rtSaveImg=" + rtSaveImg + ", rtAddress=" + rtAddress
				+ ", rtCapacity=" + rtCapacity + ", rtDeposit=" + rtDeposit + ", business=" + business + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((business == null) ? 0 : business.hashCode());
		result = prime * result + ((businessId == null) ? 0 : businessId.hashCode());
		result = prime * result + ((rtAddress == null) ? 0 : rtAddress.hashCode());
		result = prime * result + rtCapacity;
		result = prime * result + ((rtClose == null) ? 0 : rtClose.hashCode());
		result = prime * result + rtDeposit;
		result = prime * result + ((rtField == null) ? 0 : rtField.hashCode());
		result = prime * result + ((rtHoliday == null) ? 0 : rtHoliday.hashCode());
		result = prime * result + ((rtImg == null) ? 0 : rtImg.hashCode());
		result = prime * result + ((rtName == null) ? 0 : rtName.hashCode());
		result = prime * result + rtNum;
		result = prime * result + ((rtOpen == null) ? 0 : rtOpen.hashCode());
		result = prime * result + ((rtSaveImg == null) ? 0 : rtSaveImg.hashCode());
		result = prime * result + ((rtTel == null) ? 0 : rtTel.hashCode());
		result = prime * result + ((term == null) ? 0 : term.hashCode());
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
		Restaurant other = (Restaurant) obj;
		if (business == null) {
			if (other.business != null)
				return false;
		} else if (!business.equals(other.business))
			return false;
		if (businessId == null) {
			if (other.businessId != null)
				return false;
		} else if (!businessId.equals(other.businessId))
			return false;
		if (rtAddress == null) {
			if (other.rtAddress != null)
				return false;
		} else if (!rtAddress.equals(other.rtAddress))
			return false;
		if (rtCapacity != other.rtCapacity)
			return false;
		if (rtClose == null) {
			if (other.rtClose != null)
				return false;
		} else if (!rtClose.equals(other.rtClose))
			return false;
		if (rtDeposit != other.rtDeposit)
			return false;
		if (rtField == null) {
			if (other.rtField != null)
				return false;
		} else if (!rtField.equals(other.rtField))
			return false;
		if (rtHoliday == null) {
			if (other.rtHoliday != null)
				return false;
		} else if (!rtHoliday.equals(other.rtHoliday))
			return false;
		if (rtImg == null) {
			if (other.rtImg != null)
				return false;
		} else if (!rtImg.equals(other.rtImg))
			return false;
		if (rtName == null) {
			if (other.rtName != null)
				return false;
		} else if (!rtName.equals(other.rtName))
			return false;
		if (rtNum != other.rtNum)
			return false;
		if (rtOpen == null) {
			if (other.rtOpen != null)
				return false;
		} else if (!rtOpen.equals(other.rtOpen))
			return false;
		if (rtSaveImg == null) {
			if (other.rtSaveImg != null)
				return false;
		} else if (!rtSaveImg.equals(other.rtSaveImg))
			return false;
		if (rtTel == null) {
			if (other.rtTel != null)
				return false;
		} else if (!rtTel.equals(other.rtTel))
			return false;
		if (term == null) {
			if (other.term != null)
				return false;
		} else if (!term.equals(other.term))
			return false;
		return true;
	}

	
}
