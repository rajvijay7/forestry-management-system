package com.cg.fms.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cg.fms.exception.CartItemNotFoundException;
import com.cg.fms.exception.ContractNotFoundException;
import com.cg.fms.exception.CustomerNotFoundException;
import com.cg.fms.exception.OrderNotFoundException;
import com.cg.fms.exception.ProductNotFoundException;



@ControllerAdvice
public class ValidationAndExceptionHandler extends ResponseEntityExceptionHandler{

	//product not found 
	
	@ExceptionHandler(value = ProductNotFoundException.class)
	public ResponseEntity<Object> exception(ProductNotFoundException exception) {

		return new ResponseEntity<>("Product Not Found!!", HttpStatus.NOT_FOUND);
	}
		
	
	//customer not found 
	
	@ExceptionHandler(value = CustomerNotFoundException.class)
		public ResponseEntity<Object> exception(CustomerNotFoundException exception) {

			return new ResponseEntity<>("Customer Not Found!!", HttpStatus.NOT_FOUND);

		}
	
	// cart item not found 
	
	@ExceptionHandler(value = CartItemNotFoundException.class)
	public ResponseEntity<Object> exception(CartItemNotFoundException exception) {

		return new ResponseEntity<>("Cart_item Not Found!!", HttpStatus.NOT_FOUND);
	}	
	
	
	// order not found
	
	@ExceptionHandler(value = OrderNotFoundException.class)
	public ResponseEntity<Object> exception(OrderNotFoundException exception) {

		return new ResponseEntity<>("Order Not Found!!", HttpStatus.NOT_FOUND);
	}	
	
	
	// contract not found 
	
	@ExceptionHandler(value = ContractNotFoundException.class)
	public ResponseEntity<Object> exception(ContractNotFoundException exception) {

		return new ResponseEntity<>("Contract Not Found!!", HttpStatus.NOT_FOUND);
	}	


}