package com.capgemini.mapping.one_to_one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="employee_other_info")
public class EmployeeOtherInfo {
		
	@Id
	@Column
	private int id;
	@Column
	private String pancard;
	@Column
	private String fatername;
	@Column
	private String mothername;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="eid")
	private EmployeeInfo emp1;

	}


