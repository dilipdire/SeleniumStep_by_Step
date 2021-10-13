package test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportTest {
	static ExtentReports report;
	static ExtentTest test;
	static WebDriver driver;
	@BeforeClass
	public static void startTest()
	{
		
		report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
	    test=report.startTest("ExtentReportTest");
	}
	@Test
	public void extentReportTest()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Automation_Step_by_Step\\ExtentReport_Demo\\drivers\\chromedriver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://www.google.co.in");
	     
	     if(driver.getTitle().equals("Google"))
	     {
	    	 test.log(LogStatus.PASS, "Navigated to the specified URL");
	     }
	     else
	     {
	    	 test.log(LogStatus.FAIL, "Test Failed");
	     }
	     
	     
	
	}
	
	public void endTest()
	{
		report.endTest(test);
		report.flush();
		
	}
	
	
}
