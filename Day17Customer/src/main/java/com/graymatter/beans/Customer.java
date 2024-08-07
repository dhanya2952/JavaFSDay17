package com.graymatter.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
//@Component

public class Customer {
	
	//@Value("${Customer.custName}")
	private String custName;
	//@Value("${Customer.custId}")
	private int custId;
	//@Value("${Customer.mobile}")
	private String mobile;
	@Autowired
	private Order order;

}
