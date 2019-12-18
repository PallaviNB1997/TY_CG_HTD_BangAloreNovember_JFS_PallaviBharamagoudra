package com.capgemini.usage_collection.dao;

import java.util.List;

import com.capgemini.usage_collection.bean.CustomerBean;

public interface CustomerDAO {
	public boolean addCustomer(CustomerBean bean);
	public boolean deleteCustomer(int customerId);
	public boolean modifyCustomer(CustomerBean bean);
	List<CustomerBean> getAllCustomer();
	

}
