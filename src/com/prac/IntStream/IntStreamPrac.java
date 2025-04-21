package com.prac.IntStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStreamPrac {

	public static void main(String[] args) {
		
		Integer[] integerArray = new Integer[] {1,2,3,4,5,6,7,8,9,10};
		
		Stream<Integer> stream = Arrays.stream(integerArray);
		
		int sum = stream
					.mapToInt(value-> value.intValue())
					.sum();
		System.out.println(sum);
		
		
		int sum1 = Arrays.stream(integerArray)
						 .mapToInt(value-> value)
						 .sum();
		System.out.println(sum1);
		
		
		int sum2 = Arrays.stream(integerArray)
						 .mapToInt(Integer::intValue)
						 .sum();
		System.out.println(sum2);
		
		
		
		
		int[] intArray = new int[] {1,2,3,4,5};
		IntStream stream2 = Arrays.stream(intArray);
		
		List<Integer> collect = stream2.boxed().collect(Collectors.toList());
		System.out.println(collect);
		
		Stream<Integer> mapToObj = Arrays.stream(intArray).mapToObj(i -> Integer.valueOf(i));
		
		Stream<Integer> boxed2 = Arrays.stream(intArray).boxed();
		
		
		
		Stream<Integer> boxed = Arrays.stream(intArray)
				.boxed();
			  //.map(value->Integer.valueOf(value));
		
		
		Stream<Integer> map = Arrays.stream(intArray)
			   .boxed()
			   .map(value->value.hashCode());
		
		
			  

	}

}
