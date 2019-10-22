//Qazi Ulhaq 10/22/19

package edu.seminolestate.employees;
import edu.seminolestate.payable.*;
import edu.seminolestate.exceptions.*;

public  class HourlyEmployee extends Employee implements Payable {
	private double hoursWorked;
	private double payRate;
	
	public HourlyEmployee(String newFName, String newLName, int newId, double newHours, double newRate) {
		super(newFName, newLName, newId);
		try {
			setHoursWorked(newHours);
			setPayRate(newRate);
		} catch(InvalidArgumentException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public double computeAmountToPay() {
		return hoursWorked * payRate;
	}
	
	public double getHoursWorked() {
		return hoursWorked;
	}
	
	public double getPayRate() {
		return payRate;
	}
	
	public void setHoursWorked(double newHours) throws InvalidArgumentException{
		if(newHours <= 0) {
			throw new InvalidArgumentException();
		}
		hoursWorked = newHours;
	}
	
	public void setPayRate(double newRate) throws InvalidArgumentException{
		if(newRate <= 0) {
			throw new InvalidArgumentException();
		}
		payRate = newRate;
	}
	
	@Override
	public String toString() {
		return super.toString() + " " + this.getClass() + " hours worked: " + hoursWorked + " pay rate: " 
				+ payRate;
	}
}