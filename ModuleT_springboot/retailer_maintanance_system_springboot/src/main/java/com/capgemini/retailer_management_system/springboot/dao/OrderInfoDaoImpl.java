package com.capgemini.retailer_management_system.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailer_management_system.springboot.dto.OrderInfo;
@Repository
public class OrderInfoDaoImpl implements OrderInfoDao {

	@PersistenceUnit
	EntityManagerFactory factory;
	
	@Override
	public boolean addorder(OrderInfo order) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(order);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public OrderInfo getorder(int id) {
		EntityManager manager = factory.createEntityManager();
		OrderInfo order = manager.find(OrderInfo.class, id);
		return order;
	}

	@Override
	public List<OrderInfo> getAllorders() {
		EntityManager manager = factory.createEntityManager();
		String getall = "from Product";
		TypedQuery<OrderInfo> query = manager.createQuery(getall, OrderInfo.class);
		return query.getResultList();
	}

}
