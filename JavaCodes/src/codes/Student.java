/*
 * Manage student courses using the Student class
 */
package codes;

import java.util.*;

public class Student {
	private String name;
	private int grade;
	private ArrayList courses;

	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
		this.courses = new ArrayList();
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public ArrayList getCourses() {
		return courses;
	}

	public void addCourse(String course) {
		courses.add(course);
	}

	public void removeCourse(String course) {
		courses.remove(course);
	}

	public void printStudentDetail() {
		System.out.println("Student Name - " + name);
		System.out.println("Grade - " + grade);
	}

	public static void main(String[] args) {
		Student student1 = new Student("Jebin", 11);
		Student student2 = new Student("Sam", 10);
		Student student3 = new Student("Joel", 8);
		System.out.println("STUDENTS DETAILS :");
		System.out.println("________ _______");
		System.out.print("\n");
		student1.printStudentDetail();
		student2.printStudentDetail();
		student3.printStudentDetail();

		System.out.println("\nAdding course for - " + student1.getName());
		student1.addCourse("Tamil");
		student1.addCourse("English");
		student1.addCourse("Maths");
		System.out.println(student1.getName() + "'s courses - " + student1.getCourses());

		System.out.println("\nAddding course for - " + student2.getName());
		student2.addCourse("tamil");
		student2.addCourse("English");
		student2.addCourse("Biology");
		System.out.println(student2.getName() + "'s course - " + student2.getCourses());
		 
		System.out.println("\nAdding course for - "+student3.getName());
		student3.addCourse("tamil");
		student3.addCourse("English");
	    student3.addCourse("computer");
	    System.out.println(student3.getName()+"'s course - "+student3.getCourses());
	    System.out.println("\nRemoving Maths course and Adding History course for - "+student1.getName());
	    student1.removeCourse("Maths");
	    student1.addCourse("History");
	    System.out.println(student1.getName()+"'s course - "+student1.getCourses());
	}
	
}
