package mvnCommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo3Test {

	@Test
	public void sample3Test()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println("Title:"+ driver.getTitle());
		driver.quit();
	}

}

//cd project location
//mvn validate : check project structure
//mvn compile : check integration & compilation issues
//mvn test : used to execute all test cases