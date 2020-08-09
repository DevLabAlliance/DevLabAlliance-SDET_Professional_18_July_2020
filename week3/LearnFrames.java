package week3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) {
		// set the driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launch the browser
		ChromeDriver driver = new ChromeDriver();

		// maximize 
		driver.manage().window().maximize();

		// load the url
		driver.get("https://devlabs-860f0.web.app/frame");
		// enter the user name
		
		// handle frame
		driver.switchTo().frame(1); // -- first frame
		
//		driver.switchTo().frame("myframe"); // -- id or name
		
		// using webElment
		
//		WebElement myFrame = driver.findElementByXPath("//iframe[@src='/login']");
//		driver.switchTo().frame(myFrame);
		
		driver.findElementById("username").sendKeys("admin");
		
		driver.switchTo().defaultContent();
//		driver.switchTo().parentFrame();
		String myHeaderText = driver.findElementByTagName("h1").getText();
		System.out.println(myHeaderText);
	}

}







