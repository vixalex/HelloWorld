package com.java8.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	
	public static void main(String[] args) {
		List<String> words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
		
		Stream<String> s = words.stream();
		s.sorted()
		 .limit(2)
		 .forEach(System.out::println);
		
		List<String> wordsNull = Arrays.asList("nonnull", null, "");
		wordsNull.stream()
		.filter(t-> t != null)
		.forEach(System.out::println);
		
		Stream<String> charStr = Stream.of("a","c","b","d","f","e");
		charStr.map(String::toUpperCase).sorted().forEach(System.out::println);
		
		int op = IntStream.of(1,2,3,4,5,6,7).reduce(1, (sum,n)->sum+=n);
		System.out.println(op);
		
		
		
	}

}
