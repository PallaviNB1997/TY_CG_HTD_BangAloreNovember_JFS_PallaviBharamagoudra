package com.capgemini.jpa.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class NativeSql {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test1");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=entityManager.getTransaction();
		transaction.begin();
		String sql="insert into Movie (MovieId) values (select * from Movie)";
		Query query=entityManager.createNativeQuery(sql);
		query.executeUpdate();
		transaction.commit();
		entityManager.close();
	}
}
