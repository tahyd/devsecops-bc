package com.devsecops.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.devsecops.models.Employee;

@RestController
public class EmployeeController {
	
	@GetMapping("/employee/{eid}")
	public Employee employee(@PathVariable("eid") int eid) {
		
		Employee employee = new Employee(eid, "PAV_"+eid);
		 
		return employee;
	}

	
	

}
