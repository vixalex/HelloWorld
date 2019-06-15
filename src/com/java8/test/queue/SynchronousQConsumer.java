package com.java8.test.queue;

import java.util.concurrent.BlockingQueue;

public class SynchronousQConsumer implements Runnable {
	
	private BlockingQueue<Integer> data;
	
	public SynchronousQConsumer(BlockingQueue<Integer> synchronousQueue) {
		this.data = synchronousQueue;
	}

	@Override
	public void run() {
		while(true) {
			Integer consData;
			try {
				consData = data.take();
				System.out.println("Consumer Thread - " + Thread.currentThread().getName() + ", consumed data - " + consData);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
