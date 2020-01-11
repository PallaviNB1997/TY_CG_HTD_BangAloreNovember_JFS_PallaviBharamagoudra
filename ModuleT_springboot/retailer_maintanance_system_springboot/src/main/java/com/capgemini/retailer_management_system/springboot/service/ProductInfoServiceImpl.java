package com.capgemini.retailer_management_system.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.retailer_management_system.springboot.dao.ProductInfoDao;
import com.capgemini.retailer_management_system.springboot.dao.UserInfoDao;
import com.capgemini.retailer_management_system.springboot.dto.ProductInfo;
@Service
public class ProductInfoServiceImpl implements ProductInfoService{
	@Autowired
	private ProductInfoDao dao;
	@Override
	public boolean addProduct(ProductInfo product) {
		// TODO Auto-generated method stub
		return dao.addProduct(product);
	}

	@Override
	public ProductInfo getProduct(int id) {
		// TODO Auto-generated method stub
		return dao.getProduct(id);
	}

	@Override
	public List<ProductInfo> getAllProducts() {
		// TODO Auto-generated method stub
		return dao.getAllProducts();
	}

}
