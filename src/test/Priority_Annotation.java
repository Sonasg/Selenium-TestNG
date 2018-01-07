package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Priority_Annotation {

	public class Google_Search {

		WebDriver driver;
		
		@Test(priority=1)
		public void test1()
		{
			System.setProperty("webdriver.chrome.driver",".\\libs\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-maximized");
			driver = new ChromeDriver(options);
		}
		
		@Test(priority=2)
		public void test2()
		{
			driver.get("https://www.google.com/");
		}
		
		@Test(priority=3)
		public void test3()
		{
			driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		}
		
		@Test(priority=4)
		public void test4()
		{
			driver.quit();
		}
		
	}

}
