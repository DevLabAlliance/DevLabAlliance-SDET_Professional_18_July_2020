package firstScript;

import org.openqa.selenium.chrome.ChromeDriver;

public class LauchBrowser {

	public static void main(String[] args) {
		
		
		// chrome
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.selenium.dev/downloads/");
		

	}

}
