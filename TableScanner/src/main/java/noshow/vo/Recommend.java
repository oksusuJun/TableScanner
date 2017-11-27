package noshow.vo;

import java.io.Serializable;

public class Recommend implements Serializable{
	private int recommendNum; /* 추천리스트번호 */
	private String recommendId; /* 추천인 아이디 */
	private Review reviewNum; /* 후기 글번호 */
	
	public Recommend() {}

	public Recommend(int recommendNum, String recommendId, Review reviewNum) {
		this.recommendNum = recommendNum;
		this.recommendId = recommendId;
		this.reviewNum = reviewNum;
	}

	public int getRecommendNum() {
		return recommendNum;
	}

	public void setRecommendNum(int recommendNum) {
		this.recommendNum = recommendNum;
	}

	public String getRecommendId() {
		return recommendId;
	}

	public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}

	public Review getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(Review reviewNum) {
		this.reviewNum = reviewNum;
	}

	@Override
	public String toString() {
		return "Recommend [recommendNum=" + recommendNum + ", recommendId=" + recommendId + ", reviewNum=" + reviewNum
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((recommendId == null) ? 0 : recommendId.hashCode());
		result = prime * result + recommendNum;
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
		if (recommendId == null) {
			if (other.recommendId != null)
				return false;
		} else if (!recommendId.equals(other.recommendId))
			return false;
		if (recommendNum != other.recommendNum)
			return false;
		if (reviewNum == null) {
			if (other.reviewNum != null)
				return false;
		} else if (!reviewNum.equals(other.reviewNum))
			return false;
		return true;
	}

	
}
