package com.learning.java8.methodreference;

import java.util.List;
import java.util.function.Consumer;

import com.learning.db.StudentDB;
import com.learning.pojo.Student;

public class MethodReferenceExample1 {

	//static Consumer<Student> student = (student) -> System.out.println(student.toString());
	//The above lambda can be written as method reference as below
	static Consumer<Student> student = System.out::println;
	
	
	//if there is logic like below, then move the logic to a method and then use method reference
	/* static Consumer<Student> studentsOfGrade3 = (student) -> {
		if(student.getGrade() == 3)
			System.out.println(student.toString());
	};*/
	
	static Consumer<Student> studentsOfGrade3 = MethodReferenceExample1::printStudentsOfGrade3;
	
	static void printStudentsOfGrade3(Student s) {
		if(s.getGrade() == 3)
			System.out.println(s.toString());
	}
	
	
	
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
