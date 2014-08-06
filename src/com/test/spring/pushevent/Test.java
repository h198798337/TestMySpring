package com.test.spring.pushevent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/spring/pushevent/applicationContext.xml");
		Cashier cashier = context.getBean("cashier", Cashier.class);
		cashier.checkOut();
	}

}
