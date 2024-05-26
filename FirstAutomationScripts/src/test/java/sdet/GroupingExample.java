package sdet;

import org.testng.annotations.Test;

public class GroupingExample {

	@Test(groups= {"anurag"})
	void testA() {
		System.out.println("I'm test AA");
	}
	
	@Test(groups= {"dhananjay"})
	void testB() {
		System.out.println("I'm test BB");
	}
	
	@Test(groups= {"anurag"})
	void testC() {
		System.out.println("I'm test CC");
	}
	
	@Test(groups= {"shivam"})
	void testD() {
		System.out.println("I'm test DD");
	}
}
