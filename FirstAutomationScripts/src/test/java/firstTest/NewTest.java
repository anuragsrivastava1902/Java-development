package firstTest;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
//comment the above line and uncomment below line to use Chrome
//import org.openqa.selenium.chrome.ChromeDriver;
public class NewTest {
    @Test
    public void FirstTest() {
        
     System.setProperty("webdriver.chrome.driver","C:\\Users\\Anurag\\eclipse\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     
        String baseUrl = "https://www.lambdatest.com/";
        String expectedTitle = "LambdaTest - Perform all your tests on cloud";
        String actualTitle = "";
 
       
        driver.get(baseUrl);
 
        actualTitle = driver.getTitle();       
       
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
       
       
        driver.close();
       
    }
 
}