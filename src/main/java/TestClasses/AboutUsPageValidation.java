package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AboutUsPageValidation {

	
	@Test
	public void verifyHomePage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.puneripattern.com/");
		
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		driver.findElement(By.linkText("About Us")).click();
		
		Thread.sleep(3000);
		String getAboutPageTitle = driver.getTitle();
		System.out.println(getAboutPageTitle);
		
		if(getAboutPageTitle.equals("About Us | Puneri Pattern")) {
			System.out.println("TC Passed");
		}else
		{
			System.out.println("TC failed");
		}
		System.out.println("new code updated");
		
		driver.close();
		
		
	}
}
