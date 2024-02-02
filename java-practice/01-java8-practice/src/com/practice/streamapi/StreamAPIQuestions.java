package com.practice.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class EmployeeDetails {
	int id;
	String name;
	int age;
	String gender;
	String department;
	int yearOfJoining;
	double salary;

	public EmployeeDetails(int id, String name, int age, String gender, String department, int yearOfJoining,
			double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
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

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}

}

public class StreamAPIQuestions {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<EmployeeDetails> employeeList = new ArrayList<>();
		employeeList.add(new EmployeeDetails(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new EmployeeDetails(2, "Smith", 25, "Male", "Sales", 2015, 13500.0));
		employeeList.add(new EmployeeDetails(3, "David", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new EmployeeDetails(4, "Orlen", 28, "Male", "Development", 2014, 32500.0));
		employeeList.add(new EmployeeDetails(5, "Charles", 27, "Male", "HR", 2013, 22700.0));
		employeeList.add(new EmployeeDetails(6, "Cathy", 43, "Male", "Security", 2016, 10500.0));
		employeeList.add(new EmployeeDetails(7, "Ramesh", 35, "Male", "Finance", 2010, 27000.0));
		employeeList.add(new EmployeeDetails(8, "Suresh", 31, "Male", "Development", 2015, 34500.0));
		employeeList.add(new EmployeeDetails(9, "Gita", 24, "Female", "Sales", 2016, 11500.0));
		employeeList.add(new EmployeeDetails(10, "Mahesh", 38, "Male", "Security", 2015, 11000.5));
		employeeList.add(new EmployeeDetails(11, "Gouri", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new EmployeeDetails(12, "Nithin", 25, "Male", "Development", 2016, 28200.0));
		employeeList.add(new EmployeeDetails(13, "Swathi", 27, "Female", "Finance", 2013, 21300.0));
		employeeList.add(new EmployeeDetails(14, "Buttler", 24, "Male", "Sales", 2017, 10700.5));
		employeeList.add(new EmployeeDetails(15, "Ashok", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new EmployeeDetails(16, "Sanvi", 26, "Female", "Development", 2015, 28900.0));

		// 1. How many male and female employees are there in the organization ?

		long maleCount = employeeList.stream().filter(emp -> emp.gender.equals("Male")).count();
		System.out.println("No of Male Employee: " + maleCount);

		long femaleCount = employeeList.stream().filter(emp -> emp.gender.equals("Female")).count();
		System.out.println("No of Female Employee: " + femaleCount);

		Map<String, Long> mapCount = employeeList.stream()
				.collect(Collectors.groupingBy(EmployeeDetails::getGender, Collectors.counting()));

		System.out.println(mapCount);

		System.out.println("******************************************************");

		// 2. Print the name of all departments in the organization ?

		employeeList.stream().map(EmployeeDetails::getDepartment).distinct().forEach(System.out::println);

		System.out.println("******************************************************");

		// 3. What is the average age of male and female employees ?

		Map<String, Double> avgAgeofEmp = employeeList.stream().collect(
				Collectors.groupingBy(EmployeeDetails::getGender, Collectors.averagingInt(EmployeeDetails::getAge)));
		System.out.println(avgAgeofEmp);

		System.out.println("******************************************************");

		// 4. Get the details of highest paid employee in the organization ?

		Optional<EmployeeDetails> highestPaidEmp = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(EmployeeDetails::getSalary)));

		if (highestPaidEmp.isPresent()) {
			System.out.println(highestPaidEmp.get());
		}
		System.out.println("******************************************************");
		// 5. Get the names of all employees who have joined after 2015 ?

		employeeList.stream().filter(e -> e.yearOfJoining > 2015).map(EmployeeDetails::getName)
				.forEach(System.out::println);

		System.out.println("******************************************************");

		// 6. Count the number of employees in each department ?

		Map<String, Long> empDept = employeeList.stream()
				.collect(Collectors.groupingBy(EmployeeDetails::getDepartment, Collectors.counting()));
		System.out.println(empDept);

		System.out.println("******************************************************");

		// 7. What is the average salary of each department ?

		Map<String, Double> avgSal = employeeList.stream().collect(Collectors.groupingBy(EmployeeDetails::getDepartment,
				Collectors.averagingDouble(EmployeeDetails::getSalary)));

		System.out.println(avgSal);

		System.out.println("******************************************************");

		// 8. Get the details of youngest male employee in the Development department ?

		Optional<EmployeeDetails> youngestEmpOptional = employeeList.stream()
				.filter(e -> e.getDepartment().equalsIgnoreCase("Development") && e.getGender().equals("Male"))
				.collect(Collectors.minBy(Comparator.comparingInt(EmployeeDetails::getAge)));

		Optional<EmployeeDetails> youngestEmpOptional2 = employeeList.stream()
				.filter(e -> e.getDepartment().equalsIgnoreCase("Development") && e.getGender().equals("Male"))
				.min(Comparator.comparing(EmployeeDetails::getAge));

		if (youngestEmpOptional2.isPresent()) {
			System.out.println(youngestEmpOptional2.get());
		}

		System.out.println("******************************************************");
		// 9. Who has the most working experience in the organization ?

		Optional<EmployeeDetails> mostWorkExp = employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(EmployeeDetails::getYearOfJoining)));

		if (mostWorkExp.isPresent()) {
			System.out.println(mostWorkExp.get());
		}

		System.out.println("******************************************************");

		// 10. How many male and female employees are there in the Sales team ?

		Map<String, Long> salesMaleFemale = employeeList.stream()
				.filter(e -> e.getDepartment().equalsIgnoreCase("sales"))
				.collect(Collectors.groupingBy(EmployeeDetails::getGender, Collectors.counting()));
		System.out.println(salesMaleFemale);

		System.out.println("******************************************************");
		// 11. What is the average salary of male and female employees ?
		Map<String, Double> avgSalMaleFemale = employeeList.stream().collect(Collectors
				.groupingBy(EmployeeDetails::getGender, Collectors.averagingDouble(EmployeeDetails::getSalary)));
		System.out.println(avgSalMaleFemale);

		System.out.println("******************************************************");
		// 12. Second HIghest salary of the employee

		Optional<EmployeeDetails> secondHighestSal = employeeList.stream()
				.sorted(Comparator.comparing(EmployeeDetails::getSalary).reversed()).skip(1).findFirst();
		System.out.println(secondHighestSal.get());

		EmployeeDetails secondHighestSalaryemployeeDetails = employeeList.stream()
				.sorted(Comparator.comparing(EmployeeDetails::getSalary).reversed()).collect(Collectors.toList())
				.get(1);

		System.out.println(secondHighestSalaryemployeeDetails);

		System.out.println("******************************************************");
		// 12. List down the names of all employees in each department ?
		Map<String, List<String>> empEachDept = employeeList.stream().collect(Collectors.groupingBy(
				EmployeeDetails::getDepartment, Collectors.mapping(EmployeeDetails::getName, Collectors.toList())));
		System.out.println(empEachDept);
		System.out.println("******************************************************");

		// 13. What is the average salary and total salary of the whole organization ?

		DoubleSummaryStatistics doubleSummaryStatistics = employeeList.stream().collect(Collectors.summarizingDouble(EmployeeDetails::getSalary));
		System.out.println("average salary :: "+doubleSummaryStatistics.getAverage());
		System.out.println("total salary :: "+doubleSummaryStatistics.getSum());
		System.out.println("******************************************************");
		// 15. Who is the oldest employee in the organization?
		EmployeeDetails employeeDetails = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparing(EmployeeDetails::getAge))).get();

		EmployeeDetails employeeDetails2 = employeeList.stream().max(Comparator.comparingInt(EmployeeDetails::getAge))
				.get();
		System.out.println(employeeDetails.getName());
		System.out.println("******************************************************");

		// 14. Separate the employees who are younger or equal to 25 years from those
		// employees who are older than 25 years ?
		Map<Boolean, List<EmployeeDetails>> partitionObject = employeeList.stream()
				.collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		System.out.println("Complete Partition Object :: " + partitionObject);
		System.out.println("employees who are younger or equal to 25 years :: " + partitionObject.get(Boolean.FALSE));
		System.out.println("Employee who are older than 25 :: " + partitionObject.get(Boolean.TRUE));

	}

}
