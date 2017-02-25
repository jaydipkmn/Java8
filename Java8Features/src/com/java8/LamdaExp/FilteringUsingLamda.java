package com.java8.LamdaExp;
import java.util.*;
import java.util.stream.Collectors;

public class FilteringUsingLamda {

	public static void main(String[] args) {
		List <Integer > numbers =  new ArrayList<>();
		for(int i=1;i<=100;i++)
			numbers.add(i);
		List <Integer> filteredList =  new ArrayList<>();
		
		// before java 8
		for(Integer i : numbers)
		{
			if(i%2==0)
				filteredList.add(i);
		}
		System.out.println(filteredList);
		
		//here comes java 8
		List <Integer> filteredList2 = numbers.stream().filter(x-> x%2==0).collect(Collectors.toList());
		System.out.println(filteredList2);
	}

}
