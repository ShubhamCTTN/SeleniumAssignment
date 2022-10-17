//Q1. Write a script to open the Firefox browser and open https://www.google.com/ URL.

package selAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver",
				"D:/SeleniumClassroom/learnselenium/src/main/resources/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
	}
}
