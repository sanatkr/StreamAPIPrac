package com.prac.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmpTester {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(1,"sanat",5000));
		empList.add(new Employee(2,"aman",2000));
		empList.add(new Employee(3,"shishir",1000));
		empList.add(new Employee(4,"rajiv",4000));
		
		
		//Before Sorting
		empList.forEach(e->System.out.println(e));
		
		//After Sorting
		
		System.out.println("After Sorting based on Salary --> ");
		empList.stream()
				.sorted(Comparator.comparingInt(Employee::getSalary))
				.forEach(e->System.out.println(e));
		
		System.out.println("After Sorting based on Name --> ");
		empList.stream()
				.sorted(Comparator.comparing(Employee::getName))
				.forEach(e->System.out.println(e));
		
		
		System.out.println("After Sorting based on Name Using Comparator Interface--> ");
		empList.stream()
				.sorted(new Comparator<Employee>()
						{
							@Override
							public int compare(Employee o1, Employee o2) {
								// TODO Auto-generated method stub
								return o1.getName().compareTo(o2.getName());
							}
					
						})
				.forEach(e->System.out.println(e));
		
		
		System.out.println("After Sorting based on Salary by passing lambda expression--> ");
		empList.stream()
				.sorted((o1,o2) -> o1.getSalary()-o2.getSalary())
				.forEach(e->System.out.println(e));
		
		
		System.out.println("After Sorting based on Salary by using Comparator.comparing() method --> ");
		empList.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.forEach(System.out::println);
		
		
	}

}
