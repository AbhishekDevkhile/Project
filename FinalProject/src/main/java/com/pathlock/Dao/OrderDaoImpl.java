package com.pathlock.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.pathlock.Model.Order;
import com.pathlock.Model.OrderDetails;

@Transactional
@Repository
public class OrderDaoImpl implements OrderDao {

	@Autowired	
	private SessionFactory sessionfactory;
	
	@Override
	public boolean addOrder(Order or) {
		sessionfactory.getCurrentSession().save(or);
		List<OrderDetails>lst=or.getOrderdetails();
		for(OrderDetails od:lst)
			sessionfactory.getCurrentSession().save(od);	
		return true;
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
