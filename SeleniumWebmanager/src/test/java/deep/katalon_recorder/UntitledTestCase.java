package deep.katalon_recorder;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UntitledTestCase {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	  
	  String project = System.getProperty("user.dir");
		System.out.println("project path : "+project);
		System.setProperty("webdriver.chrome.driver",project+ "\\drivers\\chromedriver\\chromedriver.exe");	
	  
		driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    // ERROR: Caught exception [unknown command []]
    // ERROR: Caught exception [unknown command []]
    driver.get("https://www.geeksforgeeks.org/");
    driver.findElement(By.linkText("Sign In")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Contribute a better translation'])[1]/following::span[2]")).click();
    driver.findElement(By.linkText("Sign In")).click();
    driver.findElement(By.id("luser")).click();
    driver.findElement(By.id("luser")).clear();
    driver.findElement(By.id("luser")).sendKeys("dilipkumark242@gmail.com");
    driver.findElement(By.id("password")).click();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys("1@Dilipkumar");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("Dilip kumar");
    driver.findElement(By.id("phone")).clear();
    driver.findElement(By.id("phone")).sendKeys("9919232134");
    new Select(driver.findElement(By.name("stateid"))).selectByVisibleText("Karnataka");
    driver.findElement(By.id("city")).clear();
    driver.findElement(By.id("city")).sendKeys("Bangalore");
    driver.findElement(By.name("gender")).click();
    new Select(driver.findElement(By.name("gender"))).selectByVisibleText("Male");
    driver.findElement(By.name("hq_details")).click();
    new Select(driver.findElement(By.name("hq_details"))).selectByVisibleText("MCA");
    driver.findElement(By.id("graduation_year")).click();
    driver.findElement(By.id("graduation_year")).clear();
    driver.findElement(By.id("graduation_year")).sendKeys("2011");
    driver.findElement(By.id("work_experience")).click();
    driver.findElement(By.id("work_experience")).clear();
    driver.findElement(By.id("work_experience")).sendKeys("4");
    driver.findElement(By.xpath("//button[@type='submit']")).click();
  }

  @AfterClass()
  public void tearDown() throws Exception {
    driver.quit();
  }
}