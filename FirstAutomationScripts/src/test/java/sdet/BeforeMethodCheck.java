package sdet;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class BeforeMethodCheck {
	
	@BeforeClass
	void beforeClass() {
		System.out.println("I'm before the every class execution");
	}
	
	@AfterClass
	void afterClass() {
		System.out.println("I'm after every class execution");
	}
	
	@BeforeMethod
	void beforeMethod() {
		System.out.println("	I'm executing before every test method");
	}
	
	@AfterMethod
	void afterMethod() {
		System.out.println("	I'm executing after every test method");
	}
	
	@Test
	void test1() {
		System.out.println("		This is test1");
	}

	@Test
	void test2() {
		System.out.println("		this is test2");
	}
	
	@BeforeTest
	void beforeTest() {
		System.out.println("-----I'm executing before every test Case");
	}
	
	@AfterTest
	void afterTest() {
		System.out.println("-----I'm executing after every test Case");
	}
	
}
