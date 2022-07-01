package com.example.demo.service;

import java.util.List;
import org.springframework.data.domain.Pageable;
import com.example.demo.dto.EmployeeDTO;
import com.example.demo.dto.response.EmployeeResponse;

public interface IEmployeeServive {

	List<EmployeeDTO> findAll(Pageable pageable);
	
	EmployeeResponse findAll(int page, int limit);
	
	int totalTtem();
}
