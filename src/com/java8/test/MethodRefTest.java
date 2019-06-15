package com.java8.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@FunctionalInterface
interface Sayable {
	void say();

}

public class MethodRefTest {

	public static void main(String[] args) {

		Sayable s = () -> System.out.println("Saying it the static way");

		s.say();

		s = MethodRefTest::sayStatic;

		s.say();

		SayUtil mrt = new SayUtil();

		Sayable s1 = () -> mrt.sayInstMRef();
		s1.say();

		s1 = mrt::sayInstMRef;

		s1.say();
		
		/*String[] stringArray = { "Barbara", "James", "Mary", "John",
				"Patricia", "Robert", "Michael", "Linda" };
		Arrays.sort(stringArray, String::compareToIgnoreCase);*/
		MethodRefTest m = new MethodRefTest();
		//m.displayStatic(SayUtil::sayInstMRef);
		//Consumer<T> c = SayUtil::sayInstMRef;
		List<Jedi> jedis = new ArrayList<Jedi>();
		jedis.add(new Jedi("Obi-wan", 80));
		jedis.add(new Jedi("Anakin", 25));
		jedis.add(new Jedi("Yoda", 500));
		//List<String> names = map(jedi -> jedi.getName(), jedis);
		
		List<String> names1 = map(Jedi::getName, jedis);
		
		//List<String> names2 = map(SayUtil::sayString, jedis);
		
		//System.out.println(names2.toString());
		}

	void displayStatic(Sayable s) {
		s.say();
	}

	public static void sayStatic() {
		System.out.println("Saying it the static way");
	}

	static <T, R> List<R> map(Function<T, R> function, List<T> source) {
		List<R> destiny = new ArrayList<>();
		for (T item : source) {
			R value = function.apply(item);
			destiny.add(value);
		}
		return destiny;
	}

}
