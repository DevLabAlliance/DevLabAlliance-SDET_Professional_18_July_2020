package week5.learnTestNG2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

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
		driver.findElement(By.xpath("//button[@type='submit']")).click();
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











