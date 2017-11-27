package noshow.vo;

import java.io.Serializable;
import java.util.Date;

public class Answer implements Serializable{
	private int answerNum; /* 답변일련번호 */
	private Question questionNum; /* 문의일련번호 */
	private Date answerDate; /* 작성시간 */
	private String answerText; /* 답변내용 */
	private String businessId; /* 작성자아이디 */
	
	public Answer() {}
	
	public Answer(int answerNum, Question questionNum, Date answerDate, String answerText, String businessId) {
		this.answerNum = answerNum;
		this.questionNum = questionNum;
		this.answerDate = answerDate;
		this.answerText = answerText;
		this.businessId = businessId;
	}


}
