package com.capgemini.retailer_management_system.springboot.service;

import java.util.List;

import com.capgemini.retailer_management_system.springboot.dto.ProductInfo;

public interface ProductInfoService {
	public boolean addProduct(ProductInfo product);

	public ProductInfo getProduct(int id);

	public List<ProductInfo> getAllProducts();

}
