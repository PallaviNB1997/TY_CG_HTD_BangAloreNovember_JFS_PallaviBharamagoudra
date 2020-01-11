package com.capgemini.retailer_management_system.springboot.dto;

import java.util.List;

import lombok.Data;

@Data
public class OrderInfoResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<OrderInfo> orderInfo;
}
