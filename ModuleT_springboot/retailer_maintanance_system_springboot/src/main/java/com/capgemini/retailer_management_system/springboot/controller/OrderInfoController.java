package com.capgemini.retailer_management_system.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.retailer_management_system.springboot.dto.OrderInfo;
import com.capgemini.retailer_management_system.springboot.dto.OrderInfoResponse;
import com.capgemini.retailer_management_system.springboot.dto.ProductInfo;
import com.capgemini.retailer_management_system.springboot.dto.ProductInfoResponse;
import com.capgemini.retailer_management_system.springboot.service.OrderInfoService;
import com.capgemini.retailer_management_system.springboot.service.ProductInfoService;

public class OrderInfoController {
	@Autowired
	OrderInfoService service;
	
	@PostMapping(path="/add-Order",produces = MediaType.APPLICATION_JSON_VALUE,
			consumes = MediaType.APPLICATION_JSON_VALUE)
	public OrderInfoResponse addOrder(@RequestBody OrderInfo order) {
		OrderInfoResponse response = new OrderInfoResponse();
		if(service.addorder(order)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Order with same name already exists");
		}
		return response;
	}
	
	@GetMapping(path="/view-Order",produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderInfoResponse viewOrder(@RequestParam("id") int id) {
		OrderInfoResponse response = new OrderInfoResponse();
		OrderInfo order=service.getorder(id);
		if(order!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Order found");
			response.setOrderInfo(Arrays.asList(order));
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Order id does not exist");
		}
		return response;
	}
	
	@GetMapping(path="/view-allOrders",produces = MediaType.APPLICATION_JSON_VALUE)
	public OrderInfoResponse viewAllOrders() {
		OrderInfoResponse response = new OrderInfoResponse();
		List<OrderInfo> list=service.getAllorders();
		if(list.size()!=0) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Orders found");
			response.setOrderInfo(list);
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("No data");
		}
		return response;
		
	}
}
