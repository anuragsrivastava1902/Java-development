package sdetSelenium.handlers;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertUsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://users//anurag//eclipse//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		
		dr.get("https://the-internet.herokuapp.com/javascript_alerts");
		dr.manage().window().maximize();
		
		//Finding first alert
				dr.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
				//Wait for 3 secs
				Thread.sleep(3000);
				
				WebDriverWait myWait = new WebDriverWait(dr,Duration.ofSeconds(10));
				Alert myAlert=myWait.until(ExpectedConditions.alertIsPresent());
				
				System.out.println(myAlert.getText());
				myAlert.accept();
	}

}
