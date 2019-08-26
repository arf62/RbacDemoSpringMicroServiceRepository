package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repos.PermissionRepository;
import com.example.demo.repos.RoleRepository;
import com.example.demo.repos.UserRepository;

@SpringBootApplication
public class UserServiceApplication {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	@Autowired
	PermissionRepository permissionRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}

}
