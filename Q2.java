//Q2. Write a script launch the IE browser and open https://www.google.com/ URL.

package selAssignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver",
				"D:\\SeleniumClassroom\\learnselenium\\src\\main\\resources\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.close();
	}

}
