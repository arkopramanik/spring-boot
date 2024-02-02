package com.practice.constructor;

import java.util.function.Supplier;

class Doctor {
	public Doctor() {
		System.out.println("Doctor constructor");
	}

}

public class Test {
	public static void main(String[] args) {
		// Doctor doctor = new Doctor();
		Supplier<Doctor> sup = Doctor::new;
		System.out.println(sup.get());
	}

}
