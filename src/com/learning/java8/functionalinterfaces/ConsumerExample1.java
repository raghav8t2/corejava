package com.learning.java8.functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.learning.db.StudentDB;
import com.learning.pojo.Student;

public class ConsumerExample1 {

	static Consumer<Student> student = (student) -> System.out.println(student.toString());
	
	static Consumer<Student> studentsOfGrade3 = (student) -> {
		if(student.getGrade() == 3)
			System.out.println(student.toString());
	};
	
	
	public static void getAllStudents() {
		System.out.println("*****All Students*****");
		List<Student> students = StudentDB.getStudents();
		students.forEach(student);
	
	}

	public static void getStudentsOfGrade3() {
		System.out.println("*****Students Of Grade3*****");
		List<Student> students = StudentDB.getStudents();
		students.forEach(studentsOfGrade3);
	
	}
	
	public static void main(String[] args) {

		getAllStudents();	
		System.out.println("  ");
		getStudentsOfGrade3();
	}

}
