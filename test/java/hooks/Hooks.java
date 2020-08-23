package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Result.Type;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class Hooks extends DriverInstance{
	@BeforeStep
	public void beforeStep(Scenario sc) {
		byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "image/png");		
	}
	@AfterStep
	public void afterStep(Scenario sc) {
		byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "image/png");
		
	}
	@Before
	public void beforeScenario(Scenario sc) {
		driver = new ChromeDriver();
		driver.get("https://dev81561.service-now.com/navpage.do");
		byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "image/png");
		System.out.println(sc.getName());
		
	}
	@After
	public void afterScenario(Scenario sc) {
		Type status = sc.getStatus();
		System.out.println(status);
		byte[] screenshotAs = driver.getScreenshotAs(OutputType.BYTES);
		sc.embed(screenshotAs, "image/png");
		driver.close();		
	}

}
