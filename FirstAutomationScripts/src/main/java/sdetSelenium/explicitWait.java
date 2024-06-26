package sdetSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C://Users//anurag//eclipse//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		//Declaration of explicit wait by using WebDriverWait class object.
		WebDriverWait myWait = new WebDriverWait(dr,Duration.ofSeconds(10));
		
		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement cart = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")));
		cart.sendKeys("Admin");
		
		
		WebElement pass = myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")));
		pass.sendKeys("admin123");
		
		WebElement submit = myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
		submit.click();
	}

}
