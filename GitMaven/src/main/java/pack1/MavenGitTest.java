package pack1;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.*;
import pack1.DataPoolUtil;

public class MavenGitTest {

	WebDriver driver = new FirefoxDriver();
	 DataPoolUtil dp=new DataPoolUtil();

	//WebDriver driver;
		
		   @BeforeTest
		   public void app_launch() throws Exception{
			
			   
			   //System.setProperty("webdriver.ie.driver","C://ECLIPSE_WORKSPACE//IEDriverServer.exe");
			  // driver=new InternetExplorerDriver();
			   
			   System.out.println("The WebDriver IS SHOWN HERE::"+driver);
		  
		    driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		    
		   
        	ResultSet rs_getRegistrationData=dp.getExcelData_AppLaunch("TC01");
        	 
	           String app_url="";
	           
	           while (rs_getRegistrationData.next()) 
	           {
	        	   app_url=rs_getRegistrationData.getString("AppURL");
	           }
	        	  
		    //Launch website
		    driver.navigate().to(app_url);
		  	
		    //Maximize the browser
		    driver.manage().window().maximize();
		    
		    Reporter.log("Application Lauched Successfully | ");
		    
		   }
		   
		   @Test(priority=1)
		   public void app_signin() throws Exception{
			
				ResultSet rs_getRegistrationData=dp.getExcelData_AppSignIn("TC01");
				
				  String app_sign_text="";
		           
		           while (rs_getRegistrationData.next()) 
		           {
		        	   app_sign_text=rs_getRegistrationData.getString("SignInText");
		           }
		           
			   //Signin into the Cloud Directory
		    driver.findElement(By.partialLinkText(app_sign_text)).click();
		    
		    Reporter.log("Sign-In Operation Into the Cloud Directory of the Application Successfully Done | ");
		    
		   }
		   
		   @Test(priority=2)
		   public void app_login() throws Exception{
		    
			   ResultSet rs_getRegistrationData=dp.getExcelData_AppLoginIn("TC01");
			   
				  String uname="";
				  String pwd="";
		          String refkey_xpath=""; 
				  
		           while (rs_getRegistrationData.next()) 
		           {
		        	   uname=rs_getRegistrationData.getString("UserName");
		        	   pwd=rs_getRegistrationData.getString("Password");
		        	   refkey_xpath=rs_getRegistrationData.getString("RefKey_Xpath");
		           }
			   
		           HashMap hm_xpaths_applogin=dp.getExcelData_Xpaths(refkey_xpath);
		           
		           
			   
		    driver.findElement(By.xpath((String)hm_xpaths_applogin.get("Uname"))).click();
		    driver.findElement(By.xpath((String)hm_xpaths_applogin.get("Uname"))).sendKeys(uname);
		    
		    driver.findElement(By.xpath((String)hm_xpaths_applogin.get("Pwd"))).click();
		    driver.findElement(By.xpath((String)hm_xpaths_applogin.get("Pwd"))).sendKeys(pwd);
		    
		    
		    driver.findElement(By.xpath((String)hm_xpaths_applogin.get("Submit"))).click();
		    
		    Reporter.log("User Logged Into the Application Successfully | ");
		    
		   }
		   
		   @Test(priority=3)
		   public void app_authorizetoconsent() throws Exception{
			   

			   ResultSet rs_getRegistrationData=dp.getExcelData_AppAuthorization("TC01");
			   
				String refkey_xpath=""; 
				  
		           while (rs_getRegistrationData.next()) 
		           {
		        	 refkey_xpath=rs_getRegistrationData.getString("RefKey_Xpath");
		           }
			   
		           HashMap hm_xpaths_appauthorization=dp.getExcelData_Xpaths(refkey_xpath);
		           
		           
		    driver.findElement(By.xpath((String)hm_xpaths_appauthorization.get("Autho"))).click();
		    
		    Thread.sleep(3000);
		    
		    Reporter.log("Application Authorization Successfull | ");
		   }
		   
		   @Test(priority=4)
		   public void app_homepage() throws Exception{
			   
			   Reporter.log("Into the Application Home Page | ");
			   
			   ResultSet rs_getRegistrationData=dp.getExcelData_AppHomePage("TC01");
			   
				String refkey_xpath=""; 
				String refkey_ver=""; 
				  
		           while (rs_getRegistrationData.next()) 
		           {
		        	 refkey_xpath=rs_getRegistrationData.getString("RefKey_Xpath");
		        	 refkey_ver=rs_getRegistrationData.getString("RefKey_Verification");
		           }
			   
		           HashMap hm_xpaths_apphome=dp.getExcelData_Xpaths(refkey_xpath);
		           
		           HashMap hm_verficifations=dp.getExcelData_Verifications(refkey_ver);
		        		  
			   
		    String actual_result = driver.findElement(By.xpath((String)hm_xpaths_apphome.get("WelcomeMsg"))).getText();
		 
		    String exp_result=(String)hm_verficifations.get("WelcomeMsg");
		  
		    
		   if(exp_result.contains(actual_result))
			   
		   {
			   
			   
				   Reporter.log("VERIFICATION PASSED :: WELCOME MESSAGE IS SUCCESSFULL | ");
		   }
		   
		   else
		   {
			 
			   Reporter.log("VERIFICATION FAILED :: WELCOME MESSAGE IS NOT SUCCESSFULL | ");
		   }
		    
		   
		    
		   }
		   
}
