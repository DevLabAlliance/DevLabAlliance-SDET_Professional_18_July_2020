package week5.learnTestNG;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Crickets {

	@Test
	public void testCricket(){
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElementByName("q").sendKeys("cricket", Keys.ENTER);
		List<WebElement> crickets = driver.findElementsByXPath(
				"//*[contains(text(),'cricket') or contains(text(),'Cricket')]"
				);
		System.out.println(crickets.size());
		driver.quit();
		/*
		 * List<String> ls = new ArrayList<String>(); for (WebElement one : crickets) {
		 * ls.add(one.getText()); } Collections.sort(ls);
		 */
	}

}
