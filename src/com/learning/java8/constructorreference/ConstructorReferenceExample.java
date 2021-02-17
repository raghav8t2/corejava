package com.learning.java8.constructorreference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import com.learning.db.StudentDB;
import com.learning.pojo.Student;

public class ConstructorReferenceExample {

	
	public static void main(String[] args) {
		
		Supplier<Student> emptyStudentSupplier = Student::new;    //requires empty constructor
		
		Function<String, Student> studentSupplier = Student::new;    //call constructor with single arg
		
		System.out.println(emptyStudentSupplier.get());
		System.out.println("****");
		
		System.out.println(studentSupplier.apply("Raghav"));
	}

}
