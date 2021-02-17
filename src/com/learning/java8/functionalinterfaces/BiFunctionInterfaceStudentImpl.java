package com.learning.java8.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.learning.db.StudentDB;
import com.learning.pojo.Student;

public class BiFunctionInterfaceStudentImpl {

	static Function<List<Student>, Map<String, Double>> studentFunction1 = (studentsList) -> {
		Map<String, Double> studentsMap = new HashMap<String, Double>();
		studentsList.forEach((student)->{
			if(PredicateInterfaceImpl.p1.and(PredicateInterfaceImpl.p2).test(student)){
				studentsMap.put(student.getName(), student.getGpa());
			};
		});
		return studentsMap;	
	};
	
	public static void main(String[] args) {
		System.out.println("All students:");
		ConsumerInterfaceImpl.printStudents();
		System.out.println("\nGrade2, GPA>3:");
		System.out.println(studentFunction1.apply(StudentDB.getStudents()));
	}

}
