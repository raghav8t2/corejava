package com.learning.db;

import java.util.Arrays;
import java.util.List;

import com.learning.pojo.Student;

public class StudentDB {

	private static List<Student> students = Arrays.asList(
			new Student("Arnold", 2, 3.4, Arrays.asList("Dancing", "Swimming", "Singing")),
			new Student("David", 2, 3.9, Arrays.asList("Soccer", "Running")),
			
			new Student("Beck", 3, 4.1, Arrays.asList("Writing", "Tennis")),
			new Student("Ronaldo", 3, 2.9, Arrays.asList("Soccer", "Swimming", "Running")),
			new Student("Anna", 3, 4.8, Arrays.asList("Tennis", "Swimming")),
			
			
			new Student("Steve", 4, 3.7, Arrays.asList("Singing", "Soccer")),
			new Student("Debbie", 4, 4.3, Arrays.asList("Dancing", "Swimming", "Running")),
			new Student("Zack", 4, 3.2, Arrays.asList("Soccer", "Tennis")),
			new Student("Maria", 4, 4.9, Arrays.asList("Dancing"))
			
			);
	
	public static List<Student> getStudents(){
		return students;
	}
	
}
