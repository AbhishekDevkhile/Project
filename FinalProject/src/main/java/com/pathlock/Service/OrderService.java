package com.pathlock.Service;

import java.util.List;

import com.pathlock.Model.Order;

public interface OrderService
{

	boolean addOrder(Order or);

	boolean deleteOrderById(Order oid);

	boolean updateOrder(Order or);

	List<Order> getAllOrder();
	
	Order getOrderById(int oid);

}
