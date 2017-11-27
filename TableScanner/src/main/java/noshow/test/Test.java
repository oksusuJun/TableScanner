package noshow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import noshow.member.service.MemberService;
import noshow.vo.Member;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("noshow/config/spring/model-context.xml");
		
		MemberService service = (MemberService)ctx.getBean("memberServiceImpl");
		
		Member member = new Member("id","password");
		int i = service.getUserByUserId(member);
		
		System.out.println(i);
		
	}
}
