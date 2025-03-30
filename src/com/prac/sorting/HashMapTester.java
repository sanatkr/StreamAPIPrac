package com.prac.sorting;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapTester {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1,"sanat",5000));
		empList.add(new Employee(7,"aman",2000));
		empList.add(new Employee(2,"shishir",1000));
		empList.add(new Employee(3,"rajiv",4000));
		
		Map<Integer,String> empMap = empList.stream()
											.collect(Collectors.toMap(Employee::getId, Employee::getName));
		
		System.out.println(empMap);
		
		Map<Integer,String> sortedMap = new LinkedHashMap<>();
		empMap.entrySet()
				.stream()	
				.sorted(Map.Entry.comparingByValue())
				.forEachOrdered(e->sortedMap.put(e.getKey(),e.getValue()));
		
		System.out.println("Sorted map --> "+sortedMap);
		
		

	}

}
