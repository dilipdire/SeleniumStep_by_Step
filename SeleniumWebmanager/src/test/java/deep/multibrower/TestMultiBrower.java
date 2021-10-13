package deep.multibrower;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestMultiBrower {
	
	WebDriver driver = null;
	String project=System.getProperty("user.dir");
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName)
	{
		System.out.println("BrowserName :"+browserName);
		if(browserName.equalsIgnoreCase("chrome"))
		{
		
        System.setProperty("webdriver.chrome.driver",project+"\\drivers\\chromedriver\\chromedriver.exe");	
        
        driver = new ChromeDriver();
        
		}
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",project+"\\drivers\\ff\\geckodriver.exe");	
	        
	        driver = new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",project+"\\drivers\\ff\\geckodriver.exe");	
	        
	        driver = new InternetExplorerDriver();

		}
		
		
	}
	@Test
	public void test() throws InterruptedException
	{
		
		driver.get("https://www.google.com");
		Thread.sleep(4000);
	}
	@AfterTest
	public void downTers ()
	{
		driver.close();
		
		System.out.println("test completed successfully");
	}

}
