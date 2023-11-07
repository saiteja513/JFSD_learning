package com.example.pct.pct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.pct.pct.model.Products;
import com.example.pct.pct.repository.ProductRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class ProductsController {

	
	@Autowired
	private ProductRepository prorepo;
	
	@GetMapping("/elecproducts")
	List<Products> getAllProducts(){
		return prorepo.findAll();
	}
	
}
