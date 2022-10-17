/*Q12. Write an automation script for filling FirstName, LastName & Email address field with 
the help of name locator. (http://demo.automationtesting.in/Register.html)
*/

package selAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q12 {

	public static void main(String[] args) {

		String firstName = "Shubham";
		String lastName = "Chaurasia";
		String email = "xyz@yahoo.in";

		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumClassroom\\learnselenium\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement fName = driver.findElement(By.cssSelector("input[placeholder=\"First Name\"]"));
		fName.sendKeys(firstName);

		WebElement lName = driver.findElement(By.cssSelector("input[placeholder=\"Last Name\"]"));
		lName.sendKeys(lastName);

		WebElement Mail = driver.findElement(By.cssSelector("input[type=\"Email\"]"));
		Mail.sendKeys(email);
		driver.close();
	}

}
