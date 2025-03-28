package com.prac.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListTester {

	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("guava");
		fruits.add("pineapple");
		fruits.add("banana");
		
		System.out.println("Before sorting :- ");
		fruits.forEach(f->System.out.println("Fruit is --> "+f));
		
		
		System.out.println("1) Sorting using Comparator.naturalOrder()");
		
		List<String> sortedFruits = fruits.stream()
				.sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
		
		sortedFruits.forEach(f->System.out.println("Fruit is --> "+f));
		
		System.out.println("\n2) Sorting by passing lambda expression");
		
		List<String> sorted1 = fruits.stream()
				.sorted((f1,f2)->f1.compareTo(f2))
				.collect(Collectors.toList());
		
		sorted1.forEach(f->System.out.println("Fruit is --> "+f));
		
		
		System.out.println("\n3) Sorting by passing nothing");
		
		List<String> sorted2 = fruits.stream()
				.sorted()
				.collect(Collectors.toList());

		sorted2.forEach(f->System.out.println("Fruit is --> "+f));

		
		System.out.println("\n4) Sorting by passing Comparator defination (in descending order)");
		
		List<String> sorted3 = fruits.stream()
				.sorted(new Comparator<String>()
						{

							@Override
							public int compare(String o1, String o2) {
								
								return o2.compareTo(o1);
							}
					
						})
				.collect(Collectors.toList());
				

		sorted3.forEach(f->System.out.println("Fruit is --> "+f));

		
		

		
		
	}

}
