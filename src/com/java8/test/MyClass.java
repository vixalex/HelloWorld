package com.java8.test;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void log() {
		// TODO Auto-generated method stub
		Interface1.super.log();
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println(Math.abs(3*0.1));
		
		if(Math.abs(3*0.1) == 0.3) {
			System.out.println("true");
		}
		
		double d = 0.1;
		long l = (long) d;
		
		//long l1 = 0.2;
		
		System.out.println(l);
		
		double d1 = 10.5;               // 8 bytes
	    // float  f1 = d1;              // error, double to float, no implicit
	          
	    float f1 = (float) d1;          // explicit casting
	    
	    System.out.println("double value: " + f1);             // prints 10.5, but as double
	    System.out.println("Converted float value: " + f1);    // prints 10.5, but as float
		
	}

}
