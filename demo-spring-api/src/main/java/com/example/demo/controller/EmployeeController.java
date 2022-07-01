package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.dto.response.EmployeeResponse;
import com.example.demo.service.impl.EmployeeService;

@CrossOrigin
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(value="/employee")
	public EmployeeResponse showContact(@RequestParam("page") int page,
			                                   @RequestParam("limit") int limit) {
		
		return employeeService.findAll(page, limit);
	}
}
