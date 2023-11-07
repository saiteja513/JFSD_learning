package com.example.pct.pct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pct.pct.model.Clothing;
import com.example.pct.pct.repository.ClothingRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class ClothingController {

	@Autowired
	private ClothingRepository clorepo;
	
	@GetMapping("/clothproducts")
	List<Clothing> getAllClothing(){
		return clorepo.findAll();
	}
}
