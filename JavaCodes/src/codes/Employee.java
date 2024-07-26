package codes;

public class Employee {

	String name;
	String jobTitle;
	double salary;

	public Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}

	public void PrintEmployeeDetails() {
		System.out.println("Name -" + this.name);
		System.out.println("Position -" + this.jobTitle);
		System.out.println("Salary -" + this.salary);
	}
	public void raisesalary(double percentage) {
		salary=salary+salary*percentage/100;
		
	}

	public static void main(String[] args) {

		Employee employee1 = new Employee("sheik", "HR Manager", 40000);

		Employee employee2 = new Employee("venkatesh", "Software Engineer", 60000);

		System.out.println("\nEmployee Details:");
		employee1.PrintEmployeeDetails();
		System.out.println("");
		employee2.PrintEmployeeDetails();
		
		employee1.raisesalary(8);
		employee2.raisesalary(12);
		
		System.out.println("\nEmployee's details after salary increment-");
		System.out.println("\n 8 % for sheik(HR manager)");
		employee1.PrintEmployeeDetails();
		System.out.println("");
		System.out.println("12 % for venkatesh(software engineer)");
		
		employee2.PrintEmployeeDetails();
		
	}
}
