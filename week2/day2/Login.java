package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// set the driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		
		// maximize 
		driver.manage().window().maximize();
		
		// load the url
		driver.get("http://dbankdemo.com/login");
		// enter the user name
		driver.findElementById("username")
		.sendKeys("koushik.chatterjee@mail.com");
		// enter the password
		WebElement password = driver.findElementByName("password"); 
		// get the placeholder value
		String placeholdervalue = password.getAttribute("placeholder");
		System.out.println(placeholdervalue); 
		password.sendKeys("Pass123$");
		
		// click on the check box
		driver.findElementById("remember-me").click();
		// click in the submit button
		driver.findElementById("submit").click();
//		driver.findElementByClassName("btn-primary").click();
		
		driver.findElementByXPath("//input[@value='F']").click();

	}

}
