package com.capgemini.forest_management.dao;

import java.util.List;

import com.capgemini.forest_management.bean.CustomerBean;

public interface CustomerDAO {
	public boolean addCustomer(CustomerBean bean);
	public boolean deleteCustomer(int customerid);
	public boolean modifyCustomer(int customerid,String email);
	List<CustomerBean> getAllCustomer();
}
