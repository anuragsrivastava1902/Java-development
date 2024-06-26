package sdetSelenium.handlers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://users//anurag//eclipse//chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		
		
		dr.get("https://ui.vision/demo/webtest/frames/");
		dr.manage().window().maximize();
		
		//Frame 1
		//Switch to the desired frame first
		//A frame can be accessed by passing it inside the switchTo.frame() method..
		//..as frame name, frame id, frame index, and as a webelement.
		//Here, we have passed the frame as a webelement.
		dr.switchTo().frame(dr.findElement(By.xpath("//frame[@src='frame_1.html']")));
		
		//Now, find the particular webelement inside that frame (only possible after switching)
		dr.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("anurag");
		
		//Now we are coming out of the frame and into the main webpage
		dr.switchTo().defaultContent();
		
		//Frame 2
		dr.switchTo().frame(dr.findElement(By.xpath("//frame[@src='frame_2.html']")));
		dr.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("srivastava");
		
		//Now we are coming out of the frame and into the main webpage
		dr.switchTo().defaultContent();
		
		//Frame 3
		dr.switchTo().frame(dr.findElement(By.xpath("//frame[@src='frame_3.html']")));
		dr.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("is");
		
		//inner frame within the frame (part of frame 3)
		//Here, we have passed the frame as index as there is only a single iframe inside the frame 3.
		dr.switchTo().frame(0);
		dr.findElement(By.xpath("//div[@id='i5']//div[@class='AB7Lab Id5V1']")).click();
		
		//Now we are coming out of the frame and into the main webpage
		dr.switchTo().defaultContent();
		
		//Frame 4
		dr.switchTo().frame(dr.findElement(By.xpath("//frame[@src='frame_4.html']")));
		dr.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("amazing");
		
		
		//Now we are coming out of the frame and into the main webpage
		dr.switchTo().defaultContent();
				
		
		
		

	}

}
