package com.trabalho.pelegrin.hibernate;

import model.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateApplication {

	public static void main(String[] args) {

		Person p = new Person();
		p.setName("allanfdb");
		p.setEmail("allan@gmail");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pelegrin");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		System.out.println("commitado");



	}
}
