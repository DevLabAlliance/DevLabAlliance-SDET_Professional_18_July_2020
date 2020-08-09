package week3;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionLogin {
	public static void main(String[] args) throws NoSuchElementException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/signin");
		try {
			driver.findElementById("user").sendKeys("admin");
		} catch (Exception e) {
			System.out.println("No element found");
//			throw new Exception();
		}
		driver.findElementById("password").sendKeys("admin");
//		try {
//			driver = null;
//			driver.findElementById("user").sendKeys("admin");
//		}
//		catch (NoSuchElementException e) {
////			driver.findElementById("username").sendKeys("admin");
//			System.err.println("Element not found");
//		}catch (NullPointerException e) {
//			System.err.println("driver is null");
//		}
//		catch (Exception e) {
//			e.printStackTrace();
//			System.out.println("some unknown exception");
//		}
//		finally {
//			System.out.println("hey I will run always");
//		}
//		driver.findElementById("password").sendKeys("admin");
	}
}
