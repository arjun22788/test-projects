package org.aemple.expense.service;

import org.aemple.expense.model.UserInfo;

public interface UserDetailsService {
	public UserInfo createUserDetails(UserInfo details);
	public UserInfo getUserDetailsById(Long id); 
}
