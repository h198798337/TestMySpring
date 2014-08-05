package com.test.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BusinessConfigure {
	@Bean(name = "test")
	public Person person() {
		Person person = new Person();
		person.setName("Yoka");
		person.setAge(18);
		return person;
	}
}
