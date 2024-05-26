package sdet;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class DependencyExample {

	@Test(enabled=true)
	void startCar() {
		System.out.println("Car is started");
		Assert.assertEquals(1, 0);
	}
	
	@Test(dependsOnMethods= {"startCar"})
	void driveCar() {
		System.out.println("Now I'm driving the car");
	}
	
	@Test(dependsOnMethods= {"startCar","driveCar"},alwaysRun=true)
	void stopCar() {
		System.out.println("Car is stopped");
	}
}
