package com.gcp.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcp.demo.db.EmployeeDataUtil;
import com.gcp.demo.dto.Employee;

@RestController
public class EmployeeController {

	@GetMapping("/empList")
	public List<Employee> getEmployeeList() {
		return EmployeeDataUtil.getEmployeeData();
	}

}
