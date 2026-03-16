package mvnCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4Test {
	public void sample4Test()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://orangehrm.com/");
		System.out.println("Title:"+ driver.getTitle());
		driver.quit();
	}
}
