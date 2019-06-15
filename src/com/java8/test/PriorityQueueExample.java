package com.java8.test;

import java.util.PriorityQueue;

public class PriorityQueueExample {
	
	public static void main(String[] args) {
		PriorityQueue<String> q = new PriorityQueue<>();
		
		q.add("Jon");
		q.add("Vik");
		q.add("Seb");
		q.add("Tim");
		
		System.out.println("head bef:"+q.element());  
		System.out.println("head peek:"+q.peek());
		
		q.poll();
		
		System.out.println("head aft:"+q.element());
	}

}
