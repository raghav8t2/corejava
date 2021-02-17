package com.learning.java8.functionalinterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.learning.db.StudentDB;
import com.learning.pojo.Student;

public class BiConsumerInterfaceImpl {

	//implement printNameAndAcitivities method similar to ConsumerInterface using BiConsumer
	public static void printNameAndActivities() {
		BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
			System.out.println(name+" :"+activities);
		};
		List<Student> studentsList = StudentDB.getStudents();
		studentsList.forEach((student) -> biConsumer.accept(student.getName(), student.getActivities()));
	}
	
	public static void main(String[] args) {
		
		printNameAndActivities();
	}

}
