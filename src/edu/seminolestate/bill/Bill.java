package edu.seminolestate.bill;

import edu.seminolestate.payable.*;
import java.time.LocalDate;

public class Bill implements Payable {
	private String vendorName;
	private double amountOwed;
	private LocalDate dueDate;
	
	public double computeAmountToPay() {
		return amountOwed;
	}
	
	public String getVendorName() {
		return vendorName;
	}
	
	public void setVendorName(String newName) {
		vendorName = newName;
	}
	
	public double getAmountOwed() {
		return amountOwed;
	}
	
	public void setAmountOwed(double newAmount) {
		amountOwed = newAmount;
	}
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(LocalDate newDueDate) {
		dueDate = newDueDate;
	}
	
	public void setDueDate(int newYear, int newMonth, int newDay) {
		dueDate = LocalDate.of(newYear, newMonth, newDay);
	}
}
