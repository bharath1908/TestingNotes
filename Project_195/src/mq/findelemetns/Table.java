package findelements;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Table {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\kbhar\\OneDrive\\Desktop\\Browser drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"))
				.sendKeys("Admin");
		driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"))
				.sendKeys("admin123");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))
				.click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();

		WebElement Table = driver.findElement(By.className("orangehrm-container"));

		List<WebElement> Rows = Table.findElements(By.className("oxd-table-card"));

		WebElement selectedrow = Rows.get(3);
		List<WebElement> cell = selectedrow.findElements(
				By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/div/div[4]"));
		cell.get(3).click();

	}
}
