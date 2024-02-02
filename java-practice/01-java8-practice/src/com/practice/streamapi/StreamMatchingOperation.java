package com.practice.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Person {
	String name;
	String country;

	public Person(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", country=" + country + "]";
	}

}

//Matching Operation in String - Terminal Methods
public class StreamMatchingOperation {

	public static void main(String[] args) {

		List<Person> persons = Arrays.asList(new Person("Arko", "India"), new Person("Diksha", "China"),
				new Person("Abhishekh", "India"));

		boolean match = persons.stream().anyMatch(p -> p.country.equals("India"));
		System.out.println(match);

		Optional<Person> findFirst = persons.stream().filter(p -> p.country.equals("India")).findFirst();

		if (findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}

		Optional<Person> personAny = persons.stream().filter(p -> p.country.equals("India")).findAny();
		if (personAny.isPresent()) {
			System.out.println(personAny.get());
		}
		
		List<Person> collect = persons.stream().filter(p->p.country.equals("India")).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
		
		List<String> name = persons.stream().filter(p->p.country.equals("India")).map(p->p.name).collect(Collectors.toList());
		name.forEach(System.out::println);

	}

}
