package com.graymatter.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@PropertySource("classpath:data.properties")
public class Employee {
	
//	setter based injection
//	@Value("dhanya")
	@Value("${Employee.empName}")
	private String empName;
//	@Value("123")
	@Value("${Employee.empId}")
	private int empId;
//	@Value("2222222")
	@Value("${Employee.empSal}")
	private double empSal;
	//@Autowired
	private Department department;
	
	//@Autowired
	public Employee() {
		super();
	}
	
	//@Autowired
	public Employee(String empName, int empId, double empSal, Department department) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.empSal = empSal;
		this.department = department;
	}
	
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSal=" + empSal + ", department=" + department
				+ "]";
	}
	
	

}
