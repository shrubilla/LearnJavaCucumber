package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	 WebDriver driver;
	 
	 public LoginPage (WebDriver driver)
	 {
		 this.driver=driver;
	 }
	

	
private By signinLink = By.xpath("//span[contains(@class,'gh-ug-guest')]/a[text()='Sign in']");
private	By userNameTxt = By.xpath("//input[@id='userid']");
private	By continueBtn = By.id("#signin-continue-btn");
private	By passwordTxt = By.xpath("//input[@id='userid']");
private	By signIn  = By.xpath("//button[@id='sgnBt']");
private	By userVerification = By.xpath("//span[@id='gh-ug']/b");

	public void signinLinkClick()
     {
	  driver.findElement(signinLink).click();
    }

	
	public void setUserName(String userName)
	 {
	driver.findElement(userNameTxt).sendKeys(userName);
	 }
	
	public void continueBtnClick()
    {
   driver.findElement(continueBtn).click();
    }

	public void setPasswordTxt(String password)
	 {
	driver.findElement(passwordTxt).sendKeys(password);
	 }
	
	public void signInBtnClick()
    {
   driver.findElement(signIn).click();
    }
	public String getuserVerification()
    {
    String loggedInUser= driver.findElement(userVerification).getText();
	return loggedInUser;
   
    }
	
	



}
