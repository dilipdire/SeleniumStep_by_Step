package test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjectmodel.SearchpageObjectModel;

public class TestSearch {
 private static WebDriver driver =null ;
	
 @BeforeTest
	public static void setUpTest()
	{
		String project =System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", project+"\\drivers\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
   @Test
	public void searshTest()
	{
		 driver.get("https://www.google.co.in/");
		 SearchpageObjectModel googlepage = new SearchpageObjectModel(driver);
		 driver.get("https://www.google.co.in/");

		 googlepage.getSearchText("DilipKumar");
		 googlepage.getClickOnSearch();
	}
   @AfterTest
	public void tearDownTest()
	{
		driver.close();
		
		System.out.println("Test Complete Successfully");
	}
}
