package noshow.vo;

import java.io.Serializable;
import java.util.Date;

public class Question implements Serializable{
	private int questionNum; /* 문의일련번호 */
	private Member memberId; /* 회원아이디 */
	private String questionText; /* 내용 */
	private Date questionTime; /* 작성시간 */
	
	public Question() {}

	public Question(int questionNum, Member memberId, String questionText, Date questionTime) {
		this.questionNum = questionNum;
		this.memberId = memberId;
		this.questionText = questionText;
		this.questionTime = questionTime;
	}

	public int getQuestionNum() {
		return questionNum;
	}

	public void setQuestionNum(int questionNum) {
		this.questionNum = questionNum;
	}

	public Member getMemberId() {
		return memberId;
	}

	public void setMemberId(Member memberId) {
		this.memberId = memberId;
	}

	public String getQuestionText() {
		return questionText;
	}

	public void setQuestionText(String questionText) {
		this.questionText = questionText;
	}

	public Date getQuestionTime() {
		return questionTime;
	}

	public void setQuestionTime(Date questionTime) {
		this.questionTime = questionTime;
	}

	@Override
	public String toString() {
		return "Question [questionNum=" + questionNum + ", memberId=" + memberId + ", questionText=" + questionText
				+ ", questionTime=" + questionTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
		result = prime * result + questionNum;
		result = prime * result + ((questionText == null) ? 0 : questionText.hashCode());
		result = prime * result + ((questionTime == null) ? 0 : questionTime.hashCode());
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
		Question other = (Question) obj;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		if (questionNum != other.questionNum)
			return false;
		if (questionText == null) {
			if (other.questionText != null)
				return false;
		} else if (!questionText.equals(other.questionText))
			return false;
		if (questionTime == null) {
			if (other.questionTime != null)
				return false;
		} else if (!questionTime.equals(other.questionTime))
			return false;
		return true;
	}
	
	
	
}
