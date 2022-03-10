package com.pathlock.Service;

import java.util.List;

import com.pathlock.Model.Product;


public interface ProductService {

	
	boolean insertProduct(Product p);

	boolean deleteProduct(Product p);

	boolean updateProduct(Product p);

	List<Product> getAllProducts();

	Product getProductById(int id);
	
	
	boolean manageStock(int id,int q);
	
}
