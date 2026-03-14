package mvnCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo2Test {

	@Test
	public void sample2Test()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("Title:"+ driver.getTitle());
		driver.quit();
	}

}
