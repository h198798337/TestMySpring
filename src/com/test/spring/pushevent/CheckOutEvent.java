package com.test.spring.pushevent;

import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class CheckOutEvent extends ApplicationEvent {

	private int pay;
	private Date date;

	public CheckOutEvent(Object source, int pay, Date date) {
		super(source);
		// TODO Auto-generated constructor stub
		this.pay = pay;
		this.date = date;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
