package org.aemple.expense.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.security.core.userdetails.UserDetails;

@Entity(name="user_roles")
public class UserRoles {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="role_name", length=50)
	private String roleName;
	
	@Column(name="role_description")
	private String roleDescription;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "roles")
	private List<UserInfo> userDetails;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public List<UserInfo> getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(List<UserInfo> userDetails) {
		this.userDetails = userDetails;
	}

}
