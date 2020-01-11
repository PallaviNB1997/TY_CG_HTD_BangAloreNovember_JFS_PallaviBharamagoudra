package com.capgemini.retailer_management_system.springboot.dao;

import java.util.List;

import com.capgemini.retailer_management_system.springboot.dto.OrderInfo;


public interface OrderInfoDao {
	public boolean addorder(OrderInfo order);

	public OrderInfo getorder(int id);

	public List<OrderInfo> getAllorders();

}
