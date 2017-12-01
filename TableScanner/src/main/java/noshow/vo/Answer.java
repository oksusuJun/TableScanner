package noshow.vo;

import java.io.Serializable;
import java.util.Date;

public class Answer implements Serializable{
	private int answerNum; /* 답변일련번호 */
	private int questionNum; /* 문의일련번호 */
	private Date answerDate; /* 작성시간 */
	private String answerContent; /* 답변내용 */
	private String businessId; /* 작성자아이디 */
	public Answer() {
	}
	public Answer(int answerNum, int questionNum, Date answerDate, String answerContent, String businessId) {
		this.answerNum = answerNum;
		this.questionNum = questionNum;
		this.answerDate = answerDate;
		this.answerContent = answerContent;
		this.businessId = businessId;
	}
	public int getAnswerNum() {
		return answerNum;
	}
	public void setAnswerNum(int answerNum) {
		this.answerNum = answerNum;
	}
	public int getQuestionNum() {
		return questionNum;
	}
	public void setQuestionNum(int questionNum) {
		this.questionNum = questionNum;
	}
	public Date getAnswerDate() {
		return answerDate;
	}
	public void setAnswerDate(Date answerDate) {
		this.answerDate = answerDate;
	}
	public String getAnswerContent() {
		return answerContent;
	}
	public void setAnswerContent(String answerContent) {
		this.answerContent = answerContent;
	}
	public String getBusinessId() {
		return businessId;
	}
	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}
	@Override
	public String toString() {
		return "Answer [answerNum=" + answerNum + ", questionNum=" + questionNum + ", answerDate=" + answerDate
				+ ", answerContent=" + answerContent + ", businessId=" + businessId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((answerContent == null) ? 0 : answerContent.hashCode());
		result = prime * result + ((answerDate == null) ? 0 : answerDate.hashCode());
		result = prime * result + answerNum;
		result = prime * result + ((businessId == null) ? 0 : businessId.hashCode());
		result = prime * result + questionNum;
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
		Answer other = (Answer) obj;
		if (answerContent == null) {
			if (other.answerContent != null)
				return false;
		} else if (!answerContent.equals(other.answerContent))
			return false;
		if (answerDate == null) {
			if (other.answerDate != null)
				return false;
		} else if (!answerDate.equals(other.answerDate))
			return false;
		if (answerNum != other.answerNum)
			return false;
		if (businessId == null) {
			if (other.businessId != null)
				return false;
		} else if (!businessId.equals(other.businessId))
			return false;
		if (questionNum != other.questionNum)
			return false;
		return true;
	}
	
	
}
