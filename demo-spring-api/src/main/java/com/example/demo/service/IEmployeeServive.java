package com.example.demo.service;

import java.util.List;
import org.springframework.data.domain.Pageable;
import com.example.demo.dto.EmployeeDTO;

public interface IEmployeeServive {

	List<EmployeeDTO> findAll(Pageable pageable);
	int totalTtem();
}
