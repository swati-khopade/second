package PageClassFiles;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailLoginPage {
	
	WebDriver driver; 
	
	public GmailLoginPage(WebDriver driver) 
	{  
	this.driver = driver; 
	PageFactory.initElements(driver, this); 
	}   
	
	//WebElements by locators 
	@FindBy(id = "identifierId") 
	WebElement userNameField;   
	
	@FindBy(xpath = "//span[text()='Next']")  
	WebElement nextBtn;  
	
	@FindBy(name = "Passwd") 
	WebElement passwordField;  
	
	//Action Method to login to gmail  
	public void loginToGmail(String userName, String pass)
	{    
//		userNameField.sendKeys(userName); 
//		nextBtn.click();     
//		CommonMethods commObj = new CommonMethods(driver);  
//		commObj.waitTillVisibilityOfElement(passwordField, 10);    
//		passwordField.sendKeys(pass);  
//		nextBtn.click(); 
		
		

	}

	public void goTo() {
		// TODO Auto-generated method stub
		driver.get("https://myaccount.google.com/deleteaccount");
	}
}
