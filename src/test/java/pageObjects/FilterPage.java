package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FilterPage {
	
		public WebDriver driver;

		public FilterPage(WebDriver driver)
		{
			this.driver = driver;
			
		}
		
	
	
	private By shopByCategory = By.xpath("//button[contains(text(),'Shop by category')]");
	private By cellPhoneAccess =By.partialLinkText("Cell phones & accessories");
	private By cellPhoneSmart= By.partialLinkText("Cell Phones & Smartphones");
	private By allFilters= By.xpath("//ul[@class='brm__list']//button[text()='All Filters']");
    private By conditionFilter= By.xpath("//div[@id='c3-mainPanel-condition']");
	private By checkBox = By.cssSelector("#c3-subPanel-LH_ItemCondition_New .checkbox");
	private By priceFilter = By.cssSelector("div#c3-mainPanel-price");
	private By minimumPrice =By.xpath("//div/input[contains(@class,'x-textrange__input--from')]");
	private By maximumPrice = By.xpath("//input[@aria-label='Maximum Value, US Dollar']");
	private By itemLocationFilter = By.cssSelector("div#c3-mainPanel-location");
	private By itemWorldRadio= By.xpath("//input[@value='Worldwide']//parent::span[contains(@class,'radio field__control')]");
	private By filterApply = By.xpath("//button[text()='Apply']");
	private By smartPhonetxt = By.xpath("//span[contains(text(),'Cell Phones & Smartphones')]");
	private By filtertxt = By.cssSelector(".x-tray__count");
	private By filterVerification = By.xpath("//span[contains(@class,'b-pageheader')]");
    
 
	public String getTitleOfPage()
	{
		return driver.getTitle();
	}
    public void shopByCategory_clk()
	{
    	driver.findElement(shopByCategory).click();
	}
    public void cellPhoneAccess_clk()
	{
		driver.findElement(cellPhoneAccess).click();
	}
    
    public void cellPhoneSmart_clk()
	{
		driver.findElement(cellPhoneSmart).click();
	}
    
    public String getsmartPhoneElement()
	{
		String smartPhoneEle = driver.findElement(smartPhonetxt).getText();
		//System.out.println("smartPhoneEle "+smartPhoneEle );
		return smartPhoneEle ;
	}
    
    public void allFilters_clk()
   	{
   		driver.findElement(allFilters).click();
   	}
    
    public void conditionFilter_clk() throws InterruptedException
    
   	{ 
    	 Thread.sleep(3000);
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("window.scrollBy(0,300)");
		 System.out.println("scrolled");
    	 Actions action = new Actions(driver); 
 		 WebElement conditionbtn = driver.findElement(conditionFilter);
 		 action.scrollToElement(conditionbtn).perform();
 		 conditionbtn.click();
   	}
    
    public WebElement filterSelection() 
   	{
    	 WebElement filterCount=driver.findElement(filtertxt);
    	 System.out.println(filterCount.getText());
    	 return filterCount;
   }
    
    public void checkBox_clk() throws InterruptedException
   	{
  		Thread.sleep(3000);
  		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
  		WebElement check=driver.findElement(checkBox);
  		//driver.G
        wait.until(ExpectedConditions.visibilityOf(check));
   		check.click();
   	}
    public void priceFilter_clk()
   	{ 
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    	WebElement priceF=driver.findElement(priceFilter);
    	 wait.until(ExpectedConditions.visibilityOf(priceF));
         //action.moveToElement(priceFilter).build().perform();
    	 priceF.click();
   	}
    
    public WebElement minimumPriceEle()
    {
    	WebElement minimumPriceEl =driver.findElement(minimumPrice);
    	return minimumPriceEl;
    }
    
    public void minimumPrice_set(String min)
	{
    	
 
    	
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(minimumPrice))).click();
		driver.findElement(minimumPrice).sendKeys(min);
	}
    
    public void maximumPrice_set(String price)
	{
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
    	wait.until(ExpectedConditions.visibilityOf(driver.findElement(maximumPrice)));
		driver.findElement(maximumPrice).sendKeys(price);
	}
    
    public void itemLocationFilter_clk() throws InterruptedException
   	{
    	Thread.sleep(3000);
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(itemLocationFilter)));
   		driver.findElement(itemLocationFilter).click();
   	}
    public void itemWorldRadio_clk() throws InterruptedException
   	{
    	Thread.sleep(3000);
    	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(itemWorldRadio)));
   		driver.findElement(itemWorldRadio).click();
   	}
    public void filterApply_clk()
   	{
   		driver.findElement(filterApply).click();
   	}
    
    public String filterTxtVerification()
    {
   WebElement filterText =   driver.findElement(filterVerification);
   System.out.println("Final text"+filterText.getText());
    	
    	return filterText.getText();
    	
    }
    
    public void close()
   	{
   		driver.quit();
   	}
    
    

}
