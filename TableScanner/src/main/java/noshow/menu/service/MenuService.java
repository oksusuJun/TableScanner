package noshow.menu.service;

import java.util.List;

import noshow.vo.Classification;
import noshow.vo.Menu;

public interface MenuService {
	
	int insertclassification(Classification classification);
	
	int updateClassification(Classification classification);
	
	int deleteClassification(int classificationNum);
	
	int insertMenu(Menu menu);
	
	int updateMenu(Menu menu);
	
	int deleteMenu(int menuNum);
	
	List<Classification> selectClassificationBybusinessId(String businessId);
	
	List<Menu> selectMenuBybusinessId(String businessId);
}
