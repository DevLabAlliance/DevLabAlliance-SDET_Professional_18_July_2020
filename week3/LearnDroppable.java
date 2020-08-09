package week3;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDroppable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //open the url
        driver.get("https://jqueryui.com/draggable/");
        driver.switchTo().frame(0);
               
        //find element
        WebElement source = driver.findElementById("draggable");
        Actions builder = new Actions(driver);
        Thread.sleep(3000);
        Point location = source.getLocation();
        int x = location.getX();
        int y = location.getY();
        builder.dragAndDropBy(source, x+20, y+40).perform();
        
	}
}
