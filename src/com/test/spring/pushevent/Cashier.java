package com.test.spring.pushevent;

import java.util.Date;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component("cashier")
public class Cashier implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher applicationEventPublisher;
	
	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.applicationEventPublisher = applicationEventPublisher;
	}

	public void checkOut() {
		CheckOutEvent checkOutEvent = new CheckOutEvent(this, 12, new Date());
		applicationEventPublisher.publishEvent(checkOutEvent);
	}
	
}
