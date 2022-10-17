/*Q11.  Write an automation script for filling all fields of the registration page. (http://demo.automationtesting.in/Register.html)

   a- Validate that Refresh button is disabled.
   b- Validate that your respective gender is selected or not.
   c- Validate that header of the registration page is Automation Demo Site. 
   d- Validate that title of the page is Register.
*/

package selAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\SeleniumClassroom\\learnselenium\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");

		// a-
		System.out.println("If refresh button is enabled then then it will print true otherwise false");
		System.out.println(driver.findElement(By.id("Button1")).isEnabled());

		// b-
		WebElement gender = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
		gender.click();
		System.out.println(gender.isSelected());

		// c-
		WebElement header = driver.findElement(By.cssSelector("div[class='col-sm-8 col-xs-8 col-md-8'] h1"));
		header.getText().compareToIgnoreCase("Automation Demo Site");
		System.out.println(header.getText());

		// d-
		driver.getTitle().compareTo("Register");
		System.out.println(driver.getTitle());
	}

}
