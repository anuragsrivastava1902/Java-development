package sdet;

import org.testng.annotations.Test;

public class FirstTest {

	@Test(priority=1)
	void setUp() {
		System.out.println("hello");
	}
	
	@Test(priority=2)
	void login() {
		System.out.println("logged in");
	}
	
	@Test(priority=3)
	void close() {
		System.out.println("closed");
	}
}
