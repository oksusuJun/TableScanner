package noshow.vo;

import java.io.Serializable;
import java.util.Date;

public class Review implements Serializable {
	private int reviewNum; /* 후기글번호 */
	private String reviewText; /* 내용 */
	private Date reviewTime; /* 작성시간 */
	private String reviewImg; /* 리뷰사진 */
	private Member memberId; /* 회원아이디 */
	private Restaurant businessId; /* 점주회원 아이디 */
	private Reservation resNum; /* 예약리스트번호 */

	public Review() {}

	public Review(int reviewNum, String reviewText, Date reviewTime, String reviewImg, Member memberId,
			Restaurant businessId, Reservation resNum) {
		this.reviewNum = reviewNum;
		this.reviewText = reviewText;
		this.reviewTime = reviewTime;
		this.reviewImg = reviewImg;
		this.memberId = memberId;
		this.businessId = businessId;
		this.resNum = resNum;
	}

	public int getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(int reviewNum) {
		this.reviewNum = reviewNum;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public Date getReviewTime() {
		return reviewTime;
	}

	public void setReviewTime(Date reviewTime) {
		this.reviewTime = reviewTime;
	}

	public String getReviewImg() {
		return reviewImg;
	}

	public void setReviewImg(String reviewImg) {
		this.reviewImg = reviewImg;
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

	public Reservation getResNum() {
		return resNum;
	}

	public void setResNum(Reservation resNum) {
		this.resNum = resNum;
	}

	@Override
	public String toString() {
		return "Review [reviewNum=" + reviewNum + ", reviewText=" + reviewText + ", reviewTime=" + reviewTime
				+ ", reviewImg=" + reviewImg + ", memberId=" + memberId + ", businessId=" + businessId + ", resNum="
				+ resNum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((businessId == null) ? 0 : businessId.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((resNum == null) ? 0 : resNum.hashCode());
		result = prime * result + ((reviewImg == null) ? 0 : reviewImg.hashCode());
		result = prime * result + reviewNum;
		result = prime * result + ((reviewText == null) ? 0 : reviewText.hashCode());
		result = prime * result + ((reviewTime == null) ? 0 : reviewTime.hashCode());
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
		Review other = (Review) obj;
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
		if (resNum == null) {
			if (other.resNum != null)
				return false;
		} else if (!resNum.equals(other.resNum))
			return false;
		if (reviewImg == null) {
			if (other.reviewImg != null)
				return false;
		} else if (!reviewImg.equals(other.reviewImg))
			return false;
		if (reviewNum != other.reviewNum)
			return false;
		if (reviewText == null) {
			if (other.reviewText != null)
				return false;
		} else if (!reviewText.equals(other.reviewText))
			return false;
		if (reviewTime == null) {
			if (other.reviewTime != null)
				return false;
		} else if (!reviewTime.equals(other.reviewTime))
			return false;
		return true;
	}

	
}
