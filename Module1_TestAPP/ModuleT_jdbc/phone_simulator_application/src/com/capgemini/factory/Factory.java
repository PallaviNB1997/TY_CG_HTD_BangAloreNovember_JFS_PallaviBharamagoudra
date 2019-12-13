package com.capgemini.factory;

import com.capgemini.phone_simulator.dao.ContactDAO;
import com.capgemini.phone_simulator.dao.ContactDAOImpl;
import com.capgemini.phone_simulator.services.ContactService;
import com.capgemini.phone_simulator.services.ContactServiceImpl;

public class Factory {
	private Factory() {
	}
	public static ContactDAO instanceOfContactDAOImpl() {
		ContactDAO dao = new ContactDAOImpl();
		return dao;
	}
	public static ContactService instanceOfContactService() {
		ContactService service = new ContactServiceImpl();
		return service;

	}
}









