package noshow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import noshow.menu.service.MenuService;
import noshow.vo.Classification;

public class memuTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("noshow/config/spring/model-context.xml");
		
		MenuService service = (MenuService)ctx.getBean("menuServiceImpl");
		
		Classification classification = new Classification(2, "id-1", "찌개류");
		System.out.println(classification);
		int i = service.insertclassification(classification);
		
		System.out.println(i);
		
	}
}
