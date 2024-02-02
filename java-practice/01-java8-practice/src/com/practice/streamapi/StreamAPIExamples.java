package com.practice.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Users {
	String name;
	int age;

	public Users(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}

class Employees {
	String empName;
	int age;
	double salary;

	public Employees(String empName, int age, double salary) {
		super();
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}

}

class EmployeeCountry {
	String empNo;
	String empName;
	double salary;
	String country;

	public EmployeeCountry(String empNo, String empName, double salary, String country) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
		this.country = country;
	}

	@Override
	public String toString() {
		return "EmployeeCountry [empNo=" + empNo + ", empName=" + empName + ", salary=" + salary + ", country="
				+ country + "]";
	}

}

class Persons {
	String name;
	String country;

	public Persons(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}

}

public class StreamAPIExamples {
	public static void main(String[] args) {
		// filter Method
		List<Integer> intList = Arrays.asList(12, 2, 23, 24, 45);
		intList.stream().filter(i -> i > 20).forEach(i -> System.out.println(i));

		Stream.of(12, 2, 23, 24, 45).filter(i -> i > 20).forEach(i -> System.out.println(i));

		Arrays.asList("Arko", "Hridaan", "Hiren", "Diksha").stream().filter(i -> i.startsWith("H"))
				.forEach(i -> System.out.println(i));

		System.out.println("***************************************");

		Users user1 = new Users("Arko", 33);
		Users user2 = new Users("Diksha", 30);
		Users user3 = new Users("Hridaan", 1);

		Stream.of(user1, user2, user3).filter(i -> i.age >= 18 && i.name.startsWith("A"))
				.forEach(i -> System.out.println(i));

		System.out.println("***************************************");

		// Map Example

		Stream.of("Arko", "Diksha").map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));
		Stream.of("Arko", "Diksha").mapToInt(name -> name.length()).forEach(n -> System.out.println(n));
		Stream.of("Arko", "Diksha").filter(name -> name.startsWith("A")).map(name -> name.length())
				.forEach(n -> System.out.println(n));

		Arrays.asList(new Employees("Arko", 33, 60800.00), new Employees("Diksha", 30, 30000.00)).stream()
				.filter(emp -> emp.salary >= 50000.00).map(emp -> emp.empName + " " + emp.age)
				.forEach(emp -> System.out.println(emp));

		System.out.println("***************************************");

		List<String> backend = Arrays.asList("Java", "Spring Boot");
		List<String> ui = Arrays.asList("Angular", "React");
		List<List<String>> course = Arrays.asList(backend, ui);

		course.stream().forEach(i -> System.out.println(i));

		course.stream().flatMap(c -> c.stream()).forEach(c -> System.out.println(c));

		System.out.println("***************************************");

		List<Persons> persons = Arrays.asList(new Persons("Arko", "India"), new Persons("Diksha", "China"),
				new Persons("Abhishekh", "India"));

		boolean match = persons.stream().anyMatch(p -> p.country.equals("India"));
		System.out.println(match);

		Optional<Persons> findFirst = persons.stream().filter(p -> p.country.equals("India")).findFirst();

		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}

		Optional<Persons> personAny = persons.stream().filter(p -> p.country.equals("India")).findAny();
		if (personAny.isPresent()) {
			System.out.println(personAny.get());
		}

		List<Persons> collect = persons.stream().filter(p -> p.country.equals("India")).collect(Collectors.toList());
		collect.forEach(System.out::println);

		List<String> name = persons.stream().filter(p -> p.country.equals("India")).map(p -> p.name)
				.collect(Collectors.toList());
		name.forEach(System.out::println);

		System.out.println("***************************************");

		// min , max and avg sal of an employees data
		List<Employees> empList = Arrays.asList(new Employees("Arko", 33, 60800.00),
				new Employees("Diksha", 30, 30000.00), new Employees("Abhishekh", 31, 80000.00));

		Optional<Employees> maxEmp = empList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(emp -> emp.salary)));
		if (maxEmp.isPresent()) {
			System.out.println("Max Salary: " + maxEmp.get().salary);
		}

		Optional<Employees> empMin = empList.stream()
				.collect(Collectors.minBy(Comparator.comparing(emp -> emp.salary)));

		if (empMin.isPresent()) {
			System.out.println("Minimum Salary " + empMin.get().salary);
		}

		Double averageSal = empList.stream().collect(Collectors.averagingDouble(emp -> emp.salary));
		System.out.println("Avg Salary " + averageSal);

		System.out.println("***************************************");
		//grouping 
		EmployeeCountry emp1 = new EmployeeCountry("1", "Arko", 60800.00, "INDIA");
		EmployeeCountry emp2 = new EmployeeCountry("2", "Diksha", 30000.00, "USA");
		EmployeeCountry emp3 = new EmployeeCountry("3", "Abhishekh", 80000.00, "INDIA");
		Map<String, List<EmployeeCountry>> mapEmp = Stream.of(emp1, emp2, emp3)
				.collect(Collectors.groupingBy(e -> e.country));
		System.out.println(mapEmp);
		
		//slicing operation
		System.out.println("***************************************");
		List<String> family = Arrays.asList("Arko", "Diksha", "Hridaan", "Rekha", "Hiren","Arko");
		family.stream().limit(3).forEach(System.out::println);
		System.out.println("--------------");
		family.stream().skip(3).forEach(System.out::println);
		System.out.println("---------------");
		family.stream().distinct().forEach(System.out::println);

	}

}
