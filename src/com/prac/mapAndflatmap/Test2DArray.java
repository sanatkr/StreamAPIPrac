package com.prac.mapAndflatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test2DArray {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10}};
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = new int[] {1,2,3};
		
		
		Stream<Integer> flatMap2 = Arrays.stream(arr)
			  .flatMap(e -> Arrays.stream(e).boxed());
		
		System.out.println("*********************************");

		
		int[] array6 = Arrays.stream(arr)
			  .flatMap(e-> Arrays.stream(e).boxed())
			  .mapToInt(e->e)
			  .toArray();
		
		System.out.println("*********************************");

		
		List<Integer> list = new ArrayList<>();
		
		for(int[] row : arr)
		{
			for(int elem : row)
			{
				list.add(elem);
			}
			
		}
		
		int[] array3 = list.stream()
			.mapToInt(e->e.intValue())
			.toArray();
		
		System.out.println("Flattened array (array3) is --> "+Arrays.toString(array3));

		
		System.out.println("*********************************");

		
		
		int[] array4 = Arrays.stream(arr)
			  .flatMapToInt(e->Arrays.stream(e))
			  .toArray();
		
		System.out.println("Flattened array is --> "+Arrays.toString(array4));

		System.out.println("*********************************");
		
		int[] array2 = Arrays.stream(arr)
		  .flatMapToInt(Arrays::stream)
		  .toArray();
		
		System.out.println("*********************************");

		
		Stream<int[]> stream3 = Arrays.stream(arr);
		
		Stream<IntStream> map2 = Arrays.stream(arr)
			  .map(e-> Arrays.stream(e));
		
		System.out.println("*********************************");

		Stream<Integer> flatMap = Arrays.stream(arr)
		  	  .map(e-> Arrays.stream(e))
		  	  .flatMap(e->e.boxed());
		
		System.out.println("*********************************");
		
		
		int[] array5 = Arrays.stream(arr)
	  	  	  				 .map(e-> Arrays.stream(e))
	  	  	  				 .flatMap(e->e.boxed())
	  	  	  				 .mapToInt(e->e)
	  	  	  				 .toArray();
			
		System.out.println("\nAnother way Flattened array is --> "+Arrays.toString(array5));
		
		System.out.println("*********************************");

		
		// Without using stream
		
		int[][] array = {{1,2,3},{4,5,6},{7,8,9},{10}};
		
		
		int totalELements = 0;
		
		for(int[] row : array)
		{
			totalELements += row.length;
		}
		
		int[] newArray = new int[totalELements];
		int index = 0;
		
		for(int[] row : array)
		{
			for(int element : row)
			{
				newArray[index++] = element;
			}
		}
		
		System.out .println("Without using stream conversion --> "+ Arrays.toString(newArray));
		
		
		
		
		
		
		
				
		
	}

}
