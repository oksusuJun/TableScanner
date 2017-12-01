package noshow.vo;

import java.io.Serializable;

public class Recommend implements Serializable{
	private int recommentNum; /* 추천리스트번호 */
	private String recommenderId; /* 추천인 아이디 */
	private Review reviewNum; /* 후기 글번호 */
	
	public Recommend() {}

	public Recommend(int recommentNum, String recommenderId, Review reviewNum) {
		this.recommentNum = recommentNum;
		this.recommenderId = recommenderId;
		this.reviewNum = reviewNum;
	}

	public int getRecommentNum() {
		return recommentNum;
	}

	public void setRecommentNum(int recommentNum) {
		this.recommentNum = recommentNum;
	}

	public String getRecommenderId() {
		return recommenderId;
	}

	public void setRecommenderId(String recommenderId) {
		this.recommenderId = recommenderId;
	}

	public Review getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(Review reviewNum) {
		this.reviewNum = reviewNum;
	}

	@Override
	public String toString() {
		return "Recommend [recommentNum=" + recommentNum + ", recommenderId=" + recommenderId + ", reviewNum="
				+ reviewNum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((recommenderId == null) ? 0 : recommenderId.hashCode());
		result = prime * result + recommentNum;
		result = prime * result + ((reviewNum == null) ? 0 : reviewNum.hashCode());
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
		Recommend other = (Recommend) obj;
		if (recommenderId == null) {
			if (other.recommenderId != null)
				return false;
		} else if (!recommenderId.equals(other.recommenderId))
			return false;
		if (recommentNum != other.recommentNum)
			return false;
		if (reviewNum == null) {
			if (other.reviewNum != null)
				return false;
		} else if (!reviewNum.equals(other.reviewNum))
			return false;
		return true;
	}

}
