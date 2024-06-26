package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExample {
	
	WebDriver dr;
	
	@BeforeClass
	void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anurag\\eclipse\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://demo.guru99.com/");
	}
	
	
	@Test(priority=0)
	void logoTest() {
		WebElement logo = dr.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/a/img"));
		boolean case1 = logo.isDisplayed();
		Assert.assertTrue(case1,"logo displayed");
	}
	
	@Test(priority=2,enabled=true)
	void loginTest() {
	WebElement TextField = dr.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input"));
	TextField.sendKeys("anurag.mail@anurag.com");
	}
	
	@Test(priority=1)
	void titleTest() {
	String title =	dr.getTitle();
	Assert.assertEquals(title, "Guru99 Bank Home Page", "mismatch!!!!!");
	}
	
	@Test(dependsOnMethods= {"loginTest"})
	void submitTest() {
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
	}
	
	@AfterClass
	void tearDown() throws InterruptedException {
		dr.quit();
	}
}
