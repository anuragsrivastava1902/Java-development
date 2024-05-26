package sdetSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//anurag//eclipse//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		//Implicit wait is written one time, and it will execute whenever it is needed.
		//If the desired element is found within the set time, then next line of code gets executed, without
		//having to wait for the whole of the set time like in Thread.sleep approach.
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		dr.get("https://www.flipkart.com/");
		
		dr.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[2]/div[3]/div/a[1]")).click();
		
		dr.quit();
	}

}
