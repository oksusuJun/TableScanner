package noshow.vo;

import java.io.Serializable;

public class Report implements Serializable {
	private int reportNum; /* 신고리스트번호 */
	private String reportId; /* 신고인아이디 */
	private Review reviewNum; /* 후기 글번호 */

	public Report() {
	}

	public Report(int reportNum, String reportId, Review reviewNum) {
		this.reportNum = reportNum;
		this.reportId = reportId;
		this.reviewNum = reviewNum;
	}

	public int getReportNum() {
		return reportNum;
	}

	public void setReportNum(int reportNum) {
		this.reportNum = reportNum;
	}

	public String getReportId() {
		return reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public Review getReviewNum() {
		return reviewNum;
	}

	public void setReviewNum(Review reviewNum) {
		this.reviewNum = reviewNum;
	}

	@Override
	public String toString() {
		return "Report [reportNum=" + reportNum + ", reportId=" + reportId + ", reviewNum=" + reviewNum + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((reportId == null) ? 0 : reportId.hashCode());
		result = prime * result + reportNum;
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
		if (reportId == null) {
			if (other.reportId != null)
				return false;
		} else if (!reportId.equals(other.reportId))
			return false;
		if (reportNum != other.reportNum)
			return false;
		if (reviewNum == null) {
			if (other.reviewNum != null)
				return false;
		} else if (!reviewNum.equals(other.reviewNum))
			return false;
		return true;
	}

	
}
