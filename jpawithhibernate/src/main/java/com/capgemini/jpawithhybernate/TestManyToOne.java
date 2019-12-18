package com.capgemini.jpawithhybernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.mapping.manytoone.EmployeeExperience;
import com.capgemini.mapping.one_to_one.EmployeeInfo;

public class TestManyToOne {
	public static void main(String[] args) {

		EmployeeInfo info=new EmployeeInfo();
		info.setEid(301);
		info.setEmail("pall@");
		info.setName("deepz");
		info.setPassword("jhhh");

		
		EmployeeExperience emp2=new EmployeeExperience();
		emp2.setCompany("tyss");
		emp2.setExpid(401);
		emp2.setNoOfYear("four");
		emp2.setEmployee(info);
		
		EmployeeExperience emp3=new EmployeeExperience();
		emp3.setCompany("capg");
		emp3.setExpid(402);
		emp3.setNoOfYear("five");
		emp3.setEmployee(info);
		
 
		 
 
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(emp3);
			entityManager.persist(emp2);
			System.out.println("record saved..");
			transaction.commit(); //it is used to insert data into database
			entityManager.clear();
		}catch(Exception e) {
			e.printStackTrace();
		
		}
		
		entityManager.close();
	}//end of the main method
}
