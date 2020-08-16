package commonFunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class PrePost {

	protected RemoteWebDriver driver;
	@Parameters({"url"})
	@BeforeMethod
	public void startApp(String url) {
		// system.setProperty
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
	
}
