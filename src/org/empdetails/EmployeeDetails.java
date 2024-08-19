package org.empdetails;

//                                              call method using scanner class
import java.util.Scanner;

public class EmployeeDetails {
	static Scanner scanner = new Scanner(System.in);
	
	private void embId() {
		System.out.println("Enter your Id :");
		int id = scanner.nextInt();
		
	}
	private void empName() {
		System.out.println("Enter your Name :");
		String name = scanner.next();

	}
	private void empEmail() {
		System.out.println("Enter your Email Id :");
		String email = scanner.next();

	}
	private void empPhoneNo() {
		System.out.println("Enter your Phone No :");
		int phone = scanner.nextInt();

	}
	private void empSalary() {
		System.out.println("Enter your Salary :");
		int salary = scanner.nextInt();

	}
	private void empGender() {
		System.out.println("Enter your Gender :");
		String gender = scanner.next();

	}
	private void empCity() {
		System.out.println("Enter your current City :");
		String city = scanner.next();

	}
	
	public static void main(String[] args) {
		EmployeeDetails em = new EmployeeDetails();
		System.out.println("Employee Details");
		em.embId();
		em.empName();
		em.empEmail();
		em.empPhoneNo();
		em.empSalary();
		em.empGender();
		em.empCity();
		
	scanner.close();
	}
	

}
