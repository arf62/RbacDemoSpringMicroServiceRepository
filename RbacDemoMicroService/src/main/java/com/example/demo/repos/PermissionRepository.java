/**
 * 
 */
package com.example.demo.repos;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Permission;

@CrossOrigin(origins = "*")
@Repository
public interface PermissionRepository extends CrudRepository<Permission, Integer> {

}
