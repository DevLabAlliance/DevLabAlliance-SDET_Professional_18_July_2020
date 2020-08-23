package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

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
		
		
		
		// Screenshot
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		File file  = new  File("./snaps/img1.png");
		try {
			FileHandler.copy(screenshotAs, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement btn = driver.findElementByXPath("//button[.='Simple']");
		File sc1 = btn.getScreenshotAs(OutputType.FILE);
		File file1  = new  File("./snap/img2.png");
		try {
			FileHandler.copy(sc1, file1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
		
		
		
		/*
		 * driver.switchTo().alert().accept(); System.out.println(driver.getTitle());
		 */
		
		
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
