package com.example.teste4.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.teste4.model.User;
import com.example.teste4.services.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	@Autowired
	private UserService service;

	@GetMapping(path = "/id/{id}")
	public ResponseEntity<User> findById(@PathVariable Integer id){
		User user = service.findById(id);
		return ResponseEntity.ok().body(user);
	}
}
