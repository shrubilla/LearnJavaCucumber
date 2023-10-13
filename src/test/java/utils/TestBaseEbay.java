package utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseEbay {
	
public WebDriver driver;
	
	public WebDriver WebDriverManager()
	{
		
		if(driver==null)
		{
		//System.setProperty("webdriver.chrome.driver","/Users/shrushrucomp/Documents/chromedriver-mac-arm64/chromedriver");
	    WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ebay.com");
		}
		return driver;
		
		

}
	
	
	
	
}