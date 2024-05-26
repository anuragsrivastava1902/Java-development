package sdet;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class SecondTest {

	@Test(priority=1)
	void setUp() {
		System.out.println("hello");
	}
	
	@Test(priority=2)
	void login() {
		System.out.println("logged in");
		Assert.assertEquals(1, 0);
	}
	
	@Test(priority=3)
	void close() {
		System.out.println("closed");
	}
}
