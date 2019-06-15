package com.java8.test;

import java.lang.reflect.Array;
import java.util.AbstractSequentialList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcModTest {

	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();

		m.put("1", "1");
		m.put("2", "2");
		m.put("3", "3");

		// List<String> l = new ArrayList<>();
		CopyOnWriteArrayList<String> l = new CopyOnWriteArrayList<>();// To avoid Concurrent Modification Exception

		l.add("1");
		l.add("2");
		l.add("3");

		System.out.println("Before - " + l);

		for (String s : l) {
			l.remove(s);
		}

		System.out.println("After - " + l);

		Iterator<String> i = m.keySet().iterator();

		while (i.hasNext()) {
			String next = i.next();
			if (next.equals("1")) {
				i.remove();
			} else {
				System.out.println(next);
			}
		}

		ConcurrentSkipListSet<String> csls = new ConcurrentSkipListSet<>();
		csls.add("1");
		csls.add("2");
		csls.add("3");

		System.out.println(csls);

		AbstractSequentialList<Integer> absl = new LinkedList<>();

		// adding elements to absl
		absl.add(7);
		absl.add(6);
		absl.add(5);

		// Printing the list
		System.out.println(absl);
		
		Integer[] ir = (Integer[]) Array.newInstance(Integer.class, 3);
		Array.setInt(ir, 0, 10);
		
		System.out.println(Arrays.toString(ir));

	}

}
