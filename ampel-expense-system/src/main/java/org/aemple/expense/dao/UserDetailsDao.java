package org.aemple.expense.dao;

import org.aemple.expense.model.UserInfo;

public interface UserDetailsDao {

	public UserInfo createUserDetails(UserInfo details);
	public UserInfo getUserDetailsById(Long id); 
	
}
