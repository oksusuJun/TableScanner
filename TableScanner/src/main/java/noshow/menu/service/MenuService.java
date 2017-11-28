package noshow.menu.service;

import noshow.vo.Classification;
import noshow.vo.Menu;

public interface MenuService {
	
	int insertclassification(Classification classification);
	
	int updateClassification(Classification classification);
	
	int deleteClassification(int classificationNum);
	
	int insertMenu(Menu menu);
}
