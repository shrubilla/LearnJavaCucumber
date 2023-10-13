package stepDefinitions;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.FilterPage;
import utils.TestContextSetup;

public class EbayFilterVerificationStepDefinitiions {
	public WebDriver driver;
	
	TestContextSetup testContextSetup;	
	FilterPage filterPage;
	
	public EbayFilterVerificationStepDefinitiions(TestContextSetup testContextSetup)
	{
		
		this.testContextSetup=testContextSetup;
		this.filterPage= testContextSetup.pageObjectManagerEbay.getFilterPage();
	}
	
	
	//This step definiion includes all the implementation of scenario-1
	
	@Given("User launched Ebay website")
	public void user_launched_ebay_website() {
		
		
		//Verify user is on correct page
		String ActualTitle = filterPage.getTitleOfPage();
		Assert.assertTrue(ActualTitle.toLowerCase().contains("ebay".toLowerCase()));
		System.out.println("Launched");
	}
	
	
	@When("User navigate to Search by category")
	public void user_navigate_to_search_by_category() {
		
		filterPage.shopByCategory_clk();
		
		
	}
	
	
	@When("Selects Electronics > Cell Phones & accessories from left panel")
	public void selects_electronics_cell_phones_accessories_from_left_panel() {
		
		
		filterPage.cellPhoneAccess_clk();
		String ActualTitle = filterPage.getTitleOfPage();
		
		//Verify user is  selected Electronics 
		Assert.assertTrue(ActualTitle.toLowerCase().contains("accessories".toLowerCase()));
		
		filterPage.cellPhoneSmart_clk();
		
		//Verify user is  selected Cell Phones & accessories
		String ActualValue = "Cell Phones & Smartphones";
		Assert.assertTrue(ActualValue.toLowerCase().contains(filterPage.getsmartPhoneElement().toLowerCase()));
		
		
		
		
		
	}
	
	
	@When("From All filters apply filters like - Condition, Price and Item location")
	public void from_all_filters_apply_filters_like_condition_price_and_item_location() throws InterruptedException {
		
		
		filterPage.allFilters_clk();
		
		
         System.out.println("filter is clicked");
         
  		 filterPage.conditionFilter_clk();
         filterPage.checkBox_clk();  
         
         //Verify user is on filter page or not
         Assert.assertEquals(true, filterPage.filterSelection().isDisplayed());
         filterPage.priceFilter_clk();
         filterPage.minimumPrice_set("80");
         filterPage.maximumPrice_set("150");
         filterPage.itemLocationFilter_clk();
         filterPage.itemWorldRadio_clk();
         

		
	}
	
	
	@Then("The selected filter tags should be selected and applied")
	public void the_selected_filter_tags_should_be_selected_and_applied() {
		
		String actualAppliedFilter= filterPage.filterSelection().getText();
        System.out.println("After filter selection"+actualAppliedFilter);
        //Verify All 3 types of filter is applied or not
        Assert.assertTrue(actualAppliedFilter.toLowerCase().contains("(3) Filter(s) selected".toLowerCase()));
        filterPage.filterApply_clk();
        Assert.assertTrue(filterPage.filterTxtVerification().contains("Cell Phones & Smartphones"));
	    //Verify applied filter in the 
		filterPage.close();
		
	}

	
}
