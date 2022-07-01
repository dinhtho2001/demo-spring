package com.example.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.demo.converter.EmployeeConverter;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.dto.response.EmployeeResponse;
import com.example.demo.entity.EmployeeEntity;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.service.IEmployeeServive;

@Service
public class EmployeeService implements IEmployeeServive{

	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private EmployeeConverter employeeConverter;
	
	@Override
	public List<EmployeeDTO> findAll(Pageable pageable){		
		List<EmployeeDTO> employeeDTOs = new ArrayList<>();
		
		List<EmployeeEntity> employeeEntities = employeeRepository.findAll(pageable).getContent();
		for(EmployeeEntity item : employeeEntities) {
			EmployeeDTO employeeDTO = employeeConverter.toDTO(item);
			employeeDTOs.add(employeeDTO);
		}
		return employeeDTOs;
	}

	@Override
	public EmployeeResponse findAll(int page, int limit) {
		EmployeeResponse employeeResponse = new EmployeeResponse();
		employeeResponse.setPage(page);
		Pageable pageable = PageRequest.of(page-1, limit);
		employeeResponse.setListResult(findAll(pageable));
		employeeResponse.setTotalPage((int)Math.ceil( (double) (totalTtem()) / limit));
		return employeeResponse;
	}
	
	@Override
	public int totalTtem() {
		return (int)employeeRepository.count();
	}

}
