package week4.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.executeScript("window.open(\"https://in.godaddy.com/\")");
		
		
//		driver.findElementByLinkText("Click Here").click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		driver.quit();
		
		
//		Set<String> windowHandles = driver.getWindowHandles();
//		System.out.println(windowHandles);
//		List<String> list = new ArrayList<String>();
//		list.addAll(windowHandles);
//		
//		driver.switchTo().window(list.get(1));
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
	}

}







