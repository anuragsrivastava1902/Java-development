package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class Assignment1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://users//anurag//eclipse//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		dr.get("https://testautomationpractice.blogspot.com/");
		dr.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("football");
		dr.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		/*
		 * WebElement links =
		 * dr.findElement(By.xpath("(//div[@id='wikipedia-search-result-link'])[2]"));
		 * links.click();
		 */
		//
	   	WebElement link = dr.findElement(By.xpath("//*[@id=\"wikipedia-search-result-link\"]"));
	   	System.out.println(link.getText());
	   	// }
		/*
		 * for(int i=2;i<7;i++) { WebElement links =
		 * dr.findElement(By.xpath("(//div[@id='wikipedia-search-result-link'])["+i+"]")
		 * ); System.out.println(links.getText()); }
		 */
	}

}
