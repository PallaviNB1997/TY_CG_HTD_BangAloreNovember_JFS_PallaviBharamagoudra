package com.capgemini.jpawithhybernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Delete {
public static void main(String[] args) {
	EntityTransaction transaction=null;
	EntityManager entityManager=null;
	try {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
    entityManager=entityManagerFactory.createEntityManager();
	transaction=entityManager.getTransaction();
	transaction.begin();
	Movie record=entityManager.find(Movie.class, 103);
	entityManager.remove(record);
	System.out.println("record removed..");
	transaction.commit();
}catch(Exception e) {
	e.printStackTrace();
	transaction.rollback();
}
}
}
