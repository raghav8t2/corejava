package com.learning.java8.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.learning.db.StudentDB;
import com.learning.pojo.Student;

public class SupplierImpl {

	
	public static void main(String[] args) {
		Supplier<Student> studentSupplier = () -> {
			return new Student("Jim", 4, 4.8, Arrays.asList("Dancing", "Swimming", "Singing"));
		};

		Supplier<List<Student>> allStudentsSupplier = () -> StudentDB.getStudents();
		
		System.out.println(studentSupplier.get().toString());
		System.out.println("****");
		
		System.out.println(allStudentsSupplier.get());
	}

}
