package noshow.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import noshow.table.service.OrderTableService;
import noshow.vo.OrderTable;

public class OrderTableTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("noshow/config/spring/model-context.xml");
		
		OrderTableService service = (OrderTableService)ctx.getBean("orderTableServiceImpl");
		
		/* 예약테이블 추가 */
		OrderTable orderTable = new OrderTable(9, 1);
		System.out.println(orderTable);
		
//		int result = service.addOrderTable(orderTable);
//		System.out.println(result);
		
		/* 예약번호로 예약테이블 조회 */
		int resNum = 111;
		List<OrderTable> list = service.selectOrderTableByResNum(resNum);
		if (list.isEmpty()) {
			System.out.println("예약번호 : "+ resNum + "으로 예약된건 아무것도 없다~~");
		} else {
			for(OrderTable ot : list) {
				System.out.println(ot);		
			}
		}
		
		/* 예약번호로 예약테이블 수정 */
		Map<String, OrderTable> map = new HashMap<String, OrderTable>();
		OrderTable afterTable = new OrderTable(11,1);
		
		map.put("beforeTable", orderTable);
		map.put("afterTable", afterTable);
		int result = service.updateOrderTable(map);
		System.out.println(result);
		
		
		/* 예약번호로 예약테이블 삭제(예약취소의 경우) */
		result = service.deleteOrderTable(resNum);
	}
}
