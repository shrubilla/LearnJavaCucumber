package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManagerEbay;

public class TestContextSetup {
	
	public WebDriver driver;
	
	
	public PageObjectManagerEbay pageObjectManagerEbay;
	public TestBaseEbay testBaseEbay;
	public GenericUtils genericUtils;
	
	

	
	public TestContextSetup() throws IOException
	{
		testBaseEbay = new TestBaseEbay();
		genericUtils = new GenericUtils(testBaseEbay.WebDriverManager());
		pageObjectManagerEbay = new PageObjectManagerEbay(testBaseEbay.WebDriverManager());
		
		
	
		
		
		

	}


}
