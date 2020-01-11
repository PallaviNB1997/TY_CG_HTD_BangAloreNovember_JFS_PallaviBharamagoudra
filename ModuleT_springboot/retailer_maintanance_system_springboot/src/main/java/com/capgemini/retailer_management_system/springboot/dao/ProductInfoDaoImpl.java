package com.capgemini.retailer_management_system.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.retailer_management_system.springboot.dto.ProductInfo;

@Repository
public class ProductInfoDaoImpl implements ProductInfoDao {
	@PersistenceUnit
	EntityManagerFactory factory;

	@Override
	public boolean addProduct(ProductInfo product) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(product);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	@Override
	public ProductInfo getProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		ProductInfo product = manager.find(ProductInfo.class, id);
		return product;
	}

	@Override
	public List<ProductInfo> getAllProducts() {
		EntityManager manager = factory.createEntityManager();
		String getall = "from ProductInfo";
		TypedQuery<ProductInfo> query = manager.createQuery(getall, ProductInfo.class);
		return query.getResultList();
	}

}
