package com.capgemini.forest_management.factory;

import com.capgemini.forest_management.dao.ContractDAO;
import com.capgemini.forest_management.dao.ContractDAOImpl;
import com.capgemini.forest_management.dao.CustomerDAO;
import com.capgemini.forest_management.dao.CustomerDAOImpl;
import com.capgemini.forest_management.dao.ProductDAO;
import com.capgemini.forest_management.dao.ProductDAOImpl;
import com.capgemini.forest_management.services.ContractServices;
import com.capgemini.forest_management.services.ContractServicesImpl;
import com.capgemini.forest_management.services.CustomerServices;
import com.capgemini.forest_management.services.CustomerServicesImpl;
import com.capgemini.forest_management.services.ProductServices;
import com.capgemini.forest_management.services.ProductServicesImpl;

public class Factory {
private Factory() {
	}
public static ContractDAO instanceOfContractDAOImpl() {
	ContractDAO dao = new ContractDAOImpl();
	 return dao;
}
public static ContractServices instanceOfContractServices() {
	ContractServices service = new ContractServicesImpl();
	return service;
	
}

public static CustomerDAO instanceOfCustomerDAOImpl() {
	CustomerDAO dao = new CustomerDAOImpl();
	 return dao;
}
public static CustomerServices instanceOfCustomerServices() {
	CustomerServices service = new CustomerServicesImpl();
	return service;
	
}

public static ProductDAO instanceOfProductDAOImpl() {
	ProductDAO dao = new ProductDAOImpl();
	 return dao;
}
public static ProductServices instanceOfProductServices() {
	ProductServices service =new ProductServicesImpl();
	return service;
	
}
}
