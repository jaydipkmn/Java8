package com.java8.LamdaExp;

import java.util.*;
import java.util.stream.Collectors;

public class MappingUsingLamda {

	public static void main(String[] args) {
		List <Person> persons =  new ArrayList<>();
		persons.add(new Person ("A","B",24));
		persons.add(new Person ("G","H",50));
		persons.add(new Person ("C","D",34));
		persons.add(new Person ("I","J",19));
		persons.add(new Person ("K","L",9));
		persons.add(new Person ("E","F",43));
		persons.add(new Person ("I","J",19));
		
		// print just age from above list
		
		for(Person p :  persons)
			System.out.print(p.getAge() + " ");
		//java 8 mapping
		System.out.println("\n using java8 map");
		persons.stream().map(x->x.getAge()).forEach(x->System.out.print(x +" "));

		System.out.println("\n using java8 mapToInt");
		persons.stream().mapToInt(x->x.getAge()).forEach(x->System.out.print(x +" "));
		
		//filtering mapping together 
		System.out.println("\n using java8 mapToInt and filetering ==> age >= 25");
		persons.stream().mapToInt(x->x.getAge()).filter(x->x>=25).forEach(x->System.out.print(x +" "));
		
		System.out.println("\n Sorting Persons based on Fname \n before");
		printPerson(persons);
		Collections.sort(persons);
		System.out.println( "\n after");
		printPerson(persons);
		
		System.out.println("\n Sorting Persons based on Age Using Age Comparator \n before");
        printPerson(persons);
        Collections.sort(persons,new AgeComparator<>());
        System.out.println( "\n after");
        printPerson(persons);
        
		//filtering mapping together 
		System.out.println("\n removing duplicates values using distinct \n before");
		printPerson(persons);
		persons = persons.stream().distinct().collect(Collectors.toList());
		System.out.println( "\n after");
		printPerson(persons);
		
	}

	private static void printPerson(List<Person> persons) {
		for(Person p :  persons)
			System.out.print(p.getfName() +" " + p.getlName() + " " + p.getAge() + " " );
	}

}
