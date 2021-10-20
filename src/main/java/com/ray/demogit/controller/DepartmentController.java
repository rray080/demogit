package com.ray.demogit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ray.demogit.model.Department;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {
	// adding get mapping for department based on id
	@GetMapping("/department/{id}")
	public Department getDepartment(@PathVariable long id) {
		return new Department();
	}
	
	// adding get mapping for retrive all department
		@GetMapping("/department")
		public Department getDepartments() {
			return new Department();
		}
}
