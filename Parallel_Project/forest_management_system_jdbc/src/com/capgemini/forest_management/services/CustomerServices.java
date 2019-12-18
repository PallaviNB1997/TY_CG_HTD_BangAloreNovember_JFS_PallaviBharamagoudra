package com.capgemini.forest_management.services;

import java.util.List;

import com.capgemini.forest_management.bean.CustomerBean;

public interface CustomerServices {
    
	public boolean addCustomer(CustomerBean customer);
    public boolean deleteCustomer(int customerid);    	
    public boolean modifyCustomer(int customerid, String email);

	List<CustomerBean> getAllCustomers();
	
    

}
