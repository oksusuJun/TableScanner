package noshow.vo;

import java.io.Serializable;

public class Report implements Serializable {
	private int reportNum; /* 신고리스트번호 */
	private String reporterId; /* 신고인아이디 */
	private Review reviewNum; /* 후기 글번호 */

	public Report() {
	}

	public Report(int reportNum, String reporterId, Review reviewNum) {
		this.reportNum = reportNum;
		this.reporterId = reporterId;
		this.reviewNum = reviewNum;
	}

	public int getReportNum() {
		return reportNum;
	}

	public void setReportNum(int reportNum) {
		this.reportNum = reportNum;
	}

	public String getReporterId() {
		return reporterId;
	}

	public void setReporterId(String reporterId) {
		this.reporterId = reporterId;
	}

	public Review getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(Review reviewNum) {
		this.reviewNum = reviewNum;
	}

	@Override
	public String toString() {
		return "Report [reportNum=" + reportNum + ", reporterId=" + reporterId + ", reviewNum=" + reviewNum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + reportNum;
		result = prime * result + ((reporterId == null) ? 0 : reporterId.hashCode());
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
		Report other = (Report) obj;
		if (reportNum != other.reportNum)
			return false;
		if (reporterId == null) {
			if (other.reporterId != null)
				return false;
		} else if (!reporterId.equals(other.reporterId))
			return false;
		if (reviewNum == null) {
			if (other.reviewNum != null)
				return false;
		} else if (!reviewNum.equals(other.reviewNum))
			return false;
		return true;
	}

}
