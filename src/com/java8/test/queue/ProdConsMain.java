package com.java8.test.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProdConsMain {

	public static void main(String[] args) {
		final BlockingQueue<Integer> synchronousQueue = new LinkedBlockingQueue<>();
				//new SynchronousQueue<Integer>();

		SynchronousQProducer queueProducer = new SynchronousQProducer(synchronousQueue);
		new Thread(queueProducer).start();

		SynchronousQConsumer queueConsumer1 = new SynchronousQConsumer(synchronousQueue);
		new Thread(queueConsumer1).start();

		SynchronousQConsumer queueConsumer2 = new SynchronousQConsumer(synchronousQueue);
		new Thread(queueConsumer2).start();
	}
}
