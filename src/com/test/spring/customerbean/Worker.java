package com.test.spring.customerbean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Worker {
	private int payment;
	private int pushMoney;

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public int getPushMoney() {
		return pushMoney;
	}

	public void setPushMoney(int pushMoney) {
		this.pushMoney = pushMoney;
	}

	@PostConstruct
	public void startCount() {
		System.out.println("startCount : " + (payment + pushMoney));
	}

	@PreDestroy
	public void endCount() {
		System.out.println("endCount : " + (payment + 3 * pushMoney));
	}

}
