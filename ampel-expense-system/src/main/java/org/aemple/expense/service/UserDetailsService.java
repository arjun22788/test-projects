package org.aemple.expense.service;

import org.aemple.expense.model.UserDetails;

public interface UserDetailsService {
	public UserDetails createUserDetails(UserDetails details);
	public UserDetails getUserDetailsById(Long id); 
}
