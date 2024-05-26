package sdetSelenium.handlers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://users//anurag//eclipse//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		
		dr.get("https://the-internet.herokuapp.com/javascript_alerts");
		dr.manage().window().maximize();
		
		//Wait for 2 seconds
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Finding first alert
		dr.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		//Switch to the alert that is opened currently
		Alert myAlert0 =dr.switchTo().alert();
		System.out.println(myAlert0.getText());
		myAlert0.accept();
		
		//Wait for 2 seconds again
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Next alert
		dr.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		//Switch to the alert that is opened currently
		Alert myAlert = dr.switchTo().alert();
		System.out.println(myAlert.getText());
		myAlert.dismiss();
		
		
		//Wait for 2 seconds
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Find the prompt button
		dr.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		
		//Switch to the prompt that is opened currently
		Alert myConf = dr.switchTo().alert();
		System.out.println(myConf.getText());
		//Filling the prompt
		myConf.sendKeys("hello");
		//Clicking on OK
		myConf.accept();
		
	}

}
