package noshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import noshow.member.service.OwnerMemberService;
import noshow.vo.Restaurant;

@Controller
@RequestMapping("")
public class OwnerMemberController {
	
	@Autowired
	private OwnerMemberService service;
	
	/**
	 * 식당을 등록, 수정 ,삭제하는 메소드
	 * 등록 성공 후 join_success.do로 이동
	 */
	
	public ModelAndView insertRestaurant(@ModelAttribute Restaurant rt) {
		service.insertRestaurant(rt);
		return new ModelAndView();
	}
	
	public ModelAndView updateRestaurant(@ModelAttribute Restaurant rt) {
		service.updateRestaurant(rt);
		return new ModelAndView();
	}
	
	public ModelAndView deleteRestaurant(@ModelAttribute String businessId) {
		service.deleteRestaurant(businessId);
		return new ModelAndView();
	}
	
	
}
