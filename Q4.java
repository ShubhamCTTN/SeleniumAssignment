/*
 * Write a script to open http://www.tothenew.com/  and then navigate to the contact us page using  
	1) XPath 2) ID
 */

package selAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Q4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumClassroom\\learnselenium\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.tothenew.com/");

		driver.findElement(By.id("h-contact-us")).click();
	}

}
