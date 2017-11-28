package noshow.test;

import java.sql.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import noshow.member.service.MemberService;
import noshow.vo.Member;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("noshow/config/spring/model-context.xml");
		
		MemberService service = (MemberService)ctx.getBean("memberServiceImpl");
	
		Member member = new Member("id-33","password33","김기기","남","0104022354",new Date(19880808),"email");
		System.out.println(member);
		int i2 = service.deleteMember("id-33");
		System.out.println(i2);
		int i = service.addMember(member);
		System.out.println(i);
		Member member2 = new Member("id-33","password44","김나나","여","01033333333",new Date(19880101),"email@com");
		int i3 = service.updateMember(member2);
		System.out.println(i3); 
		Member i4 = service.selectMemberById("id-33");
		System.out.println(i4);
		
	}
}
