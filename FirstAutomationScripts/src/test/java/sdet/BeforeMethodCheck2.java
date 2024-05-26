package sdet;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeMethodCheck2 {

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
	void test3() {
		System.out.println("		This is test3");
	}

	@Test
	void test4() {
		System.out.println("		this is test4");
	}
	
	@BeforeSuite
	void beforeSuite() {
		System.out.println("++++I'm before every test suite");	
	}
	
	@AfterSuite
	void afterSuite() {
		System.out.println("++++I'm after every test suite");	
	}
	
}
