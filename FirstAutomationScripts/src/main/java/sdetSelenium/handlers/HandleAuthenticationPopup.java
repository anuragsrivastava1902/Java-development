package sdetSelenium.handlers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticationPopup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://users//anurag//eclipse//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		//Passing the input values through URL itself
		dr.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		dr.manage().window().maximize();
		

	}

}
