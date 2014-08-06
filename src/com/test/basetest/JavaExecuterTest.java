package com.test.basetest;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class JavaExecuterTest {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Runnable testRun = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					TimeUnit.SECONDS.sleep(10);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
				System.out.printf("hello I wake up!  %s \n", new Date());
			}
		};
		ExecutorService executorService = Executors.newCachedThreadPool();
		if(executorService.submit(testRun).get() == null){
			System.out.println("I wake up!!!!!");
		}
		executorService.shutdown();
	}
}
