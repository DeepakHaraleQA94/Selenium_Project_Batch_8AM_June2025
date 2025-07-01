package TestClasses;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePageValidation {

	@Test
	public void verifyHomePage() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puneripattern.com/");
		String getHomePageTitle = driver.getTitle();
		System.out.println(getHomePageTitle);
		
		if(getHomePageTitle.equals("Software Testing | Full Stack Development Training Hadapsar")) {
			System.out.println("TC Passed");
		}else
		{
			System.out.println("TC failed");
		}
		System.out.println("this is new file");
		
		driver.close();
		
		
	}
}
