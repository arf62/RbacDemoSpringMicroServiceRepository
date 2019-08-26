package com.example.demo.repos;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.example.demo.entities.Permission;
import com.example.demo.entities.Resource;
import com.example.demo.entities.Role;
import com.example.demo.entities.User;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

	@Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(User.class,Role.class,Resource.class,Permission.class);
    }
	
}
