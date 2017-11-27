package org.aemple.expense.dao;

import org.aemple.expense.model.UserDetails;

public interface UserDetailsDao {

	public UserDetails createUserDetails(UserDetails details);
	public UserDetails getUserDetailsById(Long id); 
	
}
