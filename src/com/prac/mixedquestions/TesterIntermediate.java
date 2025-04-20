package com.prac.mixedquestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesterIntermediate {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("apple","banana","cherry","apple","banana","date","watermelon");
		
		Stream<List<String>> of = Stream.of(list);
		
		
		
		Stream<String> stream = list.stream();
		
		Stream<String> filter = list.stream()
								    .filter(s -> s.length()>5);
		
		//filter.forEach(System.out::println);
		
		List<String> collect = list.stream()
								   .filter(s -> s.length() > 5)
								   .peek(System.out::println)
								   .collect(Collectors.toList());
		//System.out.println(collect);
		
		
		List<String> collect2 = list.stream()	
			.filter(e -> e.length()>5)
			.map(e -> e.toUpperCase())
			.collect(Collectors.toList());
		
		System.out.println(collect2);
		
		
		Stream<String> flatMap = list.stream()	
		.filter(e -> e.length()>5)
		.map(e -> e.toUpperCase())
		.flatMap(e -> Stream.of(e.split("")));
		
		List<String> collect3 = list.stream()	
		.filter(e -> e.length()>5)
		.map(e -> e.toUpperCase())
		.flatMap(e -> Stream.of(e.split("")))
		.collect(Collectors.toList());
		
		System.out.println("Collect3 --> " +collect3);
		
		
		
		
		
		List<String> collect4 = list.stream()	
		.filter(e -> e.length()>5)
		.map(e -> e.toUpperCase())
		.flatMap(e -> Stream.of(e.split("")))
		.distinct()
		.sorted(Comparator.reverseOrder())
		.skip(2)
		.limit(10)
		//.peek(System.out::println)
		.collect(Collectors.toList());
		
		System.out.println("Collect3 --> " +collect4);

		
		
		

		
		
		
			
		
		
		
		
	}

}
