package com.java8.LamdaExp;

import java.util.ArrayList;
import java.util.List;

public class ReductionUsingLamda {

	public static void main(String[] args) {
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("A", "B", 24));
		persons.add(new Person("C", "D", 34));
		persons.add(new Person("E", "F", 43));
		persons.add(new Person("G", "H", 50));
		persons.add(new Person("I", "J", 19));
		persons.add(new Person("I", "J", 19));
		persons.add(new Person("K", "L", 9));
		int totalAge = 0;
		for (Person p : persons)
			totalAge += p.getAge();
		System.out.println("Old ways : " + totalAge);

		int totalAge2 = persons.stream()
				.map(x -> x.getAge())
				.reduce(0, (a, b) -> a + b);
		System.out.println("java8 ways : " + totalAge2);

		int totalAge3 = persons.stream()
				.map(x -> x.getAge())
				.filter(x -> x <= 25)
				.reduce(0, (a, b) -> a + b);
		System.out.println("java8 ways sum of ages less than 25: " + totalAge3);
	}

}
