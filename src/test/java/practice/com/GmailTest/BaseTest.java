package practice.com.GmailTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import PageClassFiles.GmailLoginPage;

public class BaseTest {
	
	private static final boolean True = false;
	public WebDriver driver;
	
	public WebDriver initializeDriver() throws IOException {
		
		Properties prop=new Properties();
		
		FileInputStream inpstr=new FileInputStream("F:\\PRATIKSHA KHOPADE\\JAVA\\GmailTest\\src\\test\\java\\practice\\com\\GmailTest\\GlobalData.properties"); 
	
        prop.load(inpstr);
        
        String browserName=prop.getProperty("browser");
        
        if(browserName.equalsIgnoreCase("chrome")) {
        	
        	//Browser Driver
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratiksha Khopade\\Downloads\\chromedriver.exe");
    		
    		
    		 driver = new ChromeDriver();
    		 
        }
        else if(browserName.equalsIgnoreCase("firefox")) {
        	
//        	//Browser Driver
//    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratiksha Khopade\\Downloads\\chromedriver.exe");
//    		
//    		
//    		 driver = new firefoxDriver();
	
	}
       else if(browserName.equalsIgnoreCase("edge")) {
        	
//        	//Browser Driver
//    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratiksha Khopade\\Downloads\\chromedriver.exe");
//    		
//    		
//    		 driver = new edgeDriver();
       }
        
//        Maximize
        
        driver.manage().window().maximize();
        
//        add implicit wait
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver;
	}
	
	@BeforeTest(alwaysRun = True)
	public WebDriver launchApplication() throws IOException {
		WebDriver driver = initializeDriver();
		
		GmailLoginPage gmailLogin = new GmailLoginPage(driver);
		gmailLogin.goTo();
		return driver;
	}
		@AfterTest(alwaysRun = true)
		public void closeBroswer()
		{
			driver.close();
		}
		
	}



	

