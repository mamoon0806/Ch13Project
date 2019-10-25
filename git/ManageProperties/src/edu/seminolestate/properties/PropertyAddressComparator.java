package edu.seminolestate.properties;

import java.util.Comparator;

public class PropertyAddressComparator implements Comparator<Property>{

	@Override
	public int compare(Property o1, Property o2) {
		return o1.compareTo(o2);
	}

}
