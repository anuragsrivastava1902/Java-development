package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Open {

	WebDriver driver;
	@BeforeTest
	public void FirstTest() {
        // declaration and instantiation of objects/variables
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Anurag\\eclipse\\chromedriver.exe");
     driver = new ChromeDriver();
	}
	
	@Test
	void doTest1() {
	 String baseUrl = "https://www.lambdatest.com/";
     String expectedTitle = "LambdaTest - Perform all your tests on cloud";
     String actualTitle = "";

   
	// launch Chrome and direct it to the Base URL
     driver.get(baseUrl);

     // get the actual value of the title
     actualTitle = driver.getTitle();
     
     /*
      * compare the actual title of the page with the expected one and print
      * the result as "Passed" or "Failed"
      */
	     if (actualTitle.contentEquals(expectedTitle)){
	         System.out.println("Test Passed!");
	     } else {
	         System.out.println("Test Failed");
	     }
    
     //close Fire fox
     driver.close();
	}
	
	void doTest2() {
		
	}
	
}

