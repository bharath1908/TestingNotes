package inheritance;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassB extends ClassA {

	public static void main(String[] args) throws Exception {

		ClassB C = new ClassB();
		C.browser_launch();
		C.signin();

	}

}
