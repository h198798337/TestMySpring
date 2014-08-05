package com.test.spring.beanawaretest;

import org.springframework.beans.factory.BeanNameAware;

public class Cashier implements BeanNameAware {
	private String name;

	@Override
	public void setBeanName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
