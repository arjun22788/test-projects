package org.aemple.expense.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.aemple.expense.model.UserInfo;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDetailsDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public UserInfo createUserDetails(UserInfo details) {
		System.out.println("dao");
		System.out.println(details.toString());
		entityManager.persist(details);
		return details;
	}

	@Override
	@Transactional
	public UserInfo getUserDetailsById(Long id) {

		return entityManager.find(UserInfo.class, id);
	}

}
