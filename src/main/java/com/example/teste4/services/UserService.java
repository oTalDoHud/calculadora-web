package com.example.teste4.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teste4.model.User;
import com.example.teste4.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;
	
	public User findById(Integer id) {
		Optional<User> user = userRepo.findById(id);
		return user.get();
	}
}
