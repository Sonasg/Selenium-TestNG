package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Parallel_Execution {

	@Test
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver",".\\libs\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.quit();
	}
	
	
	@Test
	public void test2()
	{
		System.setProperty("webdriver.ie.driver",".\\libs\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com/");
		driver.quit();
	}
}
