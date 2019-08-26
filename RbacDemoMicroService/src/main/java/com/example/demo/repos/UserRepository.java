package com.example.demo.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.User;

@CrossOrigin(origins = "*")
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	public List <User> Login(@Param("userName") String userName, @Param("password")String password);
	
}
