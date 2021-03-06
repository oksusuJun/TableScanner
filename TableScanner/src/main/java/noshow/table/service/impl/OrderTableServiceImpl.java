package noshow.table.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import noshow.table.dao.OrderTableDao;
import noshow.table.service.OrderTableService;
import noshow.vo.OrderTable;

@Service
public class OrderTableServiceImpl implements OrderTableService{

	@Resource
	private OrderTableDao dao;

	@Override
	public int addOrderTable(OrderTable orderTable) {
		return dao.insertOrderTable(orderTable);
	}

	@Override
	public int updateOrderTable(Map<String, OrderTable> orderTableMap) {
		return dao.updateOrderTableByResNum(orderTableMap);
	}

	@Override
	public int deleteOrderTable(int resNum) {
		return dao.deleteOrderTableByResNum(resNum);
	}

	@Override
	public List<OrderTable> selectOrderTableByResNum(int resNum) {
		return dao.selectOrderTableByResNum(resNum);
	}
	

}
