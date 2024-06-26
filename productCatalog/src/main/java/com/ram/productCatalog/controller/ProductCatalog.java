package com.ram.productCatalog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCatalog {

	@GetMapping("/microservice/productCatalog")
	public String getProductCatalog() {
		return "Welcome to Product Catalog";
	}
	
}
