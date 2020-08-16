package week5.learnTestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login1 {
	
	
	@Parameters({"url", "email"})
	@Test()
	public void loginTest(String a, String b) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(false);
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(a);
		driver.findElementById("username")
			.sendKeys(b);
		WebElement password = driver.findElementByName("password12"); 
		String placeholdervalue = password.getAttribute("placeholder");
		System.out.println(placeholdervalue); 
		password.sendKeys("Pass123$");
		driver.findElementById("remember-me").click();
		driver.findElementById("submit").click();
		driver.quit();
	}


}
