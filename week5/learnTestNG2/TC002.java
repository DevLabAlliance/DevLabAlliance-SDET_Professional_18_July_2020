package week5.learnTestNG2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import commonFunctions.PrePost;

public class TC002 extends PrePost {
	@Test()
	public void tc002_alert() throws InterruptedException {
		
		// goto alert page
		driver.findElement(By.xpath("//mat-card[@routerlink='/alert']//div[1]")).click();
		driver.findElementByXPath("//button[.='Simple']").click();
		driver.switchTo().alert().accept();
		System.out.println(driver.getTitle());

		// confirm alert
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss(); // Cancel

		// Prompt alert 
		driver.findElementById("aswdefr").click();
		driver.switchTo().alert();
		alert.sendKeys("koushik");
		alert.accept();

	}
}
