package noshow.vo;

import java.io.Serializable;
import java.util.Date;

public class Commen implements Serializable{
	private int commenNum; /* 댓글일련번호 */
	private Board boardNum; /* 글번호 */
	private String commenId; /* 작성자 아이디 */
	private String commenText; /* 댓글내용 */
	private Date commenTime; /* 작성시간 */
	
	public Commen() {}

	public Commen(int commenNum, Board boardNum, String commenId, String commenText, Date commenTime) {
		this.commenNum = commenNum;
		this.boardNum = boardNum;
		this.commenId = commenId;
		this.commenText = commenText;
		this.commenTime = commenTime;
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

	public String getCommenId() {
		return commenId;
	}

	public void setCommenId(String commenId) {
		this.commenId = commenId;
	}

	public String getCommenText() {
		return commenText;
	}

	public void setCommenText(String commenText) {
		this.commenText = commenText;
	}

	public Date getCommenTime() {
		return commenTime;
	}

	public void setCommenTime(Date commenTime) {
		this.commenTime = commenTime;
	}

	@Override
	public String toString() {
		return "Commen [commenNum=" + commenNum + ", boardNum=" + boardNum + ", commenId=" + commenId + ", commenText="
				+ commenText + ", commenTime=" + commenTime + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boardNum == null) ? 0 : boardNum.hashCode());
		result = prime * result + ((commenId == null) ? 0 : commenId.hashCode());
		result = prime * result + commenNum;
		result = prime * result + ((commenText == null) ? 0 : commenText.hashCode());
		result = prime * result + ((commenTime == null) ? 0 : commenTime.hashCode());
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
		if (commenId == null) {
			if (other.commenId != null)
				return false;
		} else if (!commenId.equals(other.commenId))
			return false;
		if (commenNum != other.commenNum)
			return false;
		if (commenText == null) {
			if (other.commenText != null)
				return false;
		} else if (!commenText.equals(other.commenText))
			return false;
		if (commenTime == null) {
			if (other.commenTime != null)
				return false;
		} else if (!commenTime.equals(other.commenTime))
			return false;
		return true;
	}
	
	
	
}
