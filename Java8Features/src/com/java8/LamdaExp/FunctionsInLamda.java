package com.java8.LamdaExp;
import java.util.*;
import java.util.function.*;

public class FunctionsInLamda {

	public static void main(String[] args) {
		List <Person> persons =  new ArrayList<>();
		persons.add(new Person ("A","B",24));
		persons.add(new Person ("C","D",34));
		persons.add(new Person ("E","F",43));
		persons.add(new Person ("G","H",50));
		persons.add(new Person ("I","J",19));
		persons.add(new Person ("I","J",19));
		persons.add(new Person ("K","L",9));
		
		
		Function<Integer , Predicate<Person>> ageGreaterThanOrEqual = age -> (person -> person.getAge()>=age);
		persons.stream().filter(ageGreaterThanOrEqual.apply(25)).forEach(person->System.out.println(person));
	}

}
