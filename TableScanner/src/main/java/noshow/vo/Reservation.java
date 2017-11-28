package noshow.vo;

import java.io.Serializable;
import java.util.Date;

public class Reservation implements Serializable {
	private int resNum; /* 예약리스트번호 */
	private String resDate; /* 예약날짜 */
	private int resPeople; /* 인원 */
	private String resTime; /* 예약원하는시간 */
	private Date resPaidTime; /* 예약결제완료한시간 */
	private String resPayStatement; /* 결제유무 */
	private int resPrice; /* 예약금액 */
	private String memberId; /* 회원아이디 */
	private String businessId; /* 점주 회원아이디 */
//	private Member memberId; /* 회원아이디 */
//	private Restaurant businessId; /* 점주회원 아이디 */

	private Member member;
	
	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Reservation() {
	}

	public Reservation(int resNum, String resDate, int resPeople, String resTime, Date resPaidTime, String resPayStatement,
			int resPrice, String memberId, String businessId) {
		this.resNum = resNum;
		this.resDate = resDate;
		this.resPeople = resPeople;
		this.resTime = resTime;
		this.resPaidTime = resPaidTime;
		this.resPayStatement = resPayStatement;
		this.resPrice = resPrice;
		this.memberId = memberId;
		this.businessId = businessId;
	}

	public int getResNum() {
		return resNum;
	}

	public void setResNum(int resNum) {
		this.resNum = resNum;
	}

	public String getResDate() {
		return resDate;
	}

	public void setResDate(String resDate) {
		this.resDate = resDate;
	}

	public int getResPeople() {
		return resPeople;
	}

	public void setResPeople(int resPeople) {
		this.resPeople = resPeople;
	}

	public String getResTime() {
		return resTime;
	}

	public void setResTime(String resTime) {
		this.resTime = resTime;
	}

	public Date getResPaidTime() {
		return resPaidTime;
	}

	public void setResPaidTime(Date resPaidTime) {
		this.resPaidTime = resPaidTime;
	}

	public String getResPayStatement() {
		return resPayStatement;
	}

	public void setResPayStatement(String resPayStatement) {
		this.resPayStatement = resPayStatement;
	}

	public int getResPrice() {
		return resPrice;
	}

	public void setResPrice(int resPrice) {
		this.resPrice = resPrice;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	@Override
	public String toString() {
		return "Reservation [resNum=" + resNum + ", resDate=" + resDate + ", resPeople=" + resPeople + ", resTime="
				+ resTime + ", resPaidTime=" + resPaidTime + ", resPayStatement=" + resPayStatement + ", resPrice="
				+ resPrice + ", memberId=" + memberId + ", businessId=" + businessId + ", member=" + member + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((businessId == null) ? 0 : businessId.hashCode());
		result = prime * result + ((member == null) ? 0 : member.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((resDate == null) ? 0 : resDate.hashCode());
		result = prime * result + resNum;
		result = prime * result + ((resPaidTime == null) ? 0 : resPaidTime.hashCode());
		result = prime * result + ((resPayStatement == null) ? 0 : resPayStatement.hashCode());
		result = prime * result + resPeople;
		result = prime * result + resPrice;
		result = prime * result + ((resTime == null) ? 0 : resTime.hashCode());
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
		if (member == null) {
			if (other.member != null)
				return false;
		} else if (!member.equals(other.member))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (resDate == null) {
			if (other.resDate != null)
				return false;
		} else if (!resDate.equals(other.resDate))
			return false;
		if (resNum != other.resNum)
			return false;
		if (resPaidTime == null) {
			if (other.resPaidTime != null)
				return false;
		} else if (!resPaidTime.equals(other.resPaidTime))
			return false;
		if (resPayStatement == null) {
			if (other.resPayStatement != null)
				return false;
		} else if (!resPayStatement.equals(other.resPayStatement))
			return false;
		if (resPeople != other.resPeople)
			return false;
		if (resPrice != other.resPrice)
			return false;
		if (resTime == null) {
			if (other.resTime != null)
				return false;
		} else if (!resTime.equals(other.resTime))
			return false;
		return true;
	}

	

}
