package com.test.springstrategy1;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/test/springstrategy1/applicationContext.xml");
		/*SequenceGenerator generator = (SequenceGenerator) context.getBean("squenceGenerator");
		System.out.println(generator.getPrefix());
		System.out.println(generator.getSuffix());
		System.out.println(generator.getInitial());*/
		
		/*Fruit fruit = (Fruit)context.getBean("fruit");
		System.out.println("fruit: " + fruit.getName());
		System.out.println("fruit: " + fruit.getNutrition());
		System.out.println("fruit: " + fruit.getPay());
		fruit.setNutrition("Just a taste!!");
		
		Apple apple = (Apple)context.getBean("apple");
		System.out.println("apple: " + apple.getName());
		System.out.println("apple: " + apple.getNutrition());
		System.out.println("apple: " + apple.getPay());
		
		Pear pear = (Pear)context.getBean("pear");
		System.out.println("pear: " + pear.getName());
		System.out.println("pear: " + pear.getNutrition());
		System.out.println("pear: " + pear.getPay());*/
		
		/*RepertoryService repertoryService = (RepertoryService)context.getBean("repertoryService");
		List<?> list = repertoryService.getSomeFruits(0);
		for (Object object : list) {
			if(object instanceof Apple){
				Apple apple = (Apple)object;
				System.out.println(apple.getName() + " " + apple.getPay());
			}
		}
		System.out.println("test");*/
		
		Apple apple = (Apple)context.getBean("apple");
		System.out.println(apple.getName() + " " + apple);
		Apple apple2 = (Apple)context.getBean("apple");
		System.out.println(apple2.getName() + " " + apple2);
		
		Pear pear = (Pear)context.getBean("pear");
		System.out.println(pear.getName() + " " + pear);
		Pear pear2 = (Pear)context.getBean("pear");
		System.out.println(pear2.getName() + " " + pear2);
	}

}
