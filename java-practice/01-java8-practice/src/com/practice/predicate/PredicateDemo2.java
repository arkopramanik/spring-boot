package com.practice.predicate;
/*
 * List of persons whose age is >=18 using lambda expression
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}

public class PredicateDemo2 {

	public static void main(String[] args) {
		Person p1 = new Person("Arko", 33);
		Person p2 = new Person("Diskha", 30);
		Person p3 = new Person("Hridaan", 1);
		Person p4 = new Person("Duggu", 9);
		Person p5 = new Person("Sindhiya", 32);

		List<Person> personList = Arrays.asList(p1, p2, p3, p4, p5);

		Predicate<Person> predicate = person -> person.age >= 18;
		
		for (Person person : personList) {
			if (predicate.test(person)) {
				System.out.println(person.name);
			}

		}

	}

}
