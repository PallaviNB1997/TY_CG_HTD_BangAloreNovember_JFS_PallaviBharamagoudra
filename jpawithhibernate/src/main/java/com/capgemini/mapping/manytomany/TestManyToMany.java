package com.capgemini.mapping.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.mapping.manytoone.EmployeeExperience;
import com.capgemini.mapping.one_to_one.EmployeeInfo;

public class TestManyToMany {
	public static void main(String[] args) {

		EmployeeInfo info=new EmployeeInfo();
		info.setEid(501);
		info.setEmail("roop@");
		info.setName("roopz");
		info.setPassword("jhhbh");
		
		EmployeeInfo info1=new EmployeeInfo();
		info1.setEid(502);
		info1.setEmail("roopaa@");
		info1.setName("roopaaaa");
		info1.setPassword("jhhhhjbh");
		
		ArrayList<EmployeeInfo> aList=new ArrayList<EmployeeInfo>();
		aList.add(info);
		aList.add(info1);
		
		TrainingInfo tinfo=new TrainingInfo();
		tinfo.setTid(601);
		tinfo.setName("disha");
		tinfo.setEList(aList);		 
 
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test1");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(tinfo);
			System.out.println("record saved..");
			transaction.commit(); //it is used to insert data into database
			entityManager.clear();
		}catch(Exception e) {
			e.printStackTrace();
		
		}		
		entityManager.close();
	}//end of the main method
}//end of the class
