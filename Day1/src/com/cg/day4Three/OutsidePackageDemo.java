package com.cg.day4Three;

import com.cg.day4one.InsidePackage;

public class OutsidePackageDemo {

	public static void main(String[] args) {
		InsidePackage ii = new InsidePackage();
		
		ii.pubMethod();
		
		ii.pubVar = 100;
		ii.pubMethod();
		
	}

}
