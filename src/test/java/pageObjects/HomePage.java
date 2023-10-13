package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	public WebDriver driver;
	
	public HomePage (WebDriver driver)
	{
		this.driver = driver ;
	}
	
	private By searchBar = By.xpath("//input[@placeholder='Search for anything']");
	private By categorySelection=By.cssSelector("select.gh-sb");
	private By btnSearch=By.xpath("//input[@id='gh-btn' or @value='Search']");
	private By SearchResults =By.xpath("//span[@class='BOLD' and contains(text(),'Apple MacBook')]");
	
	
	public String getTitleOfPage()
	{
		return driver.getTitle();
	}
	
	public void searchBarSettext(String searchItem)
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        //wait.until(ExpectedConditions.elementToBeVisible(driver.findElement(searchBar)));
        wait.until(ExpectedConditions.presenceOfElementLocated(searchBar));
		driver.findElement(searchBar).sendKeys(searchItem);
		System.out.println("Macbook enterted");
	}
	
	public void changeSearchCategory()
	{
		WebElement categoryType = driver.findElement(categorySelection);
		Select select = new Select(categoryType);
		select.selectByVisibleText("Computers/Tablets & Networking");
		System.out.println("Selection is done");
		
	}
	
	public void searchbtnClick()
	{
	
		driver.findElement(btnSearch).click();
		System.out.println("clicked on search");
		
		
	}
	
	public WebElement VerifysearchedItemResult()
	{
		WebElement SearchResultItem = driver.findElement(SearchResults);
		//System.out.println(SearchResultItem);
		return SearchResultItem;
	}
	
	

	

}
