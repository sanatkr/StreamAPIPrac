package com.prac;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiPrac1 {
	
	public static void main(String args[])
	{
		List<Integer> list = Arrays.asList(2,7,34,23,19,75,56);
		
		List<Integer> filteredResult = list.stream()
			.filter(val->val%2==0)
			.collect(Collectors.toList());
		
		System.out.println("Filter result -->");
		filteredResult.forEach(v->System.out.println(v));
		
		List<Integer> mappedResult = list.stream()
			.map(val->val*2)
			.collect(Collectors.toList());
		
		System.out.println("\nMap result -->");
		mappedResult.forEach(v->System.out.println(v));
		
		
		
	}

}
