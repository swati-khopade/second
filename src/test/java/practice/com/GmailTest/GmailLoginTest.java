package practice.com.GmailTest;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageClassFiles.GmailHomePage;
import PageClassFiles.GmailLoginPage;



public class GmailLoginTest extends BaseTest  { 

	@Test(groups= {"positive"})
	public void loginPositiveTest() throws IOException  {
		
		driver = launchApplication();
		
		
		
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pratiksha Khopade\\Downloads\\chromedriver.exe");
//        
////	  Creating object of WebDriver
//		
//		WebDriver driver = new ChromeDriver();   
//		
//		//Maximize 
//	
//		driver.manage().window().maximize();   
//		
//		
//		//Add implicit wait 
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
//		
//		//Go to the website for mouse operations on button  
//		driver.get("https://myaccount.google.com/deleteaccount");  
		
		
		   String emailID = "swatikhopade1999@gmail.com"; 
		   String password = "swati2999"; 
		   
		 //Create Object of GmailLoginPage class and call method to login to gmail application
		   GmailLoginPage gmailLogin = new GmailLoginPage(driver);
		   gmailLogin.loginToGmail(emailID, password); 
		 
		 //Create Object of GmailHomePage class and call method to check if login success or not
		   GmailHomePage gmailHome = new GmailHomePage(driver);
		   boolean res = gmailHome.isLoginSuccess();
		
		   if(res) {   
			   System.out.println("Login to Gmail is Successfull!!"); 
			   }
		   else {   
			   Assert.assertTrue(false, "Login to Gmail Failed!!");  
			   }         
		   
	  
		
 }
 }
 
 


