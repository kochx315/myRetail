package com.keller.ashley;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.base.Preconditions;

@RestController
@RequestMapping("/products")
public class MyRetailController {

	@Autowired
	private MyRetailService service;
	
	@GetMapping(value="/{productId}")
	public Product findByProductId(@PathVariable("productId") long productId) {
		Product foundProduct = service.findByProductId(productId);
		
		return foundProduct;
	}
	
	@PutMapping(value="/{productId}")
	@ResponseStatus(HttpStatus.OK)
	public void update(@PathVariable("productId") long productId, @RequestBody Product product) {
		Preconditions.checkNotNull(product);
		
	}
}
