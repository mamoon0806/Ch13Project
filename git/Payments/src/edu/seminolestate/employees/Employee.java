//Qazi Ulhaq 10/22/19

package edu.seminolestate.employees;
import edu.seminolestate.exceptions.InvalidArgumentException;
import edu.seminolestate.payable.*;

public abstract class Employee implements Payable{
	private String firstName;
	private String lastName;
	private int id;
	
	public Employee(String newFName, String newLName, int newId) {
		try {
			setFirstName(newFName);
			setLastName(newLName);
			setId(newId);
		} catch(InvalidArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getId() {
		return id;
	}
	
	public void setFirstName(String newFName) throws InvalidArgumentException{
		if(newFName == null || newFName.length() < 1) {
			throw new InvalidArgumentException();
		}
		firstName = newFName;
	}
	
	public void setLastName(String newLName) throws InvalidArgumentException{
		if(newLName == null || newLName.length() < 1) {
			throw new InvalidArgumentException();
		}
		lastName = newLName;
	}
	
	public void setId(int newId) throws InvalidArgumentException{
		if(newId <= 0) {
			throw new InvalidArgumentException();
		}
		id = newId;
	}
	
	@Override
	public String toString() {
		return this.getClass() + " first name: " + firstName + " last name: " + lastName
				+ " id: " + id;
	}
}
