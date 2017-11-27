package noshow.vo;

import java.io.Serializable;

public class Answer implements Serializable{
	private int answerNum; /* 답변일련번호 */
	private int questionNum; /* 문의일련번호 */
	private Date answerDate; /* 작성시간 */
	private String answerContent; /* 답변내용 */
	private String businessId; /* 작성자아이디 */
}
