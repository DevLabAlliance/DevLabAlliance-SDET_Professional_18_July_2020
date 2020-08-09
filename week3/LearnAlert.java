package week3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		// set the driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize 
		driver.manage().window().maximize();
		// load the url
		driver.get("https://devlabs-860f0.web.app/alert");
//		driver.findElementByXPath("//button[.='Simple']").click();
		
		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());
		
		
		// Handle Alert
//		Alert myAlert = driver.switchTo().alert();
//		String myAlertText = myAlert.getText();
//		System.out.println(myAlertText);
//		myAlert.accept(); // OK button
		
		// confirm alert
//		driver.findElementByXPath("//button[.='Confirm']").click();
//		Alert myAlert = driver.switchTo().alert();
////		myAlert.accept(); // OK 
//		myAlert.dismiss(); // Cancel
		
		// Prompt alert 
//		driver.findElementById("aswdefr").click();
//		Alert myAlert = driver.switchTo().alert();
//		myAlert.sendKeys("koushik");
//		Thread.sleep(5000);
//		myAlert.accept();
		
		
		
		
		
		
		

	}

}
