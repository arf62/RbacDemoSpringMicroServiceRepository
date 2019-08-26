package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.demo.entities.Role;

@CrossOrigin(origins = "*")
@Repository
public interface RoleRepository extends CrudRepository<Role,Integer>{

}
