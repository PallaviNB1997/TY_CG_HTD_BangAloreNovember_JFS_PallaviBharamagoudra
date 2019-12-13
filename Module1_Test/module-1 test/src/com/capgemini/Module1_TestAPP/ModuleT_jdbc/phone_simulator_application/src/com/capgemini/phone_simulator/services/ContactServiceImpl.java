package com.capgemini.phone_simulator.services;

import java.util.List;

import com.capgemini.factory.Factory;
import com.capgemini.phone_simulator.bean.ContactBean;
import com.capgemini.phone_simulator.dao.ContactDAO;

public class ContactServiceImpl implements ContactService {
	ContactDAO dao =Factory.instanceOfContactDAOImpl();
	@Override
	public boolean addContact(ContactBean bean) {
		// TODO Auto-generated method stub
		return dao.addContact(bean);
	}

	@Override
	public boolean deleteContact(String contactName) {
		// TODO Auto-generated method stub
		return dao.deleteContact(null);
	}

	@Override
	public boolean updateContact(String contactName, int contactNumber) {
		// TODO Auto-generated method stub
		return dao.updateContact(contactName, contactNumber);
	}

	@Override
	public List<ContactBean> getAllContacts() {
		// TODO Auto-generated method stub
		return dao.getAllContacts();
	}

}





























































