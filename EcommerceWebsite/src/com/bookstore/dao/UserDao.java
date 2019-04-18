package com.bookstore.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.bookstore.entity.Users;

public class UserDao extends JpaDao<Users> implements GenericDao<Users> {

	public UserDao(EntityManager entitymanager) {
		super(entitymanager);
		// TODO Auto-generated constructor stub
	}


	public Users create(Users user) {
		// TODO Auto-generated method stub
		return super.create(user);
	}

	public Users update(Users user) {
		// TODO Auto-generated method stub
		return super.update(user);
	}

	@Override
	public Users get(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Object id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Users> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}




	
}
