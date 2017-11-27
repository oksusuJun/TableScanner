package noshow.vo;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable{
	private int boardNum; /* 글번호 */
	private Member memberId; /* 회원아이디 */
	private String boardSubject; /* 제목 */
	private String boardText; /* 내용 */
	private int boardViews; /* 조회수 */
	private Date boardTime; /* 작성시간 */
	public Board() {
	}
	public Board(int boardNum, Member memberId, String boardSubject, String boardText, int boardViews, Date boardTime) {
		this.boardNum = boardNum;
		this.memberId = memberId;
		this.boardSubject = boardSubject;
		this.boardText = boardText;
		this.boardViews = boardViews;
		this.boardTime = boardTime;
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public Member getMemberId() {
		return memberId;
	}
	public void setMemberId(Member memberId) {
		this.memberId = memberId;
	}
	public String getBoardSubject() {
		return boardSubject;
	}
	public void setBoardSubject(String boardSubject) {
		this.boardSubject = boardSubject;
	}
	public String getBoardText() {
		return boardText;
	}
	public void setBoardText(String boardText) {
		this.boardText = boardText;
	}
	public int getBoardViews() {
		return boardViews;
	}
	public void setBoardViews(int boardViews) {
		this.boardViews = boardViews;
	}
	public Date getBoardTime() {
		return boardTime;
	}
	public void setBoardTime(Date boardTime) {
		this.boardTime = boardTime;
	}
	@Override
	public String toString() {
		return "Board [boardNum=" + boardNum + ", memberId=" + memberId + ", boardSubject=" + boardSubject
				+ ", boardText=" + boardText + ", boardViews=" + boardViews + ", boardTime=" + boardTime + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + boardNum;
		result = prime * result + ((boardSubject == null) ? 0 : boardSubject.hashCode());
		result = prime * result + ((boardText == null) ? 0 : boardText.hashCode());
		result = prime * result + ((boardTime == null) ? 0 : boardTime.hashCode());
		result = prime * result + boardViews;
		result = prime * result + ((memberId == null) ? 0 : memberId.hashCode());
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
		Board other = (Board) obj;
		if (boardNum != other.boardNum)
			return false;
		if (boardSubject == null) {
			if (other.boardSubject != null)
				return false;
		} else if (!boardSubject.equals(other.boardSubject))
			return false;
		if (boardText == null) {
			if (other.boardText != null)
				return false;
		} else if (!boardText.equals(other.boardText))
			return false;
		if (boardTime == null) {
			if (other.boardTime != null)
				return false;
		} else if (!boardTime.equals(other.boardTime))
			return false;
		if (boardViews != other.boardViews)
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		return true;
	}
	
	
	
	
}
