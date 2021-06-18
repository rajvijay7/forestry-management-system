package com.cg.fms.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.fms.entities.Product;
import com.cg.fms.repository.ProductRepository;

@SpringBootTest
class ProductServiceImplTest {
	@Autowired
	private IProductService productService;

	@MockBean
	private ProductRepository productRepository;

	@BeforeEach
	void setUp() throws Exception {
		Product product = new Product();
		product.setId(1);
		product.setName("Timber");
		product.setDescription("Timber is used for the production of wood");
		product.setQuantity("22");

	}

	
	@Test
	@DisplayName("Verify add product functionality")
	void addProductTest() {
		Product product = new Product();
		when(productRepository.save(product)).thenReturn(product);
		assertEquals(product, productService.addProduct(product));
	}
	
	
	@Test
	@DisplayName("fetch all product functionality")
	void fetchAllTest() {
		when(productRepository.findAll()).thenReturn(Stream
				.of(new Product(),
						new Product()).collect(Collectors.toList()));
		assertEquals(2, productService.fetchAll().size());
	}
	
	

}