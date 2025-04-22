package com.prac.empques;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

//Integer id;
//String gender;
//String department;
//Integer yearOfJoining;
//Double salary;

public class TesterJavaTechies {

	public static List<Employee> getEmpList()
	{
		Employee emp1 = new Employee(1,"male","it",2011,800.0,26);
		Employee emp2 = new Employee(2,"female","cse",2012,1000.0,28);
		Employee emp3 = new Employee(3,"male","mech",2015,500.0,24);
		Employee emp4 = new Employee(4,"male","it",2017,900.0,29);
		Employee emp5 = new Employee(5,"female","cse",2019,700.0,22);
		Employee emp6 = new Employee(6,"male","mech",2014,300.0,30);
		Employee emp7 = new Employee(1,"female","cset",2020,400.0,27);
		Employee emp8 = new Employee(1,"female","mech",2025,1000.0,27);

		

		
		List<Employee> list = Arrays.asList(emp1,emp8,emp2,emp3,emp4,emp5,emp6,emp7);
		return list;
	}
	public static void main(String[] args) {
		
		List<Employee> empList = getEmpList();

		// Question1
		
		Map<String, Long> noOfMaleAndFemale = 
				empList.stream()
					   .collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
		
		System.out.println(noOfMaleAndFemale);
		
		noOfMaleAndFemale.entrySet()
						 .stream()
						 .forEach((entry)-> System.out.println("Key --> "+entry.getKey()+" Value is --> "+entry.getValue()));
		
		Map<Boolean, List<Employee>> collect = empList.stream()
				.collect(Collectors.partitioningBy((emp)->emp.getGender().equals("male")));
		
		collect.forEach((key,value)->
		{
			if(key)
			{
				System.out.println("Gender is --> male");
				List<Employee> maleList = collect.get(true);
				System.out.println(maleList);

			}
			else
			{
				System.out.println("_______________________________________");
				System.out.println("Gender is --> female");
				List<Employee> femaleList = collect.get(false);
				System.out.println(femaleList);
			}
		});
		
		
		// Question 2
		
		List<String> collect2 = empList.stream()
			   .map(emp -> emp.getDepartment())
			   .collect(Collectors.toList());
		
		List<String> collect3 = empList.stream()
				   .map(emp -> emp.getDepartment())
				   .distinct()
				   .collect(Collectors.toList());
		
		System.out.println("Without Distint --> " +collect2);
		System.out.println("With Distint --> " +collect3);
		
		
		System.out.println("Question 3 ---------------------------------");
		// Question 3
		
		Map<String, Double> collect4 = empList.stream()
			   .collect(Collectors.groupingBy(Employee::getGender,Collectors.averagingInt(Employee::getAge)));
		
		System.out.println(collect4);
		
		
		
		System.out.println("Question 4 ---------------------------------");
		// Question 4
		
		
		Optional<Employee> max = empList.stream()
			   .max(Comparator.comparingDouble(Employee::getSalary));
		
		
		
		Employee employee = empList.stream()
		   .max(Comparator.comparingDouble(Employee::getSalary))
		   .get();
		
		Optional<Employee> collect5 = empList.stream()
			   .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		
		Optional<Employee> collect6 = empList.stream()
				   .collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		
		
		Employee employee2 = empList.stream()
		   .max((o1,o2)-> {
			   double salary1 = o1.getSalary();
			   double salary2 = o2.getSalary();
			   
			   if(salary1<salary2)
			   {
				   return -1;
			   }
			   else if(salary1>salary2)
			   {
				   return 1;
			   }
			   else
			   {
				   return 0;
			   }
		   })
		   .get();
		
		
		System.out.println("Employee with max salary is --> "+max.get());
		System.out.println("Employee with max salary is --> "+collect5.get());
		System.out.println("Employee with max salary is --> "+collect6.get());


		
		
		System.out.println("Question 5 ---------------------------------");
		// Question 5
		
		empList.stream()
			   .filter(emp -> emp.getYearOfJoining()>2015)
			   .map(emp -> emp.getId())
			   .forEach(System.out::println);
		
		
		
		System.out.println("Question 6 ---------------------------------");
		// Question 6
		
		
		Map<String, Long> collect7 = empList.stream()
			   .collect(Collectors.groupingBy(emp -> emp.getDepartment(),Collectors.counting()));
		
		Set<Map.Entry<String, Long>> entrySet = collect7.entrySet();
		
		for(Map.Entry<String, Long> entry:entrySet)
		{
			System.out.println("Dept Name --> "+entry.getKey()+" count --> "+entry.getValue());
		}
		
		
		for(Map.Entry<String,Long> entry:collect7.entrySet())
		{
			System.out.println("Dept Name --> "+entry.getKey()+" count --> "+entry.getValue());

		}
		
		System.out.println("Question 7 ---------------------------------");
		// Question 7
		
		Map<String, Double> collect8 = empList.stream()
			   .collect(Collectors.groupingBy(emp -> emp.getDepartment(),Collectors.averagingDouble(emp -> emp.getSalary())));
		
		for(Map.Entry<String, Double> entry:collect8.entrySet())
		{
			System.out.println("Dept Name --> "+entry.getKey()+" average salary --> "+entry.getValue());
		}
		
		
		System.out.println("Question 8 ---------------------------------");
		// Question 8
		
		 Employee employee3 = empList.stream()
		 		.filter(emp -> emp.getGender()=="male" && emp.getDepartment() == "it")
		 		.min(Comparator.comparingInt(emp -> emp.getAge()))
		 		.get();
		 
		 System.out.println(employee3);
		 
		 
		 System.out.println("Question 9 ---------------------------------");
			// Question 9
		 
		 Employee employee4 = empList.stream()
		 		.sorted(Comparator.comparingInt(emp -> emp.getYearOfJoining()))
		 		.findFirst()
		 		.get();
		 System.out.println(employee4);
		 
		 
		 Employee employee5 = empList.stream()
		 		.min(Comparator.comparingInt(emp -> emp.getYearOfJoining()))
		 		.get();
		 
		 System.out.println(employee5);
		 
		 
		 
		 System.out.println("Question 10 ---------------------------------");
			// Question 10 (same move to next)
		 
		 
		 
		 
		 System.out.println("Question 11 ---------------------------------");
			// Question 11
		 
		 
		 
		 System.out.println("Question 12 ---------------------------------");
			// Question 12
		 
		 empList.stream()
		 		.collect(Collectors.groupingBy(emp -> emp.getDepartment()));
		 
		 
		 
		 
		 System.out.println("Question 12 ---------------------------------");
			// Question 12 (Find the nth Highest Salary)
		 
//		 empList.stream()
//		 		.forEach(emp -> System.out.println(emp.getSalary()));
		 
		 
		 Optional<Employee> first = empList.stream()
		 		.sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
		 		.skip(1)
		 		.findFirst();
		 
		 System.out.println("Employee with 2nd highest salary is --> "+first.get());
		 
		 
		 Optional<Employee> first2 = empList.stream()
		 		.sorted(Collections.reverseOrder(Comparator.comparingDouble(emp -> emp.getSalary())))
		 		.skip(1)
		 		.findFirst();
		 
		 System.out.println("Employee with 2nd highest salary is --> "+first2.get());
		 
		 
		 Optional<Employee> max2 = empList.stream()
		 		.max(Comparator.comparingDouble(emp -> emp.getSalary()));
		 
		 
//		 empList.stream()
//		 		.sorted(Comparator.comparingDouble(emp -> emp.getSalary()).reverse())
//		 		.skip(1)
//		 		.findFirst();
		 
		 
		 Map<Double, List<Double>> collect9 = empList.stream()
		 		.map(emp -> emp.getSalary())
		 		.collect(Collectors.groupingBy(Function.identity()));
		 
		 
		 
		 
		System.out.println(collect9);

		
		Map<Double, Set<Double>> collect10 = empList.stream()
 		.map(emp -> emp.getSalary())
 		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.toSet()));
		
//		LinkedHashMap<Double, Set<Double>> collect11 = empList.stream()
// 		.map(emp -> emp.getSalary())
// 		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.toSet()));
		
		System.out.println(collect10);
		
		
		Optional<Double> first3 = collect10.entrySet()
				 .stream()
				 .map(entry -> entry.getKey())
				 .sorted(Comparator.reverseOrder())
				 .skip(1)
				 .findFirst();
		
		System.out.println(first3);
		
		Optional<Double> first4 = empList.stream()
				.map(emp -> emp.getSalary())
				.sorted(Comparator.reverseOrder())
				.skip(1)
				.findFirst();
		
		System.out.println(first4);

		Optional<Double> first5 = empList.stream()
		.map(emp -> emp.getSalary())
		.distinct()
		.sorted(Comparator.reverseOrder())
		.skip(1)
		.findFirst();

		System.out.println(first5);
		
		
		
		Map<Double, List<Employee>> mapWithSalaryAsKey = empList.stream()
			   .collect(Collectors.groupingBy(Employee::getSalary,LinkedHashMap::new, Collectors.toList()));
		
		System.out.println("Map created is --> "+mapWithSalaryAsKey);
		
		
		Optional<Entry<Double, List<Employee>>> first6 = mapWithSalaryAsKey.entrySet()
						  .stream()
						  .sorted(Map.Entry.<Double,List<Employee>>comparingByKey().reversed())
						  .findFirst();
		
		Entry<Double, List<Employee>> entry = mapWithSalaryAsKey.entrySet()
		  .stream()
		  .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
		  .skip(1)
		  .findFirst()
		  .get();
		
		System.out.println(entry);
		
		
//		Entry<Double, List<Employee>> entry2 = mapWithSalaryAsKey.entrySet()
//		  .stream()
//		  .min(Map.Entry.comparingByKey())
//		  .get();
//		
//		System.out.println(entry2);

		
		


		 
		 
		 

		 
		 

		
		
		
	}

}
