package com.test.springstrategy1;

import org.springframework.beans.factory.annotation.Required;

public class Apple extends Fruit{
	
	private String volume;
	
	public Apple(){
		super("apple", "", 10);
	}
	
	public Apple(String name, String nutrition, int pay) {
		super(name, nutrition, pay);
		// TODO Auto-generated constructor stub
		System.out.println("apple create");
	}

	public String getVolume() {
		return volume;
	}

//	@Required
	public void setVolume(String volume) {
		this.volume = volume;
	}
}
