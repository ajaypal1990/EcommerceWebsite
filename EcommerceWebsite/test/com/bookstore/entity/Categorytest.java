package com.bookstore.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Categorytest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Category category=new Category("Spring");
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("EcommerceWebsite");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(category);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
		System.out.println("Category object is persisted");
		
	}
}
