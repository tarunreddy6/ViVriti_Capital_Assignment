package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.Service_Declaration;

@RestController
public class Employee_Controller {
	
	@Autowired
	private Service_Declaration service;
	
	public Employee_Controller(Service_Declaration service) {
		// TODO Auto-generated constructor stub
		this.service = service;
	}
	
	@GetMapping("/employees")
	public List<Employee> displayAll(){
		return service.findAll();
	}
	
	@GetMapping("employees/{employeeId}")
	public Employee displayById(@PathVariable int employeeId) throws Exception {
		
		Employee employee = service.findById(employeeId);
		if(employee == null)
			throw new Exception("details not found "+employeeId);
		else
			return employee;		
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		employee.setId(0);
		service.insertOrUpdate(employee);
		return employee;
	}
	
	@PatchMapping("/employee/{employeeId}")
	public Employee updateEmployee(@RequestBody Employee employee) {
		
		service.insertOrUpdate(employee);
		return employee;
	}
	
	@DeleteMapping("/employee/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) throws Exception {
		
		Employee employee = service.findById(employeeId);
		if(employee == null)
			throw new Exception("details not not found"+employeeId);
			else {
				service.deleteById(employeeId);
				return "User Deleted Successfully "+employeeId;	
			}		
	}

}