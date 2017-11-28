package noshow.test;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import noshow.member.service.OwnerMemberService;
import noshow.vo.Member;
import noshow.vo.Restaurant;

public class OwnerMemberTest {
   public static void main(String[] args) {
      ApplicationContext ctx = new ClassPathXmlApplicationContext("noshow/config/spring/model-context.xml");
      
      OwnerMemberService service = (OwnerMemberService)ctx.getBean("ownerMemberServiceImpl");
      
      Restaurant rt = new Restaurant(new Member("id-2","김호현","남","01092931027", "92", new Date(950109), "dada5412@naver.com") , 11, "호규네", "0000", "호프집", "mon", 
            new Date(20170211), new Date(20170812), "안녕", "안녕2", "신봉동", 50, 5000);
      
      System.out.println(rt);
      
/*      int i = service.getRtByNum(rt);
      */
/*      System.out.println(i);*/
   }

}