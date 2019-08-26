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
@Table(name = "roles")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="role_id")
	private int id;
	@Column(name= "role_name")
	private String roleName;
	@Column(name= "role_department")
	private String roleDepartment;
	
	@OneToMany(fetch = FetchType.EAGER, cascade= CascadeType.ALL)
	@JoinTable(name = "role_permissions",
		joinColumns= {@JoinColumn(name = "role_id")},
		inverseJoinColumns = {@JoinColumn(name = "permission_id")})
	private List<Permission> permissions = new ArrayList<>();
	
	protected Role(){}
	
	public Role(String roleName, String roleDescription) 
	{
		this.roleName = roleName;
		this.roleDepartment = roleDescription;
		permissions = new ArrayList<>();
	}


	/**
	 * @return the roleDepartment
	 */
	public String getRoleDepartment() {
		return roleDepartment;
	}

	/**
	 * @param roleDepartment the roleDepartment to set
	 */
	public void setRoleDepartment(String roleDepartment) {
		this.roleDepartment = roleDepartment;
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
	 * @return the roleName
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * @param roleName the roleName to set
	 */
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	/**
	 * @return the permissions
	 */
	public List<Permission> getPermissions() {
		return permissions;
	}

	/**
	 * @param permissions the permissions to set
	 */
	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	
}
