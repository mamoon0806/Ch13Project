package edu.seminolestate.bill;

import edu.seminolestate.exceptions.InvalidArgumentException;
import edu.seminolestate.payable.*;

import java.time.DateTimeException;
import java.time.LocalDate;

public class Bill implements Payable {
	private String vendorName;
	private double amountOwed;
	private LocalDate dueDate;
	
	public Bill(String vendor, double amount, LocalDate dueDate) {
		try {
			setVendorName(vendor);
			setAmountOwed(amount);
			setDueDate(dueDate);
		} catch(InvalidArgumentException e) {
			System.out.println(e.getMessage());
		}

	}
	
	public double computeAmountToPay() {
		return amountOwed;
	}
	
	public String getVendorName() {
		return vendorName;
	}
	
	public void setVendorName(String newName) throws InvalidArgumentException {
		if(newName == null || newName.length() < 1) {
			throw new InvalidArgumentException();
		} else {
			vendorName = newName;
		}

	}
	
	public double getAmountOwed() {
		return amountOwed;
	}
	
	public void setAmountOwed(double newAmount) throws InvalidArgumentException {
		if(newAmount <= 0) {
			throw new InvalidArgumentException();
		} else {
			amountOwed = newAmount;
		}

	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(LocalDate newDueDate) throws InvalidArgumentException {
		if(newDueDate == null) {
			throw new InvalidArgumentException();
		} else {
			dueDate = newDueDate;
		}

	}
	
	public void setDueDate(int newYear, int newMonth, int newDay) {
		try {
			dueDate = LocalDate.of(newYear, newMonth, newDay);
		} catch(DateTimeException e) {
			System.out.println(e.getMessage());
		}

	}
	
	@Override
	public String toString() {
		return this.getClass() + " vendor name: " + vendorName + " amount owed: " + amountOwed
				+ " due date: " + dueDate;
	}
}
