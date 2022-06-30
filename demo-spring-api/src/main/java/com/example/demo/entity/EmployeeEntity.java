package com.example.demo.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "Employee")
public class EmployeeEntity extends BaseEntity{

	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private Date age;
	
	@Column(name = "sex")
	private Boolean sex;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "address")
	private String address;

}
