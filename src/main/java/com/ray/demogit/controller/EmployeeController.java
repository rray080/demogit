package com.ray.demogit.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ray.demogit.model.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	// added a post request
	@PostMapping("/employee")
	public Employee addEmp(@RequestBody Employee emp) {
		return emp;
	}
}
