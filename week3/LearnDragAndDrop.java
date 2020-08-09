package week3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// maximize 
		driver.manage().window().maximize();
		// load the url
		driver.get("https://devlabs-860f0.web.app/aui");
		WebElement source = driver.findElementById("draggable");
		WebElement target = driver.findElementById("droppable");
		Actions builder = new Actions(driver);
		builder.dragAndDrop(source, target).
			build().perform();
		// build().perform() -- .perform()
		
		// notes:
		
		// 1. Actions class no exception
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
