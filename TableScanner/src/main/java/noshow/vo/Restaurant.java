package noshow.vo;

import java.io.Serializable;
import java.util.Date;

public class Restaurant implements Serializable{
	private Member businessId; /* 점주 회원 아이디 */
	private int businessNum; /* 사업자 번호 */
	private String restaurantName; /* 음식점 명 */
	private String restaurantTel; /* 음식점 전화번호 */
	private String restaurantField; /* 업종 */
	private String restaurantHoliday; /* 휴무일 */
	private Date restaurantOpen; /* 오픈시간 */
	private Date restaurantClose; /* close 시간 */
	private String restaurantImg; /* 음식점 사진 이름*/
	private String restaurantSaveImg; /* 저장 이름 */
	private String restaurantLocation; /* 음식점 위치*/
	private int restaurantLocationLatitude; /* 위도 */
	private int restaurantLocationLongitude; /* 경도 */
	private int restaurantCapacity; /* 수용가능인원 */
	private int restaurantDeposit; /* 1인 금액 */
	
	public Restaurant() {}
	
	public Restaurant(Member businessId, int businessNum, String restaurantName, String restaurantTel,
			String restaurantField, String restaurantHoliday, Date restaurantOpen, Date restaurantClose,
			String restaurantImg, String restaurantSaveImg, String restaurantLocation, int restaurantLocationLatitude,
			int restaurantLocationLongitude, int restaurantCapacity, int restaurantDeposit) {
		this.businessId = businessId;
		this.businessNum = businessNum;
		this.restaurantName = restaurantName;
		this.restaurantTel = restaurantTel;
		this.restaurantField = restaurantField;
		this.restaurantHoliday = restaurantHoliday;
		this.restaurantOpen = restaurantOpen;
		this.restaurantClose = restaurantClose;
		this.restaurantImg = restaurantImg;
		this.restaurantSaveImg = restaurantSaveImg;
		this.restaurantLocation = restaurantLocation;
		this.restaurantLocationLatitude = restaurantLocationLatitude;
		this.restaurantLocationLongitude = restaurantLocationLongitude;
		this.restaurantCapacity = restaurantCapacity;
		this.restaurantDeposit = restaurantDeposit;
	}

	public Member getBusinessId() {
		return businessId;
	}

	public void setBusinessId(Member businessId) {
		this.businessId = businessId;
	}

	public int getBusinessNum() {
		return businessNum;
	}

	public void setBusinessNum(int businessNum) {
		this.businessNum = businessNum;
	}

	public String getRestaurantName() {
		return restaurantName;
	}

	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}

	public String getRestaurantTel() {
		return restaurantTel;
	}

	public void setRestaurantTel(String restaurantTel) {
		this.restaurantTel = restaurantTel;
	}

	public String getRestaurantField() {
		return restaurantField;
	}

	public void setRestaurantField(String restaurantField) {
		this.restaurantField = restaurantField;
	}

	public String getRestaurantHoliday() {
		return restaurantHoliday;
	}

	public void setRestaurantHoliday(String restaurantHoliday) {
		this.restaurantHoliday = restaurantHoliday;
	}

	public Date getRestaurantOpen() {
		return restaurantOpen;
	}

	public void setRestaurantOpen(Date restaurantOpen) {
		this.restaurantOpen = restaurantOpen;
	}

	public Date getRestaurantClose() {
		return restaurantClose;
	}

	public void setRestaurantClose(Date restaurantClose) {
		this.restaurantClose = restaurantClose;
	}

	public String getRestaurantImg() {
		return restaurantImg;
	}

	public void setRestaurantImg(String restaurantImg) {
		this.restaurantImg = restaurantImg;
	}

	public String getRestaurantSaveImg() {
		return restaurantSaveImg;
	}

	public void setRestaurantSaveImg(String restaurantSaveImg) {
		this.restaurantSaveImg = restaurantSaveImg;
	}

	public String getRestaurantLocation() {
		return restaurantLocation;
	}

	public void setRestaurantLocation(String restaurantLocation) {
		this.restaurantLocation = restaurantLocation;
	}

	public int getRestaurantLocationLatitude() {
		return restaurantLocationLatitude;
	}

	public void setRestaurantLocationLatitude(int restaurantLocationLatitude) {
		this.restaurantLocationLatitude = restaurantLocationLatitude;
	}

	public int getRestaurantLocationLongitude() {
		return restaurantLocationLongitude;
	}

	public void setRestaurantLocationLongitude(int restaurantLocationLongitude) {
		this.restaurantLocationLongitude = restaurantLocationLongitude;
	}

	public int getRestaurantCapacity() {
		return restaurantCapacity;
	}

	public void setRestaurantCapacity(int restaurantCapacity) {
		this.restaurantCapacity = restaurantCapacity;
	}

	public int getRestaurantDeposit() {
		return restaurantDeposit;
	}

	public void setRestaurantDeposit(int restaurantDeposit) {
		this.restaurantDeposit = restaurantDeposit;
	}

	@Override
	public String toString() {
		return "Restaurant [businessId=" + businessId + ", businessNum=" + businessNum + ", restaurantName="
				+ restaurantName + ", restaurantTel=" + restaurantTel + ", restaurantField=" + restaurantField
				+ ", restaurantHoliday=" + restaurantHoliday + ", restaurantOpen=" + restaurantOpen
				+ ", restaurantClose=" + restaurantClose + ", restaurantImg=" + restaurantImg + ", restaurantSaveImg="
				+ restaurantSaveImg + ", restaurantLocation=" + restaurantLocation + ", restaurantLocationLatitude="
				+ restaurantLocationLatitude + ", restaurantLocationLongitude=" + restaurantLocationLongitude
				+ ", restaurantCapacity=" + restaurantCapacity + ", restaurantDeposit=" + restaurantDeposit + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((businessId == null) ? 0 : businessId.hashCode());
		result = prime * result + businessNum;
		result = prime * result + restaurantCapacity;
		result = prime * result + ((restaurantClose == null) ? 0 : restaurantClose.hashCode());
		result = prime * result + restaurantDeposit;
		result = prime * result + ((restaurantField == null) ? 0 : restaurantField.hashCode());
		result = prime * result + ((restaurantHoliday == null) ? 0 : restaurantHoliday.hashCode());
		result = prime * result + ((restaurantImg == null) ? 0 : restaurantImg.hashCode());
		result = prime * result + ((restaurantLocation == null) ? 0 : restaurantLocation.hashCode());
		result = prime * result + restaurantLocationLatitude;
		result = prime * result + restaurantLocationLongitude;
		result = prime * result + ((restaurantName == null) ? 0 : restaurantName.hashCode());
		result = prime * result + ((restaurantOpen == null) ? 0 : restaurantOpen.hashCode());
		result = prime * result + ((restaurantSaveImg == null) ? 0 : restaurantSaveImg.hashCode());
		result = prime * result + ((restaurantTel == null) ? 0 : restaurantTel.hashCode());
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
		Restaurant other = (Restaurant) obj;
		if (businessId == null) {
			if (other.businessId != null)
				return false;
		} else if (!businessId.equals(other.businessId))
			return false;
		if (businessNum != other.businessNum)
			return false;
		if (restaurantCapacity != other.restaurantCapacity)
			return false;
		if (restaurantClose == null) {
			if (other.restaurantClose != null)
				return false;
		} else if (!restaurantClose.equals(other.restaurantClose))
			return false;
		if (restaurantDeposit != other.restaurantDeposit)
			return false;
		if (restaurantField == null) {
			if (other.restaurantField != null)
				return false;
		} else if (!restaurantField.equals(other.restaurantField))
			return false;
		if (restaurantHoliday == null) {
			if (other.restaurantHoliday != null)
				return false;
		} else if (!restaurantHoliday.equals(other.restaurantHoliday))
			return false;
		if (restaurantImg == null) {
			if (other.restaurantImg != null)
				return false;
		} else if (!restaurantImg.equals(other.restaurantImg))
			return false;
		if (restaurantLocation == null) {
			if (other.restaurantLocation != null)
				return false;
		} else if (!restaurantLocation.equals(other.restaurantLocation))
			return false;
		if (restaurantLocationLatitude != other.restaurantLocationLatitude)
			return false;
		if (restaurantLocationLongitude != other.restaurantLocationLongitude)
			return false;
		if (restaurantName == null) {
			if (other.restaurantName != null)
				return false;
		} else if (!restaurantName.equals(other.restaurantName))
			return false;
		if (restaurantOpen == null) {
			if (other.restaurantOpen != null)
				return false;
		} else if (!restaurantOpen.equals(other.restaurantOpen))
			return false;
		if (restaurantSaveImg == null) {
			if (other.restaurantSaveImg != null)
				return false;
		} else if (!restaurantSaveImg.equals(other.restaurantSaveImg))
			return false;
		if (restaurantTel == null) {
			if (other.restaurantTel != null)
				return false;
		} else if (!restaurantTel.equals(other.restaurantTel))
			return false;
		return true;
	}
	
	
}
