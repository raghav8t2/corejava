package com.learning.java8.functionalinterfaces;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

import com.learning.db.StudentDB;
import com.learning.pojo.Student;

public class BiPredicateInterfaceImpl {

	static List<Student> allStudents = StudentDB.getStudents();
	
	static BiPredicate<Student, Integer> p1 = (student, gpa) -> {
		return student.getGpa() >= gpa;
	};
	
	static BiPredicate<Student, Integer> p2 = (student, grade) -> {
		return student.getGrade() == grade;
	};
	
	public static void getStudentsWithGpaAbove3() {
		allStudents.forEach((s) -> {
			if(p1.test(s, 3)) {
				System.out.println(s.toString());
			};
		});
	}
	
	public static void getStudentsOfGrade2AndGpaAbove3() {
		allStudents.forEach((s) -> {
			if(p1.and(p2).test(s, 2)) {
				System.out.println(s.toString());
			};
		});
	}
		
		
	public static void main(String[] args) {
		System.out.println("Predicate Example1: Get students with GPA above 3");
		getStudentsWithGpaAbove3();
		System.out.println(" ");
		System.out.println("Predicate Example2: Get Grade2students with GPA above 3");
		getStudentsOfGrade2AndGpaAbove3();
	}

}
