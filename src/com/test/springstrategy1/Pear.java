package com.test.springstrategy1;

public class Pear extends Fruit{
	public Pear(){
		super("Pear", "", 10);
	}
	
	public Pear(String name, String nutrition, int pay) {
		super(name, nutrition, pay);
		// TODO Auto-generated constructor stub
		System.out.println("Pear create");
	}
}
