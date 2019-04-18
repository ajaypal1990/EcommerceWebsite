package com.bookstore.dao;

import javax.persistence.EntityManager;

public class JpaDao<E> {

	public EntityManager entitymanager;

	public JpaDao(EntityManager entitymanager) {
		super();
		this.entitymanager = entitymanager;
	}
	
	public E create(E entity) {
		entitymanager.getTransaction().begin();
		entitymanager.persist(entity);
		entitymanager.flush();
		entitymanager.refresh(entity);
		entitymanager.getTransaction().commit();
		return entity;
	}
	
	public E update(E entity) {
		entitymanager.getTransaction().begin();
		entity=entitymanager.merge(entity);
		entitymanager.getTransaction().commit();
		return entity;
	}
}
