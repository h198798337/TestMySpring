package com.test.spring.taskexecutor;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class HelloTask implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
		System.out.println("Hello, I wake up!!!");
	}

}
