package sdetSelenium;
import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigationOfPages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://users//anurag//eclipse//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		dr.get("https://www.google.com");
		dr.navigate().to("https://www.facebook.com");
		
		dr.navigate().back();
		System.out.println(dr.getCurrentUrl());
		
		dr.navigate().forward();
		System.out.println(dr.getCurrentUrl());
		
		Thread.sleep(5000);
		
		dr.navigate().refresh();
		
		

	}

}
