package sdet;

import org.testng.annotations.Test;

public class PriorityExample {

	@Test(priority=0)
	void test5() {
		System.out.println("This is test 5");
	}
	
	@Test(priority=1)
	void test6() {
		System.out.println("This is test 6");
	}
	
	@Test(priority=2,enabled=false)
	void test7() {
		System.out.println("This is test 7");
	}
	
	@Test(priority=3)
	void test8() {
		System.out.println("This is test 8");
	}
}
