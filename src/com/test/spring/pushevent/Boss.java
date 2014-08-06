package com.test.spring.pushevent;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component("little_boss")
public class Boss implements ApplicationListener<CheckOutEvent>{

	@Override
	public void onApplicationEvent(CheckOutEvent event) {
		// TODO Auto-generated method stub
		System.out.println("earning " + event.getPay() + "  " + event.getDate());
	}

}
