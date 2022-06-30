package com.example.demo.converter;

import org.springframework.stereotype.Component;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.EmployeeEntity;

@Component
public class EmployeeConverter {

	public EmployeeEntity toEntity(EmployeeDTO dto) {
		EmployeeEntity entity = new EmployeeEntity();
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setSex(dto.getSex());
		entity.setPhone(dto.getPhone());
		entity.setAddress(dto.getAddress());
		return entity;
	}
//	
	public EmployeeEntity toEntity(EmployeeDTO dto, EmployeeEntity entity) {
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setSex(dto.getSex());
		entity.setPhone(dto.getPhone());
		entity.setAddress(dto.getAddress());
		return entity;
	}
//	
	public EmployeeDTO toDTO(EmployeeEntity entity) {
		EmployeeDTO dto = new EmployeeDTO();
		dto.setName(entity.getName());
		dto.setAge(entity.getAge());
		dto.setSex(entity.getSex());
		dto.setPhone(entity.getPhone());
		dto.setAddress(entity.getAddress());
		return dto;
	}
	
}
