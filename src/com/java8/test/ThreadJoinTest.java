package com.java8.test;

public class ThreadJoinTest implements Runnable {
	
	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		System.out.println("Current Thread in execution - " + currentThread.getName());
		
		// checks if current thread is alive 
        System.out.println("Is Alive? " +  currentThread.isAlive());
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new ThreadJoinTest());
		
		t.start();
		t.setName("ThreadJoinTestThread");
		// Waits for 1000ms this thread to die. 
        t.join(1000); 
  
        System.out.println("\nJoining after 1000 mili seconds: \n"); 
        System.out.println("Current thread: " + 
                                    t.getName()); 
  
  
        // Checks if this thread is alive 
        System.out.println("Is alive? " + t.isAlive()); 
	}

}
