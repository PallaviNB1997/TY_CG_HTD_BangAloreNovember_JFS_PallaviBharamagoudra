package com.capgemini.retailer_management_system.springboot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="ProductInfo")
public class ProductInfo {
	@Column(unique=true,nullable=false)
	@Id
	@GeneratedValue
	private int id;
	@Column
	private int user_id;
	@Column
	private String name;
	@Column
	private int quantity;
	@Column
	private String details;
}
