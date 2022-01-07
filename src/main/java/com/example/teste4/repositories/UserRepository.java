package com.example.teste4.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teste4.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
