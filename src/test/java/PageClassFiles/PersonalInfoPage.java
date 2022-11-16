package PageClassFiles;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Return;

public class PersonalInfoPage {
	
	WebDriver driver; 
	
	public PersonalInfoPage(WebDriver driver) 
	{  
	this.driver = driver; 
	PageFactory.initElements(driver, this); 
	}   
	
	//WebElements by locators 
	
	@FindBy(xpath = "//a[contains(@aria-label,'Name')]/div/div/div/div[2]/div/div[@class='bJCr1d']")
	WebElement nameField;
	
	@FindBy(xpath = "//a[contains(@aria-label,'Birthday')]/div/div/div/div[2]/div/div[@class='bJCr1d']")
	WebElement birthDateField;
	
	@FindBy(xpath = "//a[contains(@aria-label,'Gender')]/div/div/div/div[2]/div/div[@class='bJCr1d']")
	WebElement genderField;
	
	
	
	//Action Methods
//	1:-method for validate name
	
	public  boolean validateName(String expectedName) {
		
		CommonMethods commObj = new CommonMethods(driver);  
		commObj.waitTillVisibilityOfElement(nameField, 10);
		
	if(nameField.getText().equalsIgnoreCase(expectedName)) {
		return true;
		}
	return false;	
   }

	
//	2:-method for validate birthdate
	
	public  boolean validateBirthDate(String expectedBirthDate) {
		
		CommonMethods commObj = new CommonMethods(driver);  
		commObj.waitTillVisibilityOfElement(birthDateField, 10);
	if(birthDateField.getText().equalsIgnoreCase(expectedBirthDate)) {
		return true;
		}
	return false;	
   }
	
	
//	3:-method for validate gender
	
	public  boolean validateGender(String expectedGender) {
	if(genderField.getText().equalsIgnoreCase(expectedGender)) {
		return true;
		}
	return false;	
   }
	
	
}
