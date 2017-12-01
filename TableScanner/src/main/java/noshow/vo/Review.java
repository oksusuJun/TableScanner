package noshow.vo;

import java.io.Serializable;
import java.util.Date;

public class Review implements Serializable {
	private int reviewNum; /* 후기글번호 */
	private String reviewContent; /* 내용 */
	private Date reviewWriteTime; /* 작성시간 */
	private String reviewImage; /* 리뷰사진 */
	private Member memberId; /* 회원아이디 */
	private Restaurant businessId; /* 점주회원 아이디 */
	private Reservation reservationNum; /* 예약리스트번호 */

	public Review() {
	}

	public Review(int reviewNum, String reviewContent, Date reviewWriteTime, String reviewImage, Member memberId,
			Restaurant businessId, Reservation reservationNum) {
		this.reviewNum = reviewNum;
		this.reviewContent = reviewContent;
		this.reviewWriteTime = reviewWriteTime;
		this.reviewImage = reviewImage;
		this.memberId = memberId;
		this.businessId = businessId;
		this.reservationNum = reservationNum;
	}

	public int getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(int reviewNum) {
		this.reviewNum = reviewNum;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public Date getReviewWriteTime() {
		return reviewWriteTime;
	}

	public void setReviewWriteTime(Date reviewWriteTime) {
		this.reviewWriteTime = reviewWriteTime;
	}

	public String getReviewImage() {
		return reviewImage;
	}

	public void setReviewImage(String reviewImage) {
		this.reviewImage = reviewImage;
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

	public Reservation getReservationNum() {
		return reservationNum;
	}

	public void setReservationNum(Reservation reservationNum) {
		this.reservationNum = reservationNum;
	}

	@Override
	public String toString() {
		return "Review [reviewNum=" + reviewNum + ", reviewContent=" + reviewContent + ", reviewWriteTime="
				+ reviewWriteTime + ", reviewImage=" + reviewImage + ", memberId=" + memberId + ", businessId="
				+ businessId + ", reservationNum=" + reservationNum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((businessId == null) ? 0 : businessId.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + ((reservationNum == null) ? 0 : reservationNum.hashCode());
		result = prime * result + ((reviewContent == null) ? 0 : reviewContent.hashCode());
		result = prime * result + ((reviewImage == null) ? 0 : reviewImage.hashCode());
		result = prime * result + reviewNum;
		result = prime * result + ((reviewWriteTime == null) ? 0 : reviewWriteTime.hashCode());
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
		if (reservationNum == null) {
			if (other.reservationNum != null)
				return false;
		} else if (!reservationNum.equals(other.reservationNum))
			return false;
		if (reviewContent == null) {
			if (other.reviewContent != null)
				return false;
		} else if (!reviewContent.equals(other.reviewContent))
			return false;
		if (reviewImage == null) {
			if (other.reviewImage != null)
				return false;
		} else if (!reviewImage.equals(other.reviewImage))
			return false;
		if (reviewNum != other.reviewNum)
			return false;
		if (reviewWriteTime == null) {
			if (other.reviewWriteTime != null)
				return false;
		} else if (!reviewWriteTime.equals(other.reviewWriteTime))
			return false;
		return true;
	}

}
