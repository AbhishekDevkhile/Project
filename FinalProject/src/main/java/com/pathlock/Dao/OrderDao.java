package com.pathlock.Dao;

import java.util.List;

import com.pathlock.Model.Order;

public interface OrderDao 
{

	boolean addOrder(Order or);

	boolean deleteOrderById(Order oid);

	boolean updateOrder(Order or);

	List<Order> getAllOrder();
	
	Order getOrderById(int oid);
}

