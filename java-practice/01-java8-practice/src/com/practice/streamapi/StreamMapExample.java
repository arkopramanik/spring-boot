package com.practice.streamapi;

import java.util.Arrays;
import java.util.stream.Stream;

class Employee {
	String empName;
	int age;
	double salary;

	public Employee(String empName, int age, double salary) {
		super();
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}

}

public class StreamMapExample {
	public static void main(String[] args) {
		Stream.of("Arko", "Diksha").map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));
		Stream.of("Arko", "Diksha").mapToInt(name -> name.length()).forEach(n -> System.out.println(n));
		Stream.of("Arko", "Diksha").filter(name -> name.startsWith("A")).map(name -> name.length())
				.forEach(n -> System.out.println(n));

		Arrays.asList(new Employee("Arko", 33, 60800.00), new Employee("Diksha", 30, 30000.00)).stream()
				.filter(emp -> emp.salary >= 50000.00).map(emp -> emp.empName + " " + emp.age)
				.forEach(emp -> System.out.println(emp));

	}

}
