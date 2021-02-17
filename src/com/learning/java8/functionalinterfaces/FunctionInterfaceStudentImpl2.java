package com.learning.java8.functionalinterfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import com.learning.db.StudentDB;
import com.learning.pojo.Student;

public class FunctionInterfaceStudentImpl2 {

	static BiFunction<List<Student>, Predicate<Student>, List<Student>> studentFunction1 = (studentsList, p1) -> {
		List<Student> grade2Students = new ArrayList<Student>();
		studentsList.forEach((student)->{
			if(p1.test(student)){
				grade2Students.add(student);
			};
		});
		return grade2Students;	
	};
	
	public static void main(String[] args) {
		System.out.println("All students:");
		ConsumerInterfaceImpl.printStudents();
		System.out.println("\nGrade2:");
		System.out.println(studentFunction1.apply(StudentDB.getStudents(), PredicateInterfaceImpl.p2));
	}

}
