package com.test.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigTest.class);
		Person person = context.getBean("test", Person.class);
		System.out.println(person + " " + person.getName() + ":" + person.getAge());
		Person person2 = context.getBean("parent", Person.class);
		System.out.println(person2 + " " + person2.getName() + ":" + person2.getAge());
	}

}
