package noshow.vo;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable{
	private int boardNum; /* 글번호 */
	private Member memberId; /* 회원아이디 */
	private String boardSubject; /* 제목 */
	private String boardContent; /* 내용 */
	private int boardViews; /* 조회수 */
	private Date boardWirtingTime; /* 작성시간 */
	
	public Board() {}
	
	public Board(int boardNum, Member memberId, String boardSubject, String boardContent, int boardViews,
			Date boardWirtingTime) {
		this.boardNum = boardNum;
		this.memberId = memberId;
		this.boardSubject = boardSubject;
		this.boardContent = boardContent;
		this.boardViews = boardViews;
		this.boardWirtingTime = boardWirtingTime;
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

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public int getBoardViews() {
		return boardViews;
	}

	public void setBoardViews(int boardViews) {
		this.boardViews = boardViews;
	}

	public Date getBoardWirtingTime() {
		return boardWirtingTime;
	}

	public void setBoardWirtingTime(Date boardWirtingTime) {
		this.boardWirtingTime = boardWirtingTime;
	}

	@Override
	public String toString() {
		return "Board [boardNum=" + boardNum + ", memberId=" + memberId + ", boardSubject=" + boardSubject
				+ ", boardContent=" + boardContent + ", boardViews=" + boardViews + ", boardWirtingTime="
				+ boardWirtingTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardContent == null) ? 0 : boardContent.hashCode());
		result = prime * result + boardNum;
		result = prime * result + ((boardSubject == null) ? 0 : boardSubject.hashCode());
		result = prime * result + boardViews;
		result = prime * result + ((boardWirtingTime == null) ? 0 : boardWirtingTime.hashCode());
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
		if (boardContent == null) {
			if (other.boardContent != null)
				return false;
		} else if (!boardContent.equals(other.boardContent))
			return false;
		if (boardNum != other.boardNum)
			return false;
		if (boardSubject == null) {
			if (other.boardSubject != null)
				return false;
		} else if (!boardSubject.equals(other.boardSubject))
			return false;
		if (boardViews != other.boardViews)
			return false;
		if (boardWirtingTime == null) {
			if (other.boardWirtingTime != null)
				return false;
		} else if (!boardWirtingTime.equals(other.boardWirtingTime))
			return false;
		if (memberId == null) {
			if (other.memberId != null)
				return false;
		} else if (!memberId.equals(other.memberId))
			return false;
		return true;
	}
	
	
}
