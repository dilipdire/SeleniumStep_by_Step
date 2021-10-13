package pageobjectmodel;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobjectmodel.SerarchChromeTest;

public class ChromeTest {

	static WebDriver driver=null;
	public static void main(String[] args) {
		testMain();

	}

	public static void testMain() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Automation_Step_by_Step\\SeleniumWebmanager\\drivers\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.google.co.in/");

		/*  SerarchChromeTest test = new SerarchChromeTest();
		 test.searchTextbox(driver).sendKeys("Dilip Kumar");
		 test.clickSearchButton(driver).sendKeys(Keys.RETURN);
		 */
		 SerarchChromeTest.searchTextbox(driver).sendKeys("Dilip Kumar");
		 SerarchChromeTest.clickSearchButton(driver).sendKeys(Keys.RETURN);
		
	}

}
