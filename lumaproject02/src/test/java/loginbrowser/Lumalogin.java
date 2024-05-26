package loginbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lumalogin {
	WebDriver driver;
	
    
	@Test(priority =2)
	public void  loginTest() {
		System.setProperty("webdriver.chrome.driver"  , "C:\\Users\\Anurag\\eclipse\\chromedriver.exe");
	    driver  = new ChromeDriver();
		  
		 
		    
		    driver.get("https://www.flipkart.com/");
		    driver.manage().window().maximize();

	}
	@Test(priority =1)
	
		    public void  searchItems() throws InterruptedException {
	  
		   
		    driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[1]/div[2]/form/div/div/input")).sendKeys("mobile");
		    	Thread.sleep(7000);
		    }
		    
	
			/*
			 * @AfterTest public void tearDown() {
			 * 
			 * driver.quit(); driver.close();
			 * 
			 * }
			 */
}
