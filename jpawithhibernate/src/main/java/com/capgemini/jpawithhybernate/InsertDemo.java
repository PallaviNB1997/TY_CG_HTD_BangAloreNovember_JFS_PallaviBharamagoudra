package com.capgemini.jpawithhybernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class InsertDemo {
	public static void main(String[] args) {

		Movie movie = new Movie();
		movie.setMovieId(103);
		movie.setMovieName("IceAge");
		movie.setRating("Good");
 
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);
			System.out.println("record saved..");
			transaction.commit(); //it is used to insert data into database
			entityManager.clear();
		}catch(Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.commit();
		entityManager.close();
	}//end of the main method
}//end of the class 
