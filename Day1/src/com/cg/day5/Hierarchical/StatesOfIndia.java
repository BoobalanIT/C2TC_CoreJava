package com.cg.day5.Hierarchical;

public class StatesOfIndia {
	private String Countryname;

	public String getCountryname() {
		return Countryname;
	}

	public void setCountryname(String countryname) {
		Countryname = countryname;
	}

	@Override
	public String toString() {
		return "India [Countryname=" + Countryname + "]";
	}
	
}