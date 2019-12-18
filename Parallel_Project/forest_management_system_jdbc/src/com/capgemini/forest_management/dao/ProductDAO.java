package com.capgemini.forest_management.dao;

import java.util.List;

import com.capgemini.forest_management.bean.ProductBean;

public interface ProductDAO {
	public boolean addProduct(ProductBean bean);
	public boolean deleteProduct(int ProductId);
	List<ProductBean> getAllProduct();
}
 