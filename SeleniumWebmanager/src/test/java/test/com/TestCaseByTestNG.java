package test.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjectmodel.SearchpageObjectModel;

public class TestCaseByTestNG {
 private static WebDriver driver =null ;
	public static void main(String[] args) {
		googleSearchText();
		
	}
	
	public static void googleSearchText()
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation_Step_by_Step\\SeleniumWebmanager\\drivers\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.google.co.in/");
		 SearchpageObjectModel googlepage = new SearchpageObjectModel(driver);
		 driver.get("https://www.google.co.in/");

		 googlepage.getSearchText("DilipKumar");
		 googlepage.getClickOnSearch();
	}
}
