package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.response.EmployeeResponse;
import com.example.demo.service.IEmployeeServive;

@CrossOrigin
@RestController
public class EmployeeController {

	@Autowired
	private IEmployeeServive iEmployeeServive;
	
	@GetMapping(value="/employee")
	public EmployeeResponse showContact(@RequestParam("page") int page,
			                                   @RequestParam("limit") int limit) {
		
		EmployeeResponse result = new EmployeeResponse();
		result.setPage(page);
		Pageable pageable = PageRequest.of(page-1, limit);
		result.setListResult(iEmployeeServive.findAll(pageable));
		result.setTotalPage((int)Math.ceil( (double) (iEmployeeServive.totalTtem()) / limit));
		return result;
		
	}
}
