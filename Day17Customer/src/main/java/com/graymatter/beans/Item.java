package com.graymatter.beans;

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

public class Item {
	
	
	private int itemId;
	private String itemName;
	private double cost;

}
