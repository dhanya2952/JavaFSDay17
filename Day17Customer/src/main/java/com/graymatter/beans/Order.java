package com.graymatter.beans;

import java.util.List;

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

public class Order {
	
	//@Value("${Order.ordId}")
	private int ordId;
	//@Value("${Order.ordDate}")
	private String ordDate;
	@Autowired
	private List<Item> itemList;

}
