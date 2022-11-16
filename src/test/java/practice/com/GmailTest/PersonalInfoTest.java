package practice.com.GmailTest;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageClassFiles.GmailHomePage;
import PageClassFiles.GmailLoginPage;
import PageClassFiles.PersonalInfoPage;



public class PersonalInfoTest extends BaseTest  { 

	@Test(dataProvider="getDataForBasicInfo")
	public void validatebasicInfo(HashMap<String,String> input)  {
		
		
//           String expectedName = "SWATI KHOPADE";
//           String expectedBirthDate = "January 29, 1999";
//           String expectedGender = "Female";
//           
//		   String emailID = "swatikhopade1999@gmail.com"; 
//		   String password = "swati2999"; 
		   
		 //Create Object of GmailLoginPage class and call method to login to gmail application
		   GmailLoginPage gmailLogin = new GmailLoginPage(driver);
		   gmailLogin.loginToGmail(input.get("username"), input.get("password")); 
		 
		 //Create Object of GmailHomePage class and call method to check if login success or not
		   GmailHomePage gmailHome = new GmailHomePage(driver);
		   boolean res = gmailHome.isLoginSuccess();
		
		   if(res) {   
			   System.out.println("Login to Gmail is Successfull!!"); 
			   }
		   else {   
			   Assert.assertTrue(false, "Login to Gmail Failed!!");  
			   }         
		   
		
		
		//click personalinfo page
		   gmailHome.clickPersonalInfo();
		
		//perform validations on basic info
		   
		   PersonalInfoPage personalInfo = new  PersonalInfoPage(driver); 
		   res= personalInfo.validateName(input.get("name"));
		
		   if(res) {   
			   System.out.println("name in basic info is as expected"); 
			   }
		   else {   
			   Assert.assertTrue(false, "basic info validation Failed!!");  
			   }
		   
		   
		   res= personalInfo.validateBirthDate(input.get("DOB"));
			
		   if(res) {   
			   System.out.println("BirthDate in basic info is as expected"); 
			   }
		   else {   
			   Assert.assertTrue(false, "basic info validation Failed!!");  
			   }
		   
		   
		   
		   res= personalInfo.validateGender(input.get("gender"));
					
				   if(res) {   
					   System.out.println("Gender in basic info is as expected"); 
					   }
				   else {   
					   Assert.assertTrue(false, "basic info validation Failed!!"); 
					   }
			}
	
	
	   @DataProvider
	   public Object[][] getDataForBasicInfo() {
		
		
//		Object[][] data= new Object[1][5];
//		  
//		data[0][0] = "swatikhopade1999@gmail.com";
//		data[0][1] = "swati2999";
//		data[0][2] = "SWATI KHOPADE";
//		data[0][3] = "January 29, 1999";
//		data[0][4] = "Female";
//		
//		return data;
		   
		   
//		   create object of HashMap
		
		HashMap<String,String> map=new HashMap<String,String>();
		
		map.put("username", "swatikhopade1999@gmail.com");
		map.put("password", "swati2999");
		map.put("name", "SWATI KHOPADE");
		map.put("DOB", "January 29, 1999");
		map.put("gender", "Female");
		
		return new Object[][] {{map}};
		
		
		   
	   }
	
	
	
	
 }
 
 


