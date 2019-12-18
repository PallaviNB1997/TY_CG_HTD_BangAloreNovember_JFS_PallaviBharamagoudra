package com.capgemini.jpa.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Retrive {
public static void main(String[] args) {
 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
 EntityManager entityManager=entityManagerFactory.createEntityManager();
 
// String jpql="from Movie";//query
 String jpql="select movieName from Movie";//query from entity class
 Query query=entityManager.createQuery(jpql);
 //List<Movie> record = query.getResultList();
 List<String> record = query.getResultList();
 
 //for (Movie movie : record) {
	 for (String movie : record) {
	//System.out.println("Movie Id :"+movie.getMovieId());
	//System.out.println("Movie Name :"+movie.getMovieName());
	//System.out.println("Rating :"+movie.getRating());
		 
		 System.out.println(movie);
}
entityManager.close();
}
}
