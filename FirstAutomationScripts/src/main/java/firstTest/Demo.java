package firstTest;



	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import java.time.Duration;

	public class Demo {
	    public static void main(String[] args) {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Anurag\\eclipse\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

	        driver.getTitle();

	        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

	        WebElement textBox = driver.findElement(By.name("my-text"));
	        @SuppressWarnings("unused")
			WebElement submitButton = driver.findElement(By.cssSelector("button"));

	        textBox.sendKeys("Selenium");
//	        submitButton.click();
//
//	        WebElement message = driver.findElement(By.id("message"));
//	        message.getText();

//	        driver.quit();
	    }
	}
	

