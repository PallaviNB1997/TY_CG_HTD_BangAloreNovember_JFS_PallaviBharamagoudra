package com.capgemini.phone_simulator.dao;

import java.util.List;

import com.capgemini.phone_simulator.bean.ContactBean;

public interface ContactDAO {
	public boolean addContact(ContactBean bean);
	public boolean deleteContact(String contactName);
	public boolean updateContact(String contactName,int contactNumber);
	List<ContactBean> getAllContacts();
}






































