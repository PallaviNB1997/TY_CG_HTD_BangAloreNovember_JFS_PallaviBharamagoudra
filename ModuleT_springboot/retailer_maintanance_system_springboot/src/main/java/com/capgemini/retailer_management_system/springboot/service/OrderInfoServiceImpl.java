package com.capgemini.retailer_management_system.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailer_management_system.springboot.dao.OrderInfoDao;
import com.capgemini.retailer_management_system.springboot.dao.UserInfoDao;
import com.capgemini.retailer_management_system.springboot.dto.OrderInfo;
@Service
public class OrderInfoServiceImpl implements OrderInfoService {
	@Autowired
	private OrderInfoDao dao;
	@Override
	public boolean addorder(OrderInfo order) {
		// TODO Auto-generated method stub
		return dao.addorder(order);
	}

	@Override
	public OrderInfo getorder(int id) {
		// TODO Auto-generated method stub
		return dao.getorder(id);
	}

	@Override
	public List<OrderInfo> getAllorders() {
		// TODO Auto-generated method stub
		return dao.getAllorders()
				;
	}

}
