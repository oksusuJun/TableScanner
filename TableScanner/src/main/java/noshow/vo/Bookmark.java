package noshow.vo;

import java.io.Serializable;

public class Bookmark implements Serializable{
	private String bookmarkNum; /* 즐겨찾기 리스트번호 */
	private Member memberId; /* 회원아이디 */
	private String businessId; /* 점주회원아이디 */
	
	public Bookmark() {}

	public Bookmark(String bookmarkNum, Member memberId, String businessId) {
		this.bookmarkNum = bookmarkNum;
		this.memberId = memberId;
		this.businessId = businessId;
	}

	public String getBookmarkNum() {
		return bookmarkNum;
	}

	public void setBookmarkNum(String bookmarkNum) {
		this.bookmarkNum = bookmarkNum;
	}

	public Member getMemberId() {
		return memberId;
	}

	public void setMemberId(Member memberId) {
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
		return "Bookmark [bookmarkNum=" + bookmarkNum + ", memberId=" + memberId + ", businessId=" + businessId + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bookmarkNum == null) ? 0 : bookmarkNum.hashCode());
		result = prime * result + ((businessId == null) ? 0 : businessId.hashCode());
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
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
		Bookmark other = (Bookmark) obj;
		if (bookmarkNum == null) {
			if (other.bookmarkNum != null)
				return false;
		} else if (!bookmarkNum.equals(other.bookmarkNum))
			return false;
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
		return true;
	}

	

	
}
