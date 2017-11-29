package noshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import noshow.member.service.MemberService;
import noshow.vo.Member;

@Controller
public class MemberController {

	@Autowired
	private MemberService service;
	
	@RequestMapping("/member")
	public ModelAndView inserMember(@ModelAttribute Member member) {
		service.addMember(member, "ROLE_MEMBER");
		return new ModelAndView();
	}
	

}
