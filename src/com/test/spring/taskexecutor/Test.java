package com.test.spring.taskexecutor;

import java.util.concurrent.ExecutionException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {

	/**
	 * @param args
	 * @throws ExecutionException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/spring/taskexecutor/applicationContext.xml");
		ThreadMangerCenter center = context.getBean("ThreadMangerCenter", ThreadMangerCenter.class);
		center.manger();
	}

}
