package org.aemple.expense.service;

import org.aemple.expense.dao.UserDetailsDao;
import org.aemple.expense.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	UserDetailsDao userdetailsDao;
	
	@Override
	public UserInfo createUserDetails(UserInfo details) {
		userdetailsDao.createUserDetails(details);
		// TODO Auto-generated method stub
		System.out.println(details.toString());
		return null;
	}

	@Override
	public UserInfo getUserDetailsById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
