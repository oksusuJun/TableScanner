package noshow.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import noshow.member.service.MemberService;
import noshow.vo.Member;

@Controller
@RequestMapping("/noshow/")
public class MemberController {

/*	@Autowired
	private MemberService memberService;
	
	@RequestMapping
	public String insertMember(@RequestParam String id, @RequestParam String password, @RequestParam String name, @RequestParam String gender,
			@RequestParam String tel, @RequestParam Date birthday, @RequestParam String email) {
			memberService.addMember(new Member(id, password, name, gender, tel, birthday, email));
		return "/main.jsp";
	}
	
	@RequestMapping
	public String deleteMember(@RequestParam String id) {
		memberService.deleteMember(id);
		return "/main.jsp";
	}*/
}
