package com.example.pct.pct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.pct.pct.model.User;
import com.example.pct.pct.repository.UserRepository;


@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	private UserRepository userrepo;
	
	
	@PostMapping("/user")
	User newUser(@RequestBody User newUser) {
		return userrepo.save(newUser);
	}
	
	@GetMapping("/users")
	List<User> getAllUsers(){
		return userrepo.findAll();
	}
}
