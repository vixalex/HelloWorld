package com.java8.test.queue;

import java.util.concurrent.BlockingQueue;

public class SynchronousQProducer implements Runnable {

	private BlockingQueue<Integer> data;
	
	public SynchronousQProducer(BlockingQueue<Integer> sharedQData) {
		this.data = sharedQData;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				int prodData = (int) Math.random();
				System.out.println("Producer Thread - " + Thread.currentThread().getName() + ", putting data - " + prodData);
				data.put(prodData);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
