package edu.seminolestate.properties;

import java.io.Serializable;

public abstract class Property implements Serializable, Comparable<Property> {
	private int propertyID;
	private String address;
	private double numberOfBaths;
	private int numberOfBedrooms;
	
	@Override
	public int compareTo(Property objectToCompare) {
		return this.propertyID - objectToCompare.propertyID;
	}
	
	@Override
	public String toString() {
		return this.getClass() + " property id: " + propertyID + " address: " + address 
				+ " number of baths: " + numberOfBaths + " number of bedrooms: " + numberOfBedrooms;
	}
	
	public Property(int newPropertyID, String newAddress, double newNumberOfBaths, int newNumberOfBedrooms) {
		
	}
	
	public void setPropertyID(int newPropertyID) throws IllegalPropertyArgumentException{
		if(newPropertyID <= 0) {
			throw new IllegalPropertyArgumentException("Property ID must be greater than 0");
		}
		propertyID = newPropertyID;
	}
	
	public void setAddress(String newAddress) throws IllegalPropertyArgumentException {
		if(newAddress == null || newAddress.length() < 1) {
			throw new IllegalPropertyArgumentException("Address must not be null or less than length of one");
		}
		address = newAddress;
	}
	
	public void setNumberOfBaths(double newNumberOfBaths) throws IllegalPropertyArgumentException {
		if(newNumberOfBaths <= 0) {
			throw new IllegalPropertyArgumentException("Number of baths must be greater than 0");
		}
		numberOfBaths = newNumberOfBaths;
	}
	
	public void setNumberOfBedrooms(int newNumberOfBedrooms) throws IllegalPropertyArgumentException {
		if(newNumberOfBedrooms <= 0) {
			throw new IllegalPropertyArgumentException("Number of bedrooms must be greater than 0");
		}
		numberOfBedrooms = newNumberOfBedrooms;
	}
	
	
	public int getPropertyID() {
		return propertyID;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getNumberOfBaths() {
		return numberOfBaths;
	}
	
	public int getNumberOfBedrooms() {
		return numberOfBedrooms;
	}
	
}
