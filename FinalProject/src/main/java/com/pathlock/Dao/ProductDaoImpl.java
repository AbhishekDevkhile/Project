package com.pathlock.Dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pathlock.Model.Product;



@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public boolean insertProduct(Product p) {
		sessionFactory.getCurrentSession().save(p);
		return true;
	}

	@Override
	public boolean deleteProduct(Product p) {
		sessionFactory.getCurrentSession().delete(p);
		return true;
	}

	@Override
	public boolean updateProduct(Product p) {
		sessionFactory.getCurrentSession().saveOrUpdate(p);
		 return true;
	}

	@Override
	public List<Product> getAllProducts() {
		Query<Product> q=sessionFactory.getCurrentSession().createQuery("from Product");
		List<Product> prodlist=q.list();
		return prodlist;
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(Product.class, id);
	}

}
