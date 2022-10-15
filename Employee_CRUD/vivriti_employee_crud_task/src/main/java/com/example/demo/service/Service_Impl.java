package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.DAO.EmployeeRepository;
import com.example.demo.entity.Employee;

@Service
public class Service_Impl implements Service_Declaration {

	@Autowired
	private EmployeeRepository employeerepository;
	
	public Service_Impl(EmployeeRepository employeerepository) {
		this.employeerepository = employeerepository;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeerepository.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int id) {
		// TODO Auto-generated method stub
		return employeerepository.findById(id).get();
	}

	@Override
	@Transactional
	public void insertOrUpdate(Employee employee) {
		// TODO Auto-generated method stub
		employeerepository.save(employee);
		
	}

	@Override
	@Transactional
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		employeerepository.deleteById(id);
	}
	

}
