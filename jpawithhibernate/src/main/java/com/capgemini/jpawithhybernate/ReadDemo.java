package com.capgemini.jpawithhybernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class ReadDemo {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Movie record=entityManager.find(Movie.class, 102);//find()
	System.out.println("Id-----"+record.getMovieId());//using getters retrive the data
	System.out.println("Name----"+record.getMovieName());
	System.out.println("Rating-----"+record.getRating());
	entityManager.close();
}//end of main method
}//end of the class
