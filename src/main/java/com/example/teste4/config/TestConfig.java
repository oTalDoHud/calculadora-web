package com.example.teste4.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.teste4.model.User;
import com.example.teste4.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public void run(String... args) throws Exception {
		User hud = new User("Hudson", "Hudson@gmail.com", "123546");
		User ka = new User("Katharine", "Katharine@gmail.com", "asdwqe123");
		
		userRepo.save(hud);
		userRepo.save(ka);
	}
}
