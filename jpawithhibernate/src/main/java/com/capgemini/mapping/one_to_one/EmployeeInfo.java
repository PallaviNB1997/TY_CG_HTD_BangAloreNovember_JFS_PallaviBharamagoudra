package com.capgemini.mapping.one_to_one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.capgemini.mapping.manytoone.EmployeeExperience;

import lombok.Data;
import lombok.ToString.Exclude;


@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfo {
@Id
@Column
private int eid;
@Column
private String name;
@Column
private String email;
@Column
private String password;

@Exclude
@OneToOne(cascade = CascadeType.ALL,mappedBy="emp1")//2 way communication 
private EmployeeOtherInfo other;
@OneToMany(cascade = CascadeType.ALL,mappedBy="employee")//2 way communication
private EmployeeExperience experience;
@ManyToMany(cascade = CascadeType.ALL,mappedBy="eList")//2 way communication
private EmployeeExperience train;
}
