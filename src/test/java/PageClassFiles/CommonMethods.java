package PageClassFiles;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {
	
	WebDriver driver; 
	public CommonMethods(WebDriver driver)
	{  
		this.driver = driver; 
		} 
	
	
	public void waitTillVisibilityOfElement(WebElement element, int sec)
	{  
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));  
		wait.until(ExpectedConditions.visibilityOf(element)); 
		}

}
