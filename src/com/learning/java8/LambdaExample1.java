package com.learning.java8;

import java.util.List;

import com.learning.db.StudentDB;
import com.learning.pojo.Student;

public class LambdaExample1 {

	public static void main(String[] args) {

		List<Student> students = StudentDB.getStudents();
		students.forEach((student) -> System.out.println(student.toString()));
	}

}
