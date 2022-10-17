//Q6.  Write a script to get the url of the "Contact Us' page.

package selAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumClassroom\\learnselenium\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.tothenew.com/contact-us");
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
