package com.test.spring.taskexecutor;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.SyncTaskExecutor;
import org.springframework.core.task.support.TaskExecutorAdapter;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

@Component("ThreadMangerCenter")
public class ThreadMangerCenter {

	@Autowired
	private TaskExecutorAdapter taskExecutorAdapter;
	
	@Autowired
	private SimpleAsyncTaskExecutor simpleAsyncTaskExecutor;
	
	@Autowired
	private SyncTaskExecutor syncTaskExecutor;
	
	@Autowired
	private ThreadPoolTaskExecutor threadPoolTaskExecutor;
	
	@Autowired
	private ThreadPoolTaskScheduler threadPoolTaskScheduler;
	
	@Autowired
	private HelloTask helloTask;
	
	public void manger() throws InterruptedException, ExecutionException {
//		for (int i = 0; i < 20; i++) {
//			taskExecutorAdapter.submit(helloTask);
//		}
//		for (int i = 0; i < 20; i++) {
//			simpleAsyncTaskExecutor.execute(helloTask);
//		}
//		for (int i = 0; i < 20; i++) {
//			syncTaskExecutor.execute(helloTask);
//		}
//		for (int i = 0; i < 20; i++) {
//			threadPoolTaskExecutor.execute(helloTask);
//		}
//		threadPoolTaskExecutor.shutdown();
		threadPoolTaskScheduler.scheduleAtFixedRate(helloTask, 10000);
		TimeUnit.SECONDS.sleep(20);
		threadPoolTaskScheduler.shutdown();
	}
	
}
