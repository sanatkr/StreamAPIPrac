package com.prac.sorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeHashMapTester {

	public static void main(String[] args) {
		
		Map<Employee,Integer> empMap = new HashMap<>();
		
		empMap.put(new Employee(1,"sanat",5000), 100);
		empMap.put(new Employee(4,"rajiv",10000), 300);
		empMap.put(new Employee(2,"shishir",4000), 700);
		empMap.put(new Employee(7,"shashi",8000), 200);
		empMap.put(new Employee(5,"sumit",2000), 400);
		empMap.put(new Employee(3,"aman",9000), 500);
		
		// Sorting based on roll number of the employee
		
		empMap.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId)))
				.forEach((entry)->System.out.println(entry.getKey()+" , "+entry.getValue()));
		
		//sortedMap1.forEach((e,v)->System.out.println(e+" , "+v));
		
		//.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		System.out.println("2 **********************************************");
		empMap.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId)))
		.forEachOrdered((entry)->System.out.println(entry.getKey()+" , "+entry.getValue()));
		
		
		System.out.println("3 **********************************************");
		
		Map<Employee, Integer> sortedMap1 = empMap.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId)))
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		
		sortedMap1.forEach((e,v)->System.out.println(e+" , "+v));
		
		
		System.out.println("4 **********************************************");
		LinkedHashMap<Employee, Integer> sortedMap2 = 
		empMap.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getId)))
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(old,neww)->old,LinkedHashMap::new));
		
		sortedMap2.forEach((e,v)->System.out.println(e+" , "+v));
		
		
		
		
		System.out.println("Comparing By value  **********************************************");
		LinkedHashMap<Employee, Integer> sortedMap3 = 
		empMap.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(old,neww)->old,LinkedHashMap::new));
		
		sortedMap3.forEach((e,v)->System.out.println(e+" , "+v));

		
		
		System.out.println("Comparing By value  2 **********************************************");
		 
		empMap.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.forEach((entry)->System.out.println(entry.getKey()+" , "+entry.getValue()));
		
		
		
		System.out.println("Comparing By value  3 **********************************************");
		 
		Map<Employee, Integer> sorted4 = empMap.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));
		
		sorted4.forEach((e,v)->System.out.println(e+" , "+v));
		
		
		
		System.out.println("Comparing By Key Based on Name of the Employee in Asc Order **********************************************");
		empMap.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName)))
		.forEachOrdered((entry)->System.out.println(entry.getKey()+" , "+entry.getValue()));
		
		
		
		System.out.println("Comparing By Key Based on Name of the Employee in Desc Order **********************************************");
		empMap.entrySet()
		.stream()
		.sorted(Map.Entry.<Employee,Integer>comparingByKey(Comparator.comparing(Employee::getName)).reversed())
		.forEachOrdered((entry)->System.out.println(entry.getKey()+" , "+entry.getValue()));
		
		
		System.out.println("Comparing By Key Based on Name of the Employee in Asc Order **********************************************");
		empMap.entrySet()
		.stream()
		.sorted(Map.Entry.<Employee,Integer>comparingByKey(Comparator.comparing(Employee::getName)))
		.forEachOrdered((entry)->System.out.println(entry.getKey()+" , "+entry.getValue()));
		
		
		

	}

}
