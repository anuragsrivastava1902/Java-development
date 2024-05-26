package parallelTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class ParallelTest2 {
	WebDriver dr;

	@Test
	void loginTest() {
		System.setProperty("webdriver.chrome.driver","C://users//anurag//eclipse//chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://demo.guru99.com/");
		WebElement text = dr.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input"));
		text.sendKeys("helllo@anurag.com");
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
		String title = dr.getTitle();
		Assert.assertEquals(title,"Guru99 Bank Home Page");
	}
	
	@AfterMethod
	void tearDown() throws InterruptedException {
		dr.quit();
		Thread.sleep(2000);
	}
}
