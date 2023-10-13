package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManagerEbay {
	
	public FilterPage filterPage;
	public HomePage homePage;
	public LoginPage loginPage;
	public WebDriver driver;
	
	
	public PageObjectManagerEbay(WebDriver driver) {
		
		this.driver = driver;
	}
		
	
	public FilterPage getFilterPage()
	{
	
	 filterPage= new FilterPage(driver);
	 return filterPage;
	}
	
	public HomePage getHomePage()
	{
		homePage=new HomePage(driver);
				return homePage;
	}
	
	public LoginPage getLoginPage()
	{
		 loginPage =new LoginPage(driver);
		 return loginPage;
	}

}



