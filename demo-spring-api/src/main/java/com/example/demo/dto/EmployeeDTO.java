package com.example.demo.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeDTO {

	private String Name;
	private Date Birthday;
	private Boolean Sex;
	private String Phone;
	private String Address;
	private List<EmployeeDTO> listNhanVien = new ArrayList<>();
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Date getBirthday() {
		return Birthday;
	}
	public void setBirthday(Date birthday) {
		Birthday = birthday;
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
	public List<EmployeeDTO> getListNhanVien() {
		return listNhanVien;
	}
	public void setListNhanVien(List<EmployeeDTO> listNhanVien) {
		this.listNhanVien = listNhanVien;
	}
	
	
}
