package com.learning.pojo;

import java.util.List;

public class Student {
	String name;
	int grade;
	double gpa;
	List<String> activities;
	
	public Student(String name, int grade, double gpa, List<String> activities) {
		this.name = name;
		this.gpa = gpa;
		this.grade = grade;
		this.activities = activities;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public List<String> getActivities() {
		return activities;
	}
	public void setActivities(List<String> activities) {
		this.activities = activities;
	}
	
	@Override
	public String toString() {
		
		return "Name="+name+", Grade="+grade+", GPA="+gpa+", Activities="+activities;
	}
}
