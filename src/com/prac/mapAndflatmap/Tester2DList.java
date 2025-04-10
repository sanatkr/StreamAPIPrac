package com.prac.mapAndflatmap;

import java.util.Arrays;
import java.util.Collection;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tester2DList {

	public static void main(String[] args) {

		
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);

		// Creating List<List<Integer>>
		List<List<Integer>> list = Arrays.asList(list1,list2);
		
		System.out.println("2D List --> "+list);
		
		System.out.println("***********************************************************");
		
		List<Integer> collect2 = list.stream()
			.flatMap(e->e.stream())
			.collect(Collectors.toList());
		
		System.out.println("1D List --> "+collect2);
		
		System.out.println("***********************************************************");
		
		list.stream()
		    .flatMap(Collection::stream)
		    .collect(Collectors.toList());
		
		
		
		System.out.println("***********************************************************");
		
		
		
		IntStream flatMapToInt = list.stream()
			.flatMapToInt(e -> e.stream().mapToInt(Integer::intValue));
		
		System.out.println("***********************************************************");

		
		int[] array11 = list.stream()
		.flatMapToInt(e -> e.stream().mapToInt(Integer::intValue))
		.toArray();
		
		System.out.println("***********************************************************");

		
		
		List<Integer> collect3 = list.stream()
		.flatMapToInt(e -> e.stream().mapToInt(Integer::intValue))
		.boxed()
		.collect(Collectors.toList());
		
		System.out.println("***********************************************************");

		
		
		
		Integer[] array10 = list.stream()
		.flatMapToInt(e -> e.stream().mapToInt(Integer::intValue))
		.boxed()
		.toArray(Integer[]::new);
		
		System.out.println("***********************************************************");


		Stream<List<Integer>> stream4 = list.stream();
		
		Stream<List<Integer>> map = list.stream()	
			.map(ele -> ele);
		
		
		// map() example
		List<List<Integer>> mappedItems = list.stream()	
											  .map(ele -> ele)
											  .collect(Collectors.toList());
		
		System.out.println(mappedItems);
		
		
		
		System.out.println("***********************************************************");
		
		
		// flatMap() example
		List<Integer> flatMappedItems = list.stream()
											.flatMap(ele->ele.stream())
											.collect(Collectors.toList());
		
		System.out.println(flatMappedItems); 
		
		
		Stream<Integer> flatMap = list.stream()
				                      .flatMap(ele->ele.stream());
		
		System.out.println("***********************************************************");
		
		// flatMap() example
		List<Integer> mappedItems1 = list.stream()	
										 .map(ele -> ele.stream())
										 .flatMap(Function.identity())
										 .collect(Collectors.toList());
		
		System.out.println(mappedItems1);
		
		System.out.println("***********************************************************");
		
		
		// Creating IntStream from List<Integer>
		
		Stream<Integer> stream = list1.stream();
		
		IntStream mapToInt = stream
							      .mapToInt(elem -> elem.intValue());
		
		mapToInt.forEach(System.out::println);
		
		
		System.out.println("***********************************************************");
		
		
		// Creating int[] array from List<Integer>
		int[] array = list1.stream()
				 			.mapToInt(elem -> elem.intValue())
				 			.toArray();
		
		System.out.println(Arrays.toString(array));
		
		List<Integer> collect = list1.stream()
			 .collect(Collectors.toList());
		
		Integer[] array8 = list1.stream()
			 .toArray(Integer[]::new);
		
		System.out.println("***********************************************************");

		
		// Operating with int[] array
		int[] arr = {30,10,50,20};
		
		IntStream intStream1 = Arrays.stream(arr);
		
		Stream<int[]> of = Stream.of(arr);
		int sum = intStream1.sum();
		
		System.out.println("Sum is --> "+sum);
		
		IntSummaryStatistics summaryStatistics = Arrays.stream(arr).summaryStatistics();
		
		IntStream intStream2 = IntStream.of(arr);
		
		IntStream.of(arr)
				 .filter(e->e>10)
				 .boxed()
				 .collect(Collectors.toList())
				 .forEach(System.out::println);
		
		System.out.println("***********************************************************");

		
		System.out.println("\nSorting the Array :- ");
		IntStream.of(arr)
				 .sorted()
				 .boxed()
				 .collect(Collectors.toList());
				 //.forEach(System.out::println);
		
		
		System.out.println("***********************************************************");

		
		int[] array2 = IntStream.of(arr)
		 		 .sorted()
		 		 .toArray();
		
		System.out.println("\nSorted the array --> "+Arrays.toString(array2));
		
		
		System.out.println("***********************************************************");
		
		
		int[] array3 = IntStream.of(arr)
				 .sorted()
				 .toArray();
		
		Arrays.stream(array3)
			  .forEach(System.out::println);
		
		
		System.out.println("***********************************************************");

		
		List<Integer> sortedList = IntStream.of(arr)
				 .sorted()
				 .boxed()
				 .collect(Collectors.toList());
		
		sortedList.forEach(System.out::println);
		
		
		System.out.println("***********************************************************");
		
				  
		
		Stream<Integer> boxed = Arrays.stream(arr)
								.boxed();
		
		System.out.println("***********************************************************");
		
		
		Integer[] array6 = IntStream.of(arr)
		         .sorted()
		         .boxed()
		         .toArray(Integer[]::new);

		System.out.println("***********************************************************");

		
		// Operating with Integer[] array
		Integer[] arr1 = {20,40,60};
		
		Stream<Integer> stream2 = Arrays.stream(arr1);
		
		Stream<Integer> stream3 = Stream.of(arr1);
							
		
		IntStream mapToInt2 = stream2.mapToInt(e->e.intValue());
		
		
		int[] array4 = Arrays.stream(arr1)
							 .mapToInt(e->e.intValue())
							 .toArray();
		
		Integer[] array5 = Arrays.stream(arr1)
								 .mapToInt(e->e.intValue())
								 .boxed()
								 .toArray(Integer[]::new);
		
		System.out.println("Integer array --> "+Arrays.toString(array5));
		
		System.out.println("Integer array --> "+Arrays.toString(array4));
		
		
		
		Integer[] array7 = Arrays.stream(arr1)
		 	  .toArray(Integer[]::new);
		
		
		Object[] array9 = Arrays.stream(arr1)
	 	  .toArray();
			
		

		
		
			
		
		
		
		
	}

}
