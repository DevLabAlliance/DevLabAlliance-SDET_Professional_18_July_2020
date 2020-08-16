package week5.learnTestNG;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Login {
	
	
	@Parameters({"url", "email", "browser"})
	@Test()
	public void loginTest(String a, String b, String browser) {
		RemoteWebDriver driver ;
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.setHeadless(false);
			 driver = new ChromeDriver(options);
		}else {
			 driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(a);
		driver.findElementById("username")
			.sendKeys(b);
		WebElement password = driver.findElementByName("password"); 
		String placeholdervalue = password.getAttribute("placeholder");
		System.out.println(placeholdervalue); 
		password.sendKeys("Pass123$");
		driver.findElementById("remember-me").click();
		driver.findElementById("submit").click();
		driver.quit();
	}


}
