package com.capgemini.retailer_management_system.springboot.dao;

import java.util.List;

import com.capgemini.retailer_management_system.springboot.dto.ProductInfo;

public interface ProductInfoDao {
	public boolean addProduct(ProductInfo product);

	public ProductInfo getProduct(int id);

	public List<ProductInfo> getAllProducts();

}
