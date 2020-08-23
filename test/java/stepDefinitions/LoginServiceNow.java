package stepDefinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.DriverInstance;

public class LoginServiceNow extends DriverInstance {
//	ChromeDriver driver ;

	@Given("launch browser")
	public void launchBrowser() {
		// system.setproperty
		driver = new ChromeDriver();
	}	
	@And("load url")
	public void loadURL() {
		driver.get("https://dev81561.service-now.com/navpage.do");
	}

	@And("maximize browser")
	public void maximizeBrowser() {
		driver.manage().window().maximize();
	}
	@When("enter user name as {string}")
	public void enterUserNameAs(String username) {
		 driver.switchTo().frame(0);
		 System.out.println(username);
		 driver.findElementById("user_name").sendKeys(username);
//		 driver.switchTo().defaultContent();
	}

	@When("enter password {string}")
	public void enterPassword(String password) {
		System.out.println(password);
		driver.findElementById("user_password").sendKeys(password);
	}

	/*
	 * @When("enter user name") public void enterUserName() {
	 * driver.switchTo().frame(0);
	 * driver.findElementById("user_name").sendKeys("admin"); }
	 * 
	 * @When("enter password") public void enterPassword() {
	 * driver.findElementById("user_password").sendKeys("Pass123$"); }
	 */

	@When("user clicks on login")
	public void userClicksOnLogin() {
		driver.findElementById("sysverb_login").click();
	}

	@Then("login should success")
	public void loginShouldFailure() {
		System.out.println("pass");
	}
	@But("login should fail")
	public void fail() {
		System.out.println("failed");
	}
	@And("close browser")
	public void closeBrowser() {
		driver.quit();
	}

}
