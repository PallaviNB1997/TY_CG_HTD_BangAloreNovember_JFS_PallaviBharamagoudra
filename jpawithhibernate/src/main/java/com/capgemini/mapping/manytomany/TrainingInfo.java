package com.capgemini.mapping.manytomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.capgemini.mapping.one_to_one.EmployeeInfo;

import lombok.Data;
@Data
@Entity
@Table(name="training_info")
public class TrainingInfo {

	@Id//pri key
	@Column
	private int tid;
	@Column
	private String name;
	@Column
	private String duration;
	
	 @ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(name="employee_training",joinColumns = @JoinColumn(name="tid"),//emp trng is commen class
	 inverseJoinColumns = @JoinColumn(name="eid"))//to connect btn tables and connect btn pri key of 2 tables
private	List<EmployeeInfo> eList;
}
