package pack1;

import java.sql.ResultSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WebApplication_Calculator {
	WebDriver driver = new FirefoxDriver();
	
	
	  @Test
	   public void app_launch() throws Exception{
		
		   
		   //System.setProperty("webdriver.ie.driver","C://ECLIPSE_WORKSPACE//IEDriverServer.exe");
		  // driver=new InternetExplorerDriver();
		   
		   System.out.println("The WebDriver IS SHOWN HERE::"+driver);
	  
	    driver.manage().timeouts().implicitlyWait(10000,TimeUnit.SECONDS);
	    
	   
   	
    //Launch website
    //driver.navigate().to();
  	
	//    C:\ECLIPSE_WORKSPACE\Java_Maven
	    
  driver.get("C:\\ECLIPSE_WORKSPACE\\Java_Maven\\Calculator1.html");
	   // driver.get("Calculator1.html");
    // https://swarnasetu-beta.mybluemix.net/
    //Maximize the browser
    driver.manage().window().maximize();
	  }
	  
}
