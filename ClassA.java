package inheritance;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassA {

	WebDriver driver;

	public void browser_launch() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kbhar\\OneDrive\\Desktop\\Browser drivers\\chromedriver.exe");
		// Launching browser method
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

	}

	public void signup() {
		driver.findElement(By.xpath(
				"/html/body/div[2]/div/div/div[1]/div/div/div/div[1]/section/main/article/div[2]/div[2]/div/p/a/span"))
				.click();
	}

	public void signin() throws Exception {

		Robot R = new Robot();

		Thread.sleep(3000);

		R.mouseMove(1102, 382);
		R.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
		R.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
		R.keyPress(KeyEvent.VK_K);
		R.keyPress(KeyEvent.VK_B);
		R.keyPress(KeyEvent.VK_H);
		R.keyPress(KeyEvent.VK_A);
		R.keyPress(KeyEvent.VK_R);
		R.keyPress(KeyEvent.VK_A);
		R.keyPress(KeyEvent.VK_T);
		R.keyPress(KeyEvent.VK_H);
		R.keyPress(KeyEvent.VK_0);
		R.keyPress(KeyEvent.VK_0);
		Thread.sleep(2000);

		R.mouseMove(1087, 428);
		R.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
		R.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);
		R.keyPress(KeyEvent.VK_K);
		R.keyPress(KeyEvent.VK_B);
		R.keyPress(KeyEvent.VK_H);
		R.keyPress(KeyEvent.VK_A);
		R.keyPress(KeyEvent.VK_R);
		R.keyPress(KeyEvent.VK_A);
		R.keyPress(KeyEvent.VK_T);
		R.keyPress(KeyEvent.VK_H);
		R.keyPress(KeyEvent.VK_0);
		R.keyPress(KeyEvent.VK_0);
		Thread.sleep(2000);
		R.mouseMove(1137, 474);
		R.mousePress(KeyEvent.BUTTON1_DOWN_MASK);
		R.mouseRelease(KeyEvent.BUTTON1_DOWN_MASK);

	}

}
