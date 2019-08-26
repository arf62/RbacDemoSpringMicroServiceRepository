package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="resources")
public class Resource {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="resource_id")
	private int id;
	
	@Column(name="resource_name")
	private String resourceName;

	@Column(name="resource_description")
	private String resourceDescription;
	
	@OneToMany(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
	@JoinTable(name = "resource_roles",
		joinColumns= {@JoinColumn(name = "resource_id")},
		inverseJoinColumns = {@JoinColumn(name = "role_id")})
	private List<Role> roles = new ArrayList<>();
	
	protected Resource(){}
	
	public Resource(String resourceName, String resourceDescription) {
		this.resourceName = resourceName;
		this.resourceDescription = resourceDescription;
		roles = new ArrayList<>();
		
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the resourceName
	 */
	public String getResourceName() {
		return resourceName;
	}

	/**
	 * @param resourceName the resourceName to set
	 */
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}

	/**
	 * @return the resourceDescription
	 */
	public String getResourceDescription() {
		return resourceDescription;
	}

	/**
	 * @param resourceDescription the resourceDescription to set
	 */
	public void setResourceDescription(String resourceDescription) {
		this.resourceDescription = resourceDescription;
	}

	/**
	 * @return the roles
	 */
	public List<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	
}
