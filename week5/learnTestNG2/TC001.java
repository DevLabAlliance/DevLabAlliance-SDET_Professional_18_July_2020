package week5.learnTestNG2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import commonFunctions.PrePost;

public class TC001 extends PrePost {
	
	@Test
	public void tc001_auth() {
		
		// goto auth page
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='auth']")).click();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
	}

}
