package com.learning.java8.lambdas;

import java.util.List;

import com.learning.db.StudentDB;
import com.learning.java8.functionalinterfaces.SupplierImpl;
import com.learning.pojo.Student;

public class LambdaExample1 {

	public static void main(String[] args) {
		int y = 5;
		List<Student> students = StudentDB.getStudents();
		students.forEach((student) -> System.out.println(student.toString()));
	}

}
