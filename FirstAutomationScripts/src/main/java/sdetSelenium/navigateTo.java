package sdetSelenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateTo {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://users//anurag//eclipse//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		@SuppressWarnings("deprecation")
		URL myUrl = new URL("https://www.google.com"); 
		
		dr.navigate().to(myUrl); //fine, for using url object
		
		//dr.get("https://www.google.com"); // cant accept myurl as parameter
		
		//dr.get("https://www.facebook.com");
	}

}

