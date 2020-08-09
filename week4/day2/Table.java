package week4.day2;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Table {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.drive", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://devlabs-860f0.web.app/table");
		WebElement tables = driver.findElement(By.id("table"));
		List<WebElement> tablesRows = tables.findElements(By.tagName("tr"));
		int size = tablesRows.size();
		System.out.println(size);

		for (int i = 0; i < tablesRows.size(); i++) {
			WebElement row = tablesRows.get(i);
			String text = row.getText();
			System.out.println(text);;
			 List<WebElement> rowsData = row.findElements(By.tagName("td"));
			if(text.contains("Yashwanth")) {
				rowsData.get(3).findElement(By.tagName("input")).click();
				break;
			}
		}
	}
}