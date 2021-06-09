package com.cg.fms.service;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.fms.exception.ProductNotFoundException;
import com.cg.fms.entities.Product;
import com.cg.fms.repository.ProductRepository;
import com.cg.fms.service.ProductServiceImpl;
import org.slf4j.LoggerFactory;

@Service
public class ProductServiceImpl implements IProductService{
	
	Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	
	@Autowired
	private ProductRepository repository;// repository is a dependency of ProductServiceImpl

	
	// get product by id //
	
	@Override
	public Product fetchById(int id) throws ProductNotFoundException {
		Optional<Product> product = repository.findById(id);
		if (!product.isPresent())
			throw new ProductNotFoundException();
		return product.get();
	}
	
	
	// add a product //
	
	@Override
	public Product addProduct(Product product) {
		logger.info("inside addProduct method of ProductServiceImpl");
		return repository.save(product);
	}
	
	
	// updating a product //
	
	@Override
	public void updateProduct(Product product) {
		repository.save(product);
	}
	
	
	// deleting a product
	
	@Override
	public void delProduct(int id) throws ProductNotFoundException {
		Optional<Product> product = repository.findById(id);
		if (!product.isPresent())
			throw new ProductNotFoundException();

		repository.deleteById(id);
	}
		
	
	
	// get all product
	@Override
	public List<Product> fetchAll() {
		return repository.findAll();
	}
}
