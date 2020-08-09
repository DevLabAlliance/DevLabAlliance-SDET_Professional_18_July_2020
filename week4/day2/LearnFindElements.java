package week4.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFindElements {
	
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://devlabs-860f0.web.app/edit");
		List<WebElement> labels = driver.findElementsByTagName("label");
		int size = labels.size();
		System.out.println("The size are: "+size);
		WebElement last = labels.get(size -1);
		System.out.println(last.getText());
		for (WebElement oneLabel : labels) {
//			oneLabel.sendKeys("cricket", Keys.ENTER);
			System.out.println(oneLabel.getText());
		}
		driver.quit();		
	}

}
