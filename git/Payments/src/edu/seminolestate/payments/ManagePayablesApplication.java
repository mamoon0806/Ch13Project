//Qazi Ulhaq 10/22/19

package edu.seminolestate.payments;
import java.text.NumberFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import edu.seminolestate.bill.*;
import edu.seminolestate.payable.*;
import edu.seminolestate.employees.*;
import edu.seminolestate.exceptions.InvalidArgumentException;

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
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
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
		int vendorNameInt = 0;
		int amountDueInt = 0;
		int dueDateInt = 0;
		String vendorName = "";
		int amountDue = 0;
		LocalDate dueDate = LocalDate.parse("2001-01-01");
		
		while(true) {
			if(input == 0) {
				try {
					displayMenu();
					input = sc.nextInt();
				} catch(InputMismatchException e) {
					System.out.println("Enter a valid number");
					input = 0;
					displayMenu();
				}
			}
			
			if(input == 1) {
				try {
					
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
							firstNameInt = 0;
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
							lastNameInt = 0;
						}
					}
					
					while(idInt == 0) {
						try {
							System.out.println("Enter an ID");
							id = Integer.parseInt(sc.next());
							
							if(id <= 0) {
								 throw new Exception();
							}
							
							idInt = 1;
						} catch(Exception e) {
							System.out.println("Enter a valid ID");
							idInt = 0;
						}
					}
					
					while(hoursWorkedInt == 0) {
						try {
							System.out.println("Enter the hours worked");
							 hoursWorked = Integer.parseInt(sc.next());
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
							 payRate = Integer.parseInt(sc.next());
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
					firstNameInt = 0;
					lastNameInt = 0;
					idInt = 0;
					hoursWorkedInt = 0;
					payRateInt = 0;
					input=0;
				} catch(InputMismatchException e) {
					System.out.println("Error: please enter valid data");
					input = 1;
				}
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
							 id = Integer.parseInt(sc.next());
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
							 annualSalary = Integer.parseInt(sc.next());
							 if(annualSalary <= 0) {
								 throw new Exception();
							 }
							 annualSalaryInt = 1;
						} catch(Exception e) {
							System.out.println("Enter a valid annual salary");
						}
					}
					
					Manager manager = new Manager(firstName, lastName, id, annualSalary);
					list.add(manager);
					firstNameInt = 0;
					lastNameInt = 0;
					idInt = 0;
					annualSalaryInt = 0;
					input = 0;
					
				}
			
				
			
			if(input == 3) {
				while(vendorNameInt == 0) {
					try {
						System.out.println("Enter a vendor name");
						vendorName = sc.next();
						if(vendorName.length() < 1 || vendorName == null) {
							throw new Exception();
						}
						vendorNameInt = 1;
					} catch(Exception e) {
						System.out.println("Enter a valid name");
					}
				}
				
				while(amountDueInt == 0) {
					try {
						System.out.println("Enter a amount due");
						amountDue = Integer.parseInt(sc.next());
						if(amountDue <= 0) {
							throw new Exception();
						}
						amountDueInt = 1;
					} catch(Exception e) {
						System.out.println("Enter a valid amount due");
					}
				}
				
				
				while(dueDateInt == 0) {
					try {
						System.out.println("Enter a due date FORMAT: 2000-01-01");
						String userDate = sc.next();
						dueDate = LocalDate.parse(userDate);
						dueDateInt = 1;
					} catch(DateTimeParseException e) {
						System.out.println("Enter a valid date");
					}
				}
					
				Bill bill = new Bill(vendorName, amountDue, dueDate);
				list.add(bill);
				input = 0;
				vendorNameInt = 0;
				amountDueInt = 0;
				dueDateInt = 0;
			}
			
			if(input == 4) {
				for(Payable payables : list) {
					System.out.println(payables.toString());
					System.out.println(formatter.format(payables.computeAmountToPay()));
				}
				input = 0;
			}
			
			if(input == 5) {
				System.out.println("bye");
				System.exit(0);
			}
		}
	}
}
	
