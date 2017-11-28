package noshow.menu.service;

import noshow.vo.Classification;

public interface MenuService {
	
	int insertclassification(Classification classification);
	
	int updateClassification(Classification classification);
	
	int deleteClassification(int classificationNum);
}
