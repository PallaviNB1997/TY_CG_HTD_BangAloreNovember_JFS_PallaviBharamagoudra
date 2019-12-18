package com.capgemini.forest_management.services;

import java.util.List;

import com.capgemini.forest_management.bean.CustomerBean;
import com.capgemini.forest_management.dao.CustomerDAO;
import com.capgemini.forest_management.factory.Factory;


public class CustomerServicesImpl implements CustomerServices{
	CustomerDAO dao =Factory.instanceOfCustomerDAOImpl();

	@Override
	public boolean addCustomer(CustomerBean customer) {
		// TODO Auto-generated method stub
		return dao.addCustomer(customer);
	}

	@Override
	public boolean deleteCustomer(int customerid) {
		// TODO Auto-generated method stub
		return dao.deleteCustomer(customerid);
	}

	@Override
	public boolean modifyCustomer(int customerid, String email) {
		// TODO Auto-generated method stub
		return dao.modifyCustomer(customerid, email);
	}

	@Override
	public List<CustomerBean> getAllCustomers() {
		// TODO Auto-generated method stub
		return dao.getAllCustomer();
	}


}
