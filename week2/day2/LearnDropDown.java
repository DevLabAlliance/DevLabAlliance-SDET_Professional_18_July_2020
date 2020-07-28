package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		// set the driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		// launch the browser
		ChromeDriver driver = new ChromeDriver();
		// load the url
		driver.get("https://testsheepnz.github.io/BasicCalculator.html");
		
		driver.findElementByXPath("//*[@id=\"selectOperationDropdown\"]/option[3]").click();
		
//		WebElement operation = driver.findElementById("selectOperationDropdown");
		
//		Select sel = new Select(operation);
//		
//		// 
////		sel.selectByVisibleText("Divide");
////		sel.selectByValue("1");
////		sel.selectByIndex(4);
//		
//		WebElement build = driver.findElementByName("selectBuild");
//		Select buildSelector = new Select(build);
//		buildSelector.selectByVisibleText("3");
		
		
		
		
		
		
		
		
		
		
		

	}

}
