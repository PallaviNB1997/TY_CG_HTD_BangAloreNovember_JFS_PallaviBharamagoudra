package com.capgemini.retailer_management_system.springboot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Repository;

import com.capgemini.retailer_management_system.springboot.dto.UserInfo;
@Repository
public class UserInfoDaoImpl implements UserInfoDao{
@PersistenceUnit
EntityManagerFactory factory;
	@Override
	public boolean addUser(UserInfo User) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(User);
			transaction.commit();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public UserInfo getUser(int id) {
		EntityManager manager = factory.createEntityManager();
		UserInfo user = manager.find(UserInfo.class, id);
		return user;
	}

	@Override
	public List<UserInfo> getAllUsers() {
		EntityManager manager = factory.createEntityManager();
		String getall="from UserInfo";
		TypedQuery<UserInfo> query=manager.createQuery(getall,UserInfo.class);
		return query.getResultList();
	}

	@Override
	public UserInfo login(UserInfo userinfo) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from UserInfo where email=:email";
		TypedQuery<UserInfo> query = manager.createQuery(jpql, UserInfo.class);
		query.setParameter("email", userinfo.getEmail());
		
			UserInfo account = query.getSingleResult();
			if (account.getPassword().equals(userinfo.getPassword())) {
				return account;
			} else {
				return null;
			}
		
	}

	@Override
	public boolean updatePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		UserInfo user = manager.find(UserInfo.class, id);
		EntityTransaction transaction = manager.getTransaction();
		if (user != null) {
			transaction.begin();
			user.setPassword(password);
			transaction.commit();
			return true;
		} else {
			return false;
		}
	}

}
