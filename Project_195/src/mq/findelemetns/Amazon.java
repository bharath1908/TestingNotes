package findelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\kbhar\\OneDrive\\Desktop\\Browser drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		WebElement All = driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));

		List<WebElement> AllOptions = All.findElements(By.tagName("option"));

		for (int i = 0; i < AllOptions.size(); i++) {

			WebElement EachOption = AllOptions.get(i);

			EachOption.click();

		}

	}

}
