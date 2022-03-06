package com.pathlock.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathlock.Dao.OrderDao;
import com.pathlock.Model.Order;


@Service
public class OrderServiceImpl implements OrderService
{
	@Autowired
	private OrderDao orderdao;

	@Override
	public boolean addOrder(Order or) {
		// TODO Auto-generated method stub
		return orderdao.addOrder(or);
	}

	@Override
	public boolean deleteOrderById(Order oid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateOrder(Order or) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Order> getAllOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order getOrderById(int oid) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
