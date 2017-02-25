package com.java8.LamdaExp;

import java.util.*;

public class MappingUsingLamda {

	public static void main(String[] args) {
		List <Person> persons =  new ArrayList<>();
		persons.add(new Person ("A","B",24));
		persons.add(new Person ("C","D",34));
		persons.add(new Person ("E","F",43));
		persons.add(new Person ("G","H",50));
		persons.add(new Person ("I","J",19));
		persons.add(new Person ("K","L",9));
		
		// print just age from above list
		
		for(Person p :  persons)
			System.out.print(p.getAge() + " ");
		//java 8 mapping
		System.out.println("\n using java8 map");
		persons.stream().map(x->x.getAge()).forEach(x->System.out.print(x +" "));

		System.out.println("\n using java8 mapToInt");
		persons.stream().mapToInt(x->x.getAge()).forEach(x->System.out.print(x +" "));
		
		
	}

}
