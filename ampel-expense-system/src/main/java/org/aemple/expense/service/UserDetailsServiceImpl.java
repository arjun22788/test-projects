package org.aemple.expense.service;

import org.aemple.expense.dao.UserDetailsDao;
import org.aemple.expense.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailsDao userdetailsDao;
	
	@Override
	public UserDetails createUserDetails(UserDetails details) {
		userdetailsDao.createUserDetails(details);
		// TODO Auto-generated method stub
		System.out.println(details.toString());
		return null;
	}

	@Override
	public UserDetails getUserDetailsById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
