package com.prac.empques;

public class Employee {
	
	Integer id;
	String gender;
	String department;
	Integer yearOfJoining;
	Double salary;
	Integer age ;
	
	
	
	public Employee(Integer id, String gender, String department, Integer yearOfJoining, Double salary, Integer age) {
		super();
		this.id = id;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", gender=" + gender + ", department=" + department + ", yearOfJoining="
				+ yearOfJoining + ", salary=" + salary + ", age=" + age + "]";
	}
	
	
	
	
	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Integer getYearOfJoining() {
		return yearOfJoining;
	}
	public void setYearOfJoining(Integer yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	

}
