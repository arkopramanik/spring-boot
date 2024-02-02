package com.practice.streamapi;

import java.util.stream.Stream;

class User {
	String name;
	int age;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}

}

public class StreamFilterExample2 {
	public static void main(String[] args) {
		User user1 = new User("Arko", 33);
		User user2 = new User("Diksha", 30);
		User user3 = new User("Hridaan", 1);

		Stream.of(user1, user2, user3).filter(i -> i.age >= 18 && i.name.startsWith("A")).forEach(i -> System.out.println(i));

	}

}
