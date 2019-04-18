package com.bookstore.entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.bookstore.entity.Users;

public class UserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Users user=new Users();
		user.setEmail("UpdatedAjay90");
		user.setFullName("Ajay");
		user.setPassword("ajaypal");
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("EcommerceWebsite");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("User object is persisted");
		
	}

}
