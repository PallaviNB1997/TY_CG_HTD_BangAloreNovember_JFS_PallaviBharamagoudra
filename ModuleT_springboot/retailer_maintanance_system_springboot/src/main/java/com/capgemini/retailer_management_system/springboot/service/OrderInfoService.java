package com.capgemini.retailer_management_system.springboot.service;

import java.util.List;

import com.capgemini.retailer_management_system.springboot.dto.OrderInfo;

public interface OrderInfoService {
	public boolean addorder(OrderInfo order);

	public OrderInfo getorder(int id);

	public List<OrderInfo> getAllorders();

}
