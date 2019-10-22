//Qazi Ulhaq 10/22/19

package edu.seminolestate.employees;
import edu.seminolestate.exceptions.InvalidArgumentException;
import edu.seminolestate.payable.*;

public class Manager extends Employee implements Payable{
	private double annualSalary;
	
	public Manager(String newFName, String newLName, int newId, double newSalary) {
		super(newFName, newFName, newId);
		try {
			setAnnualSalary(newSalary);
		} catch (InvalidArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public double computeAmountToPay() {
		return annualSalary / 12;
	}
	
	public double getAnnualSalary() {
		return annualSalary;
	}
	
	public void setAnnualSalary(double newSalary) throws InvalidArgumentException{
		if(newSalary <= 0) {
			throw new InvalidArgumentException();
		}
		annualSalary = newSalary;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + this.getClass() + " annual salary: " + annualSalary;
	}
	
}
