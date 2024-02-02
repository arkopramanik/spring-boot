package com.practice.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
	String empName;
	String location;
	String expertize;

	public Employee(String empName, String location, String expertize) {
		super();
		this.empName = empName;
		this.location = location;
		this.expertize = expertize;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", location=" + location + ", expertize=" + expertize + "]";
	}

}

public class PredicateDemo3 {
	

	public static void main(String[] args) {
		Employee emp1 = new Employee("Arko", "Hyd", "Java");
		Employee emp2 = new Employee("Abhishekh", "Hyd", "SAP");
		Employee emp3 = new Employee("Diksha", "Hyd", "Salesforce");
		List<Employee> empLIst = Arrays.asList(emp1,emp2,emp3);
		
		Predicate<Employee> p1 = emp -> emp.empName.startsWith("A");
		Predicate<Employee> p2 = emp -> emp.location.equals("Hyd");
		Predicate<Employee> p3 = emp -> emp.expertize.equals("Java");
		
		//Predicate Joining
		Predicate<Employee> predicateAnd = p1.and(p2).and(p3);
		Predicate<Employee> predicateOr = p1.and(p2).or(p3);
		
		for (Employee employee : empLIst) {
			if (predicateAnd.test(employee)) {
				System.out.println(employee.empName);
			}
			
		}
		System.out.println("-----------------------------------------");
		
		for (Employee employee : empLIst) {
			if (predicateOr.test(employee)) {
				System.out.println(employee.empName);
			}
			
		}
		
		

	}

}
