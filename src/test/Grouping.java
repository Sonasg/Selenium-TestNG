package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Grouping {

	WebDriver driver;
	
	@Test(groups={"Test1"})
	public void test_a()
	{
		System.setProperty("webdriver.chrome.driver",".\\libs\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
	}
	
	
	@Test(groups={"Test2"})
	public void test_b()
	{
		String str = driver.findElement(By.id("hplogo")).getAttribute("alt");
		if(str.equals(str))
		{
			System.out.println("Google page opened");
		}
		
		
	}
	
	@Test(groups={"Test1"})
	public void test_c()
	{

		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		driver.quit();
		
		
	}
	
}
