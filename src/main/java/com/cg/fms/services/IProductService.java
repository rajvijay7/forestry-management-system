package com.cg.fms.services;

import com.cg.fms.exception.ProductNotFoundException;
import com.cg.fms.exception.ProductNotFoundException;
import com.cg.fms.entities.Product;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.fms.entities.Product;

@Service
public interface IProductService {

	
	//get product by id//
	Product fetchById(int id) throws ProductNotFoundException;
	
	
	// adding a product //
	Product addProduct(Product product);
	
	//updating a product //
	void  updateProduct(Product product);
	
	//deleting a product //
	void delProduct(int id) throws ProductNotFoundException;
	
	// get all products //
	List<Product> fetchAll();
}
