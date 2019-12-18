package com.capgemini.mapping.one_to_one;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class TestOneToOne {
	public static void main(String[] args) {

		EmployeeInfo emp1=new EmployeeInfo();
		emp1.setEid(002);
		emp1.setName("pavan");
		emp1.setEmail("pavan@gmail");
		emp1.setPassword("123abc");
		
		EmployeeOtherInfo other1 = new EmployeeOtherInfo();
	     other1.setId(202);
	     other1.setPancard("abc123");
	     other1.setFatername("abc");
	     other1.setMothername("pqr");
	     other1.setEmp1(emp1);
	     
		
 
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
     		EmployeeInfo emp6=entityManager.find(EmployeeInfo.class, 301);
     		
     		//complete the code
     	//	System.out.println(emp.get);//complete the code
     		//complete the code
     		
//			EmployeeOtherInfo emp9=entityManager.find(EmployeeOtherInfo, 201);
			entityManager.persist(other1);
			System.out.println("record saved..");
			transaction.commit(); //it is used to insert data into database
			entityManager.clear();
		}catch(Exception e) {
			e.printStackTrace();
		}
		entityManager.close();
	}//end of the main method
}
