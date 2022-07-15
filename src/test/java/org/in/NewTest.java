package org.in;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	@BeforeClass
	private void before() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("Before Method");
	}
	@AfterClass
	private void afterClass() {
		System.out.println("After Class");
	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Method");
	}
  @Test
  public void tc1() {
	  System.out.println("Method 1");
  }
  @Test
  private void tc2() {
	  System.out.println("Method 2");
  }
}
