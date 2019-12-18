package com.capgemini.forest_management.services;

import java.util.List;

import com.capgemini.forest_management.bean.ProductBean;

public interface ProductServices {
	public boolean addProduct(ProductBean bean);
	public boolean deleteProduct(int ProductId);
	List<ProductBean> getAllProduct();
}
