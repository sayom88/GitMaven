package pack1;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.*;

public class GitMavenClass {

	WebDriver driver = new FirefoxDriver();


	//WebDriver driver;
		
		   @BeforeTest
		   public void launchapp(){
			// TODO Auto-generated method stub
			
			   //System.setProperty("webdriver.ie.driver","C://ECLIPSE_WORKSPACE//IEDriverServer.exe");
			  // driver=new InternetExplorerDriver();
			   
			   System.out.println("WebDriver is:"+driver);
		    //Puts an Implicit wait, Will wait for 10 seconds before throwing exception
		    
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		    
		    //Launch website
		    
		    driver.navigate().to("http://www.finnair.com/int/gb/");
		    
		    //Maximize the browser
		    driver.manage().window().maximize();
		    
		    Reporter.log("Application Lauched Successfully | ");
		    
		   }
		   
		   
}
