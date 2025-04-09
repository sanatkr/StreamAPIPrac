package com.prac.mapAndflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test2DArray {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[] {1,2,3};
		
		
		IntStream of = IntStream.of(arr1);
		
		Stream<int[]> stream3 = Arrays.stream(arr);
		
		IntStream flatMapToInt = stream3.flatMapToInt(x->Arrays.stream(x));
		
		int[] array4 = flatMapToInt.toArray();
		
		
		
		
		
		// First way
		
	
		
		
		
		
		
		
		
		
		
		Stream<int[]> stream = Arrays.stream(arr);
		
		IntStream stream2 = Arrays.stream(arr1);
		
		int[] array = Arrays.stream(arr)
				.flatMapToInt(list -> Arrays.stream(list))
				.toArray();
		
		
		Stream<IntStream> map = Arrays.stream(arr)
				.map(list -> Arrays.stream(list));
		
		
		Object[] array2 = Arrays.stream(arr)
		.map(list -> Arrays.stream(list))
		.toArray();
		
		
	
		
		System.out.println(Arrays.toString(array2));
		
		
		
		
		
		int[] array3 = Stream.of(arr)
			.flatMapToInt(row -> IntStream.of(row))
			.toArray();
		
		
		
				
		
	}

}
