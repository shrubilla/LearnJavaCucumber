package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utils.TestContextSetup;

public class LoginStepDefinition {
	TestContextSetup testContextSetup;
	LoginPage loginPage;
	public WebDriver driver;
	
	public LoginStepDefinition(TestContextSetup testContextSetup)
	{
		this.testContextSetup=testContextSetup;
		this.loginPage=testContextSetup.pageObjectManagerEbay.getLoginPage();
	}
	

	//Given( User launched Ebay website)
	
	@When("Navigate to sign in page")
	public void Navigate_to_sign_in_page()
	{
		loginPage.signinLinkClick();
		
	}
	
	
	@When("^Enters valid username (.+)$") 
	public void Enters_valid_username(String userName)
	{
		loginPage.setUserName(userName);
		
	}
	
	@When("^Enters valid password (.+)$") 
	public void Enters_valid_password(String password)
	{
		loginPage.setPasswordTxt(password);
	}
	
	
	@Then("User should login sucessfully")
	public void User_should_login_sucessfully(String string)
	{
		System.out.println(string);
		
	}

	

	

	
	

}
