package com.learning.java8.functionalinterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.learning.db.StudentDB;
import com.learning.pojo.Student;

public class ConsumerInterfaceImpl {
	
	static List<Student> students = StudentDB.getStudents();
	static Consumer<Student> c1 = (student) -> System.out.println(student);
	static Consumer<Student> c2 = (student) -> System.out.print(student.getName());
	static Consumer<Student> c3 = (student) -> System.out.println(student.getActivities());
	
	public static void printStudents() {
		students.forEach(c1);
	}
	
	public static void printNameAndActivities() {
		students.forEach(c2.andThen(c3));
	}
	
	public static void printNameAndActivitiesForGrade(int grade) {
		students.forEach((student) -> {
			if(student.getGrade() == grade) {
				c2.andThen(c3).accept(student);   //consumer chaining
			}
		});
	}
	
	public static void main(String args[]) {

		System.out.println("***************Student DB***************");
		printStudents();
		System.out.println("\n***************Student & Activites***************");
		printNameAndActivities();
		System.out.println("\n***************Student & Activites for Grade2***************");
		printNameAndActivitiesForGrade(2);
		
	}
}
