package noshow.vo;

import java.io.Serializable;
import java.lang.reflect.Member;

public class Bookmark implements Serializable{
	private String bookmarkNum; /* 즐겨찾기 리스트번호 */
	private Member memberId; /* 회원아이디 */
	private String businessId; /* 점주회원아이디 */
}
