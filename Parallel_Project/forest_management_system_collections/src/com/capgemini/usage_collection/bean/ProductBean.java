package com.capgemini.usage_collection.bean;

import java.io.Serializable;

public class ProductBean implements Serializable {
private int productId;
private String productName;
@Override
public String toString() {
	return "ProductBean [productId=" + productId + ", productName=" + productName + "]";
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}

}
