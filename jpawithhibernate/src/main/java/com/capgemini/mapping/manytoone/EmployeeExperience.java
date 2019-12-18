package com.capgemini.mapping.manytoone;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.capgemini.mapping.one_to_one.EmployeeInfo;

import lombok.Data;

@Data

@Entity
@Table(name="employee_experience")
public class EmployeeExperience {
@Id
@Column
private int expid;
@Column
private String company;
@Column
private String pancard;
@Column(name="duration")
private String noOfYear;


@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="eid")
private EmployeeInfo employee;

}
