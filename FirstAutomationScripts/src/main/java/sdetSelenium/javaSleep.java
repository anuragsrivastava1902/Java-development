package sdetSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaSleep {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//anurag//eclipse//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		dr.get("https://www.flipkart.com/");
		
		dr.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/header/div[2]/div[3]/div/a[1]")).click();
		Thread.sleep(3000);
		dr.quit();
		}

}
