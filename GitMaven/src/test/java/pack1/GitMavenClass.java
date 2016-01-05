package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitMavenClass {

	@Test
	public void TestFireFox(){
	 
		System.setProperty("webdriver.chrome.driver", "C:/ECLIPSE_WORKSPACE/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	 
	driver.manage().window().maximize();
	 
	driver.get("http://www.facebook.com");
	 
	//driver.quit();
	 
	}
}
