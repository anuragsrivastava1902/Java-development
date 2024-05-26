package sdetSelenium.handlers;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://users//anurag//eclipse//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://www.w3schools.com/tags/att_a_target.asp");
		WebDriverWait myWait = new WebDriverWait(dr, Duration.ofSeconds(5));
		
		myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"main\"]/div[2]/a"))).click();
		
		Set<String> winHandles = dr.getWindowHandles();
		List<String> windows = new ArrayList<String>(winHandles);
		System.out.println(windows);
		
		String parentWindow = windows.get(0);
		String childWindow = windows.get(1);
		
		System.out.println(childWindow);
		
		dr.switchTo().window(parentWindow);
		String titleP = dr.getTitle();
		System.out.println(titleP);
		
		dr.switchTo().window(childWindow);
		String titleC = dr.getTitle();
		System.out.println(titleC);
		
		
	}

}
