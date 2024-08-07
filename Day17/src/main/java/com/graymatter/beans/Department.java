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
public class Department {
	
	@Value("${Department.deptName}")
	private String deptName;
	@Value("${Department.deptId}")
	private int deptId;
	
	//@Autowired
	public Department() {
		super();
	}
	
	//@Autowired
	public Department(String deptName, int deptId) {
		super();
		this.deptName = deptName;
		this.deptId = deptId;
	}
	
	@Override
	public String toString() {
		return "Department [deptName=" + deptName + ", deptId=" + deptId + "]";
	}
	
	
	
	

}
