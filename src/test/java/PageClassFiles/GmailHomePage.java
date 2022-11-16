package PageClassFiles;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GmailHomePage {
	
	WebDriver driver; 
	public GmailHomePage(WebDriver driver)
	{  
		this.driver = driver;  
	PageFactory.initElements(driver, this); 
	}   
	
	//WebElements by locators 
	@FindBy(id = "sdgBod")
	List<WebElement> googleAccountLogo;  
	
	@FindBy(xpath = "//a[@href='personal-info']/div[@class='GiKO7c']")
	WebElement personalInfoLink;
	
	//Action Method to check if login success or not 
	public boolean isLoginSuccess()
	{ 
		if(googleAccountLogo.size() == 0)
		{  
			return false;  
			}
		else
		{   
			return true;   
			} 
		}
	
	 
	 public void clickPersonalInfo() {
		 personalInfoLink.click();
	 }
	 
	 
	   
	   } 


