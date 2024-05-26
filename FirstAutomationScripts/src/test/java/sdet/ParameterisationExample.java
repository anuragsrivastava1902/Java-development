package sdet;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@SuppressWarnings("unused")
public class ParameterisationExample {
	WebDriver dr;
	
	
	      
	@BeforeClass
	@Parameters({"browser","url"})
	
	
	void setup(String browser, String url) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Anurag\\eclipse\\chromedriver.exe");
			dr = new ChromeDriver();
		}
		dr.get(url);
	}

	
	
	@Test(priority=2,enabled=true)
	@Parameters({"email"})
	void loginTest(String email){
	WebElement TextField = dr.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input"));
	TextField.sendKeys(email);
	//Thread.sleep(5000);
	dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	}
	
	@Test(dependsOnMethods= {"loginTest"})
	void submitTest() {
		dr.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
	}
}
