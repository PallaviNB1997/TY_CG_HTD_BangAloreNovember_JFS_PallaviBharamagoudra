package com.capgemini.usage_collection.factory;

import com.capgemini.usage_collection.dao.ContractDAO;
import com.capgemini.usage_collection.dao.ContractDAOImpl;
import com.capgemini.usage_collection.dao.CustomerDAO;
import com.capgemini.usage_collection.dao.CustomerDaoImpl;
import com.capgemini.usage_collection.dao.ProductDAO;
import com.capgemini.usage_collection.dao.ProductDAOImpl;

public class Factory {
	
	public static CustomerDAO getCustImpl() {
		return new CustomerDaoImpl();
	}
	
	public static ContractDAO getContraImpl() {
		ContractDAO dao= new ContractDAOImpl();
		return dao;
	}
	
		
		public static ProductDAO getProdImpl() {
			return new ProductDAOImpl();
		
}
}