package com.myPracTest.abcTest;


import org.testng.annotations.Test;

public class myTests {
	
		
	@Test	
	public void firsttestcase() {
		
		baseClass bclass = new baseClass();
		
		bclass.launchurl();
		
		System.out.println("Test complete");		
	}
	

}
