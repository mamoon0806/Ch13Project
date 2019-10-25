package edu.seminolestate.properties;

import java.io.Serializable;

public class House extends Property implements Serializable  {
	public double lotSize;
	public double value;
	
	public House(int newPropertyID, String newAddress, double newNumberOfBaths, int newNumberOfBedrooms,
			double newLotSize, double newValue) {
		super(newPropertyID, newAddress, newNumberOfBaths, newNumberOfBedrooms);
		setLotSize(newLotSize);
		setValue(newValue);
	}
	
	@Override
	public String toString() {
		return super.toString() + " lot size: " + lotSize + " value: " + value;
	}
	
	public double getLotSize() {
		return lotSize;
	}
	
	public double getValue(){
		return value;
	}
	
	public void setLotSize(double newLostSize) throws IllegalPropertyArgumentException {
		if(lotSize <= 0) {
			throw new IllegalPropertyArgumentException("Lot size must be greater than 0");
		}
		lotSize = newLostSize;
	}
	
	public void setValue(double newValue) throws IllegalPropertyArgumentException {
		if(value <= 0) {
			throw new IllegalPropertyArgumentException("value must be greater than 0");
		}
		value = newValue;
	}
}
