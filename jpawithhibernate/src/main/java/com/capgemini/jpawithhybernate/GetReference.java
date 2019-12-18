package com.capgemini.jpawithhybernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class GetReference {
public static void main(String[] args) {
	EntityManager entityManager=null;
	//EntityTransaction transaction=null;
	//try {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
	 entityManager=entityManagerFactory.createEntityManager();
	 //transaction=entityManager.getTransaction();
	// transaction.begin();//static()
	 
	Movie record= entityManager.find(Movie.class, 102);
	// Movie record=entityManager.getReference(Movie.class, 102);
	 System.out.println(record.getClass());
	 System.out.println("Id.."+record.getMovieId());
	 System.out.println("Mname.."+record.getMovieName());
	 System.out.println("rating.."+record.getRating());
	 entityManager.close();
	 
	//record.setMovieName("Tare Jamin Par..");
	//record.setMovieName("Hebbuli");
	// System.out.println("record update...");
		//transaction.commit();
	//}catch(Exception e) {
	//	e.printStackTrace();
		//transaction.rollback();
//}
}
}