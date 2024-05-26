package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ParallelTest1 {

	WebDriver dr;
	
	@Test(priority=0)
	void logoTest() {
		System.setProperty("webdriver.chrome.driver","C://users//anurag//eclipse//chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://www.orangehrm.com/");
		WebElement logo = dr.findElement(By.xpath("/html/body/nav/div/a/img"));
		boolean check = logo.isDisplayed();
		Assert.assertTrue(check);
		
		}
	
	@Test(priority=1)
	void homePageTitleTest() {
		System.setProperty("webdriver.chrome.driver","C://users//anurag//eclipse//chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://www.orangehrm.com/");
		String title = dr.getTitle();
		Assert.assertEquals(title, "Human Resources Management Software | OrangeHRM");
	}
	
	@AfterMethod
	void tearDown() throws InterruptedException {
		dr.quit();
	}
}
