package noshow.menu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import noshow.menu.dao.MenuDAO;
import noshow.menu.service.MenuService;
import noshow.vo.Classification;
import noshow.vo.Menu;

@Service
public class MenuServiceImpl implements MenuService{

	@Resource
	private MenuDAO dao;
	
	@Override
	public int insertclassification(Classification classification) {
		return dao.insertClassification(classification);
	}

	@Override
	public int updateClassification(Classification classification) {
		return dao.updateClassification(classification);
	}

	@Override
	public int deleteClassification(int classificationNum) {
		return dao.deleteClassification(classificationNum);
	}

	@Override
	public int insertMenu(Menu menu) {
		return dao.insertMenu(menu);
	}

	@Override
	public int updateMenu(Menu menu) {
		return dao.updateMenu(menu);
	}

	@Override
	public int deleteMenu(int menuNum) {
		return dao.deleteMenu(menuNum);
	}

	@Override
	public List<Classification> selectClassificationBybusinessId(String businessId) {
		return dao.selectClassificationBybusinessId(businessId);
	}

}
