package com.graymatter.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.graymatter.beans.Customer;
import com.graymatter.beans.Item;
import com.graymatter.beans.MyDataSource;
import com.graymatter.beans.Order;

@Configuration
@ComponentScan("com.graymatter.beans")
//@PropertySource("classpath:data.properties")

public class CustomerConfig {
	
	@Bean
	public Customer customer()
	{
		return new Customer("dhanya",12,"122211212",order());
	}
	
	@Bean
	public Order order()
	{
		return new Order(1009,"06/08/2024",itemList());
	}
	
	@Bean
    public List<Item> itemList() {
        return Arrays.asList(
            new Item(99, "abc", 20),
            new Item(100, "def", 10),
            new Item(101, "ghi", 15)
        );
    }
	
//	@Bean
//	public MyDataSource mydatasource()
//	{
//		return new MyDataSource();
//	}

}
