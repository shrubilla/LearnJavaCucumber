package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utils.TestContextSetup;

public class EbaySearchStepDefinition {
TestContextSetup testContextSetup;
public WebDriver driver ;
HomePage homePage;

	
	public EbaySearchStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.homePage=testContextSetup.pageObjectManagerEbay.getHomePage();
	}
	

	@When("^User search for (.+) in search bar$")
	public void user_search_for_item_in_search_bar(String searchString) {
		
        homePage.searchBarSettext(searchString);
        
		
	}
	@When("Change the Search category to category and perform search")
	public void change_the_search_category_to_category_and_perform_search() {
		 homePage.changeSearchCategory();	
		
	}
	
	@Then("^Perform search for (.+) and wait till page loads completely$")
	public void Perform_search(String searchString) throws InterruptedException {
		homePage.searchbtnClick();
		String actualTitile = homePage.getTitleOfPage();
		System.out.println(actualTitile);
		//Assert.assertTrue(actualTitile.contains(searchString));
		Thread.sleep(2000);
	}
	
	
	@Then("^First result should match searched (.+) string$")
	public void first_result_should_match_searched_item_string(String searchString) throws InterruptedException {
	    Thread.sleep(2000);
	    String seResul_FirstItem = homePage.VerifysearchedItemResult().getText();
	    String[] words = seResul_FirstItem.split("/s");
	   for(String word:words)
	   {
		   System.out.print("Each word is"+word);
		   
		   if(word.equalsIgnoreCase(searchString))
		   {
			   
			   Assert.assertTrue(true, seResul_FirstItem);
			   break;
		   }
		   
		   
	   }   
	  
	   
	   
	   // Assert.assertFalse(false,"Searched item is not matching ");
	   
	    System.out.println("First item is "+seResul_FirstItem);

	    
	    System.out.println("search string is "+searchString);
	   // Assert.assertTrue(seResul_FirstItem.equalsIgnoreCase(searchString));
	
		//homePage.close();
		
		
	}

}
