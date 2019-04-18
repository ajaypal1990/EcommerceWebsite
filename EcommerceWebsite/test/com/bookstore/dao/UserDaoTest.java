package com.bookstore.dao;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import com.bookstore.entity.Users;

class UserDaoTest {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static UserDao userDao;

	@BeforeAll
	public static void setUpClass() {
		System.out.println("Before class called");
		entityManagerFactory = Persistence.createEntityManagerFactory("EcommerceWebsite");
		entityManager = entityManagerFactory.createEntityManager();
		userDao = new UserDao(entityManager);
	}

	@Test
	public void createtestUser() {
		// TODO Auto-generated method stub
		Users user1 = new Users();
		user1.setEmail("contctajay90@gmaill.com");
		user1.setFullName("Ajay");
		user1.setPassword("password");
		System.out.println(user1.getEmail()+""+user1.getFullName()+""+user1.getPassword());
		System.out.println("Beroree...");
		userDao.create(user1);
		System.out.println("After.....");

		assertTrue(user1.getUserId() > 0);
	}

	@Test
	public void testCreateUserwithoutField() {
		System.out.println("I am test create user without field");
		Users u1 = new Users();

		u1 = userDao.create(u1);

	}
	
	

	@AfterAll
	public static void tearDown() {
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("After class Called");
	}

}
