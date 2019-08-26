package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Resource;

@CrossOrigin(origins = "*")
@Repository
public interface ResourceRepository extends CrudRepository<Resource, Integer> {

}
