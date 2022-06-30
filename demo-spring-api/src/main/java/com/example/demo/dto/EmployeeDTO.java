package com.example.demo.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDTO {

	private String name;
	private Date age;
	private Boolean sex;
	private String phone;
	private String address;
	private List<EmployeeDTO> listEmployee = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getAge() {
		return age;
	}
	public void setAge(Date age) {
		this.age = age;
	}
	public Boolean getSex() {
		return sex;
	}
	public void setSex(Boolean sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<EmployeeDTO> getListEmployee() {
		return listEmployee;
	}
	public void setListEmployee(List<EmployeeDTO> listEmployee) {
		this.listEmployee = listEmployee;
	}

	
	
	
	
}
