package noshow.menu.dao;

import noshow.vo.Classification;
import noshow.vo.Menu;

public interface MenuDAO {
	
	/**
	 * 대분류 테이블에 매개변수로 받은 대분류 메뉴 insert하는 메소드
	 * @param classification
	 * @return 
	 */
	int insertClassification(Classification classification);
	
	/**
	 * 매개변수로 받은 classification의  classificationNum 의 나머지 정보 update 처리하는 메소드
	 * @param classification
	 * @return
	 */
	int updateClassification(Classification classification);
	
	/**
	 * 매개변수로 받은 classificationNum과 일치하는 classification 데이터를 삭제
	 * @param classificationNum
	 * @return
	 */
	int deleteClassification(int classificationNum);
	
	
	// 여기서 부터 menu 관련
	
	int insertMenu(Menu menu);
	
	
}
