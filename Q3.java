//Write a script to search the “To The New” string in google.

package selAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3 {

	public static void main(String[] args) {

		String org = "To The New";

		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumClassroom\\learnselenium\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement text = driver.findElement(By.xpath("//input[@title=\"Search\"]"));
		text.sendKeys(org);
		text.sendKeys(Keys.ENTER);
		driver.close();
	}
}
