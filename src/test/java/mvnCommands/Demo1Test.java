package mvnCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1Test {
	
	@Test
	public void sample1Test()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://leetcode.com/u/pathaksudeshna/");
		System.out.println("Title:"+ driver.getTitle());
		driver.quit();
		System.out.println("2nd Push from main branch");
		System.out.println("Made changes in main branch but want to display in master branch");
		System.out.println("This change is from Testing branch");
		System.out.println("This commit is from Selenium branch");
		System.out.println("Test Jenkins Build");
	}
}
