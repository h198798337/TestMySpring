package com.test.spring.beanawaretest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/spring/beanawaretest/applicationContext.xml");
		Cashier cashier = (Cashier) context.getBean("Cashierss");
		System.out.println(cashier.getName());
		
	}

}
