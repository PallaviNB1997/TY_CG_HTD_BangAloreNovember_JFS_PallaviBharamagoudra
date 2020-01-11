package com.capgemini.retailer_management_system.springboot.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="UserInfo")
public class UserInfo {
	@Column(unique=true,nullable=false)
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
}
