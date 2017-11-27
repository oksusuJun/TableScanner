package noshow.vo;

import java.io.Serializable;
import java.lang.reflect.Member;
import java.sql.Clob;

public class Board implements Serializable{
	private int boardNum; /* 글번호 */
	private Member memberId; /* 회원아이디 */
	private String boardSubject; /* 제목 */
	private String boardContent; /* 내용 */
	private int boardViews; /* 조회수 */
	private Date boardWirtingTime; /* 작성시간 */
}
