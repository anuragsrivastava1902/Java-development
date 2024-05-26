package sdetSelenium.handlers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckboxes {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://users//anurag//eclipse//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		
		dr.get("https://testautomationpractice.blogspot.com/");
		dr.manage().window().maximize();
		
		//dr.findElement(By.xpath("//input[@id='sunday']")).click();
		
		List<WebElement> checks = dr.findElements(By.xpath("//[@class='form-check-input' and @type='checkbox']"));
		for(int i=0;i<checks.size();i++) {
			checks.get(i).click();
		}
	
	
	}

}
