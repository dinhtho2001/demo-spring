package com.example.demo.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "Employee")
public class EmployeeEntity extends BaseEntity{

	@Column(name = "Name")
	private String Name;
	
	@Column(name = "Birthday")
	private Date Birthday;
	
	@Column(name = "Sex")
	private Boolean Sex;
	
	@Column(name = "Phone")
	private String Phone;
	
	@Column(name = "Address")
	private String Address;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}


	public Boolean getSex() {
		return Sex;
	}

	public void setSex(Boolean sex) {
		Sex = sex;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Date getBirthday() {
		return Birthday;
	}

	public void setBirthday(Date birthday) {
		Birthday = birthday;
	}

	
	
	
}
