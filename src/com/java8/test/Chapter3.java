package com.java8.test;

import java.util.Arrays;

public class Chapter3 {
	//final
	String value;

	public Chapter3(String value) {
		this.value = value;
	}

	public void print() {
		System.out.println(value);
	}
	
	public void change(Chapter3 c) {
		c.value = "v";
	}

	public static void main(String[] args) {
		Arrays.asList(new Chapter3("a"), new Chapter3("b")).forEach(Chapter3::print);
		Chapter3 c = new Chapter3("a");
		System.out.println(c.toString());
		c.change(c);
		System.out.println(c.toString());
	}
	
	@Override
	public String toString() {
		return value;
	}
}
