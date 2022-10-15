package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="phone_no")
	private long phone_no;
	
	@Column(name="Address")
	private String Address;
	
	@Column(name="Department")
	private String Department;

	public Employee() {	}

	@Autowired
	public Employee(int id, String first_name, String last_name, long phone_no, String address, String department) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_no = phone_no;
		this.Address = address;
		this.Department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public long getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		this.Department = department;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_name=" + first_name + ", LastName=" + last_name + ", PhoneNo=" + phone_no
				+ ", Address=" + Address + ", Department=" + Department + "]";
	}	
	
}
