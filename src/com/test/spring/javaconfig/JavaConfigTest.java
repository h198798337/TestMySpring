package com.test.spring.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(BusinessConfigure.class)
public class JavaConfigTest {
	@Value("#{test}")
	private Person son;
	
	@Bean(name = "parent")
	public Person person() {
		System.out.println("son " + son.getName() + ":" + son.getAge());
		Person parent = new Person();
		parent.setName("Baka");
		parent.setAge(48);
		return parent;
	}
}
