package week5.learnTestNG2;

import static org.testng.Assert.assertTrue;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commonFunctions.PrePost;
import utils.ReadData;

public class TC001 extends PrePost {
	
	@BeforeClass
	public void setData() {
		excelname = "tc001Data";		
	}
	
	
	@Test(dataProvider = "login")
	public void tc001_auth(String user, String pass) {
		
		// goto auth page
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//span[text()='auth']")).click();
		driver.findElement(By.id("username")).sendKeys(user);
		driver.findElement(By.id("password")).sendKeys(pass);
		WebElement btn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		
		String actual = btn.getCssValue("background-color");
		String expected = "rgba(0, 223, 255, 1)";
		
		
		// hard assert
		Assert.assertEquals(actual, expected);
		
		
//		Assert.assertFalse(actual.equals(expected));
//		assertTrue(actual.equals(expected));

		
		// Soft 
//		SoftAssert sf = new SoftAssert();
//		sf.assertEquals(actual, expected);
//		sf.assertAll();
		
		
		
		
		
		
		btn.click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();		
	}

	
	// just to show demo
	/*
	 * @DataProvider(name = "negaive") public String[][] testDataForNegative() {
	 * String[][] data = new String[2][2]; data[0][0] = "admin"; data[0][1]=
	 * "admin";
	 * 
	 * data[1][0] = "koushik"; data[1][1] = "pass123"; return data; }
	 */

}











