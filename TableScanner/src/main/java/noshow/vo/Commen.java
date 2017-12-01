package noshow.vo;

import java.io.Serializable;
import java.util.Date;

public class Commen implements Serializable{
	private int commenNum; /* 댓글일련번호 */
	private Board boardNum; /* 글번호 */
	private String writerId; /* 작성자 아이디 */
	private String commenContext; /* 댓글내용 */
	private Date commenWritingTime; /* 작성시간 */
	
	public Commen() {}
	
	public Commen(int commenNum, Board boardNum, String writerId, String commenContext, Date commenWritingTime) {
		this.commenNum = commenNum;
		this.boardNum = boardNum;
		this.writerId = writerId;
		this.commenContext = commenContext;
		this.commenWritingTime = commenWritingTime;
	}

	public int getCommenNum() {
		return commenNum;
	}

	public void setCommenNum(int commenNum) {
		this.commenNum = commenNum;
	}

	public Board getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(Board boardNum) {
		this.boardNum = boardNum;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	public String getCommenContext() {
		return commenContext;
	}

	public void setCommenContext(String commenContext) {
		this.commenContext = commenContext;
	}

	public Date getCommenWritingTime() {
		return commenWritingTime;
	}

	public void setCommenWritingTime(Date commenWritingTime) {
		this.commenWritingTime = commenWritingTime;
	}

	@Override
	public String toString() {
		return "Commen [commenNum=" + commenNum + ", boardNum=" + boardNum + ", writerId=" + writerId
				+ ", commenContext=" + commenContext + ", commenWritingTime=" + commenWritingTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardNum == null) ? 0 : boardNum.hashCode());
		result = prime * result + ((commenContext == null) ? 0 : commenContext.hashCode());
		result = prime * result + commenNum;
		result = prime * result + ((commenWritingTime == null) ? 0 : commenWritingTime.hashCode());
		result = prime * result + ((writerId == null) ? 0 : writerId.hashCode());
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
		Commen other = (Commen) obj;
		if (boardNum == null) {
			if (other.boardNum != null)
				return false;
		} else if (!boardNum.equals(other.boardNum))
			return false;
		if (commenContext == null) {
			if (other.commenContext != null)
				return false;
		} else if (!commenContext.equals(other.commenContext))
			return false;
		if (commenNum != other.commenNum)
			return false;
		if (commenWritingTime == null) {
			if (other.commenWritingTime != null)
				return false;
		} else if (!commenWritingTime.equals(other.commenWritingTime))
			return false;
		if (writerId == null) {
			if (other.writerId != null)
				return false;
		} else if (!writerId.equals(other.writerId))
			return false;
		return true;
	}
	
	
}
