package noshow.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import noshow.menu.service.MenuService;
import noshow.vo.Classification;
import noshow.vo.Menu;
import noshow.vo.Restaurant;

public class memuTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("noshow/config/spring/model-context.xml");
		
		MenuService service = (MenuService)ctx.getBean("menuServiceImpl");
		
/*		Classification classification = new Classification(21, "id-1", "찌개류");
		System.out.println(classification);
		int i = service.insertclassification(classification);
		System.out.println("추가완료" + i);
		int iz = service.insertclassification(new Classification(17, "id-2", "보쌈류"));
		System.out.println("추가완료" + i);
		int z = service.updateClassification(new Classification(17, "i-2", "갈비탕류"));
		System.out.println("업데이트 완료" + z);
		
		int y = service.deleteClassification(21);
		System.out.println("삭제 완료" + y);*/
		
		Menu menu = new Menu(100, "menuName", "2", 5, "menuPicture", 3, "id-3");
		System.out.println(menu);
		int yw = service.insertMenu(menu);
		System.out.println("메뉴 추가" + yw);
	}
}
