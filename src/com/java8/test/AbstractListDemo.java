package com.java8.test;

import java.util.AbstractList;
import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings(value = { "rawtypes" })
public class AbstractListDemo extends AbstractSequentialList<Object> {

	List list;

	AbstractListDemo() {

		list = new ArrayList();

	}

/*	public Object get(int i) {
		
		System.out.println(list.get(i));

		return null;

	}*/

	public int size() {

		System.out.println(list.size());

		return 0;

	}

	public boolean add(Object e)

	{

		list.add(e);

		System.out.println(list);

		return false;

	}

	public static void main(String... abc) {

		AbstractListDemo ald = new AbstractListDemo();

		System.out.println("Elements of List =");

		for (int i = 0; i <= 5; i++) {

			ald.add(i);

		}

		System.out.println("Size of list =");

		ald.size();

		System.out.println("Element at position 2");

		ald.get(2);
		
		

	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Object> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}