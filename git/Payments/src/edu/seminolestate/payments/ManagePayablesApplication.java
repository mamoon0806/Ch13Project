package edu.seminolestate.payments;
import java.util.ArrayList;
import java.util.Scanner;

import edu.seminolestate.bill.*;
import edu.seminolestate.payable.*;
import edu.seminolestate.employees.*;

public class ManagePayablesApplication {
	public static void displayMenu() {
		System.out.println("1 - Add hourly employee\n"
				+ "2 - Add manager\n"
				+ "3 - Add bill\n"
				+ "4 - List all payables\n"
				+ "5 - Exit");
		System.out.println("Enter a number");
	}
	
	public static void main(String[] args) {
		ArrayList<Payable> list = new ArrayList<Payable>();
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int firstNameInt = 0;
		int lastNameInt = 0;
		int idInt = 0;
		int hoursWorkedInt = 0;
		int payRateInt = 0;
		int annualSalaryInt = 0;
		String firstName = "";
		String lastName = "";
		int id = 0;
		int hoursWorked = 0;
		int payRate = 0;
		int annualSalary = 0;
		
		while(true) {
			if(input == 0) {
				try {
					displayMenu();
					input = sc.nextInt();
					if(input != 1 || input != 2 || input != 3 || input != 4 || input != 5) {
						throw new Exception();
					}
				} catch(Exception e) {
					System.out.println("Enter a valid number");
					input = 0;
					displayMenu();
				}
			}
			
			if(input == 1) {
				while(firstNameInt == 0) {
					try {
						System.out.println("Enter a first name");
						 firstName = sc.next();
						 if(firstName.length() < 1 || firstName == null) {
							 throw new Exception();
						 }
						 firstNameInt = 1;
					} catch(Exception e) {
						System.out.println("Enter a valid first name");
					}
				}
				
				while(lastNameInt == 0) {
					try {
						System.out.println("Enter a last name");
						 lastName = sc.next();
						 if(lastName.length() < 1 || lastName == null) {
							 throw new Exception();
						 }
						 lastNameInt = 1;
					} catch(Exception e) {
						System.out.println("Enter a valid last name");
					}
				}
				
				while(idInt == 0) {
					try {
						System.out.println("Enter an ID");
						 id = sc.nextInt();
						 if(id <= 0) {
							 throw new Exception();
						 }
						 idInt = 1;
					} catch(Exception e) {
						System.out.println("Enter a valid ID");
					}
				}
				
				while(hoursWorkedInt == 0) {
					try {
						System.out.println("Enter the hours worked");
						 hoursWorked = sc.nextInt();
						 if(hoursWorked <= 0) {
							 throw new Exception();
						 }
						 hoursWorkedInt = 1;
					} catch(Exception e) {
						System.out.println("Enter a valid hours worked");
					}
				}
				
				while(payRateInt == 0) {
					try {
						System.out.println("Enter the pay rate");
						 payRate = sc.nextInt();
						 if(payRate <= 0) {
							 throw new Exception();
						 }
						 payRateInt = 1;
					} catch(Exception e) {
						System.out.println("Enter a valid pay rate");
					}
				}
				HourlyEmployee employee = new HourlyEmployee(firstName, lastName, id, hoursWorked, payRate);
				list.add(employee);
			}
			
			if(input == 2) {
				while(firstNameInt == 0) {
					try {
						System.out.println("Enter a first name");
						 firstName = sc.next();
						 if(firstName.length() < 1 || firstName == null) {
							 throw new Exception();
						 }
						 firstNameInt = 1;
					} catch(Exception e) {
						System.out.println("Enter a valid first name");
					}
				}
				
				while(lastNameInt == 0) {
					try {
						System.out.println("Enter a last name");
						 lastName = sc.next();
						 if(lastName.length() < 1 || lastName == null) {
							 throw new Exception();
						 }
						 lastNameInt = 1;
					} catch(Exception e) {
						System.out.println("Enter a valid last name");
					}
				}
				
				while(idInt == 0) {
					try {
						System.out.println("Enter an ID");
						 id = sc.nextInt();
						 if(id <= 0) {
							 throw new Exception();
						 }
						 idInt = 1;
					} catch(Exception e) {
						System.out.println("Enter a valid ID");
					}
				}
				
				while(annualSalaryInt == 0) {
					try {
						System.out.println("Enter the annual salary");
						 annualSalary = sc.nextInt();
						 if(annualSalary <= 0) {
							 throw new Exception();
						 }
						 annualSalaryInt = 1;
					} catch(Exception e) {
						System.out.println("Enter a valid annual salary");
					}
				}
				
			}
		}
	}
}
