package com.test.spring.externalproperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/spring/externalproperties/applicationContext.xml");
		Cashier cashier = (Cashier) context.getBean("casher");
		System.out.println(cashier.getPath());
	}

}
