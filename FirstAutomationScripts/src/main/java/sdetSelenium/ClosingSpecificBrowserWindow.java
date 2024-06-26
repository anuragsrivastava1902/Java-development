package sdetSelenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://users//anurag//eclipse//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.w3schools.com/tags/att_a_target.asp");
		WebDriverWait myWait = new WebDriverWait(dr, Duration.ofSeconds(5));
		
		myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[2]/a"))).click();
		
		//dr.get("https://www.w3schools.com");
		
		Set<String> winHandles = dr.getWindowHandles();
		
		for(String winId: winHandles) {
			String title = dr.switchTo().window(winId).getTitle();
			System.out.println(title);
			
			if(title.equals("W3Schools Tryit Editor")) {
				dr.close();
			}
		}

	}

}
