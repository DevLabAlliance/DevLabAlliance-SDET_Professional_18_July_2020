package laernMap;

import java.io.File;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Upload {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		WebElement upload = driver.findElementById("file_upload");
		File f = new File("15 maven.pdf");
		upload.sendKeys(f.getAbsolutePath());
	}

}
