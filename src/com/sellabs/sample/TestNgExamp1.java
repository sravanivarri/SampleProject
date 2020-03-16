/**
 * 
 */
package com.sellabs.sample;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author vijay
 *
 */
public class TestNgExamp1 {
	 
	@Test(priority=4,testName="Getting details",description="testing to get the login details")
	public void A() {
		System.out.println("A");
		}
	@BeforeMethod(enabled=false)
	public void B() {
		System.out.println("B");
		}
	@Test(priority=2,dependsOnMethods="D",alwaysRun=true)	
	public void C() {
		System.out.println("C");
		}
	@Test()	
	public void D() {
		System.out.println("D");
		throw new ArithmeticException();
		}
	@Test	
	public void E() {
		System.out.println("E");
		}
	
	
	
	
	
	
	
	

}
