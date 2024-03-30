package com.aks.springboot.crud.service;

import java.util.List;

import com.aks.springboot.crud.model.Product;

public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long productId);

	void deleteProduct(long id);
}
