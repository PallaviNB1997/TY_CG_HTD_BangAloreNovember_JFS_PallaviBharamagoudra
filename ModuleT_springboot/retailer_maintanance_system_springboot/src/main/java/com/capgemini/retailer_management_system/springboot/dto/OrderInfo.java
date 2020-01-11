package com.capgemini.retailer_management_system.springboot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="OrderInfo")
public class OrderInfo {
	@Column(unique=true,nullable=false)
	@Id
	@GeneratedValue
	private int id;
	@Column
	private int product_id;
	@Column
	private int user_id;
}
