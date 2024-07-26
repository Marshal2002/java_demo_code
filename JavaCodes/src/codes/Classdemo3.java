/*Write a Java program to create a class called "Employee" with a name, job title, and salary attributes,
and methods to calculate and update salary. */

package codes;

import java.util.*;

class x {
	String name, job_title;

	int salary;

	void Empdetails(String name, String job_title) {
		System.out.println("Employee  -  " + name);
		System.out.println("Employee's Position - " + job_title);

	}

	void Employsalary (int salary) {
		System.out.println("salary -" + salary);
	}
}

public class Classdemo3 {
	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		x details = new x();
		System.out.println("Enter employee name:");
		String name = x.nextLine();
		System.out.println("Enter employee Job_title:");
		String job_title = x.nextLine();
		System.out.println("Enter employee Salary:");
		int salary = x.nextInt();
		
		details.Empdetails(name, job_title);
		//salary
		x sal = new x();
		sal.Employsalary(salary);
	}

}
