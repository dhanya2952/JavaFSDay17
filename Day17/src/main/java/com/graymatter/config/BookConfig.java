package com.graymatter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.graymatter.beans.Author;
import com.graymatter.beans.Book;

@Configuration
//configuration file on the application
@ComponentScan("com.graymatter.beans")
@PropertySource("classpath:data.properties")

public class BookConfig {
	
//	@Bean
//	public Book book()
//	{
//		return new Book("java","QWE122",100, getAuthor());
//	}
	
//	//@Bean(name="author")
//	public Author getAuthor()
//	{
//		return new Author("dhanya",11);
//	}
}
