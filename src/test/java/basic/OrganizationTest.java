package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrganizationTest {
	
	@Test
	public void CreateOrganizationTest()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://myntra.com");
	}
}