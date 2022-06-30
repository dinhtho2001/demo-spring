package com.example.demo.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "Employee")
public class EmployeeEntity{

	@Column(name = "name")
	private String name;
	
	@Column(name = "age")
	private Date Birthday;
	
	@Column(name = "Sex")
	private Boolean Sex;
	
	@Column(name = "Phone")
	private String Phone;
	
	@Column(name = "Address")
	private String Address;


	
}
