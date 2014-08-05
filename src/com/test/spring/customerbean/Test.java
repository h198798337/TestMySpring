package com.test.spring.customerbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/spring/customerbean/applicationContext.xml");
		Worker worker = (Worker) context.getBean("worker");
		((ClassPathXmlApplicationContext) context).close(); 
	}

}
