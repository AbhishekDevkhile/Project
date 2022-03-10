package com.pathlock.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pathlock.Dao.ProductDao;
import com.pathlock.Model.Product;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao pdao;

	@Override
	public boolean insertProduct(Product p) {
		return pdao.insertProduct(p);
	}

	@Override
	public boolean deleteProduct(Product p) {
		return pdao.deleteProduct(p);
	}

	@Override
	public boolean updateProduct(Product p) {
		return pdao.updateProduct(p);
	}

	@Override
	public List<Product> getAllProducts() {
		return pdao.getAllProducts();
	}

	@Override
	public Product getProductById(int id) {
		return pdao.getProductById(id);
	}

	@Override
	public boolean manageStock(int id, int q) {
		
		pdao.manageStock(id, q);
		
		return true;
		
	}

	
	
}
