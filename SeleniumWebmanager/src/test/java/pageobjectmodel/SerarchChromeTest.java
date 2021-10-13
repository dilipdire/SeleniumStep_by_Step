package pageobjectmodel;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SerarchChromeTest {
	
	private static WebElement element;
	
	public static WebElement searchTextbox(WebDriver driver)
	{
		element=driver.findElement(By.name("q"));
		return element;
		
	}
	public static WebElement clickSearchButton(WebDriver driver)
	{
		element =driver.findElement(By.name("btnK"));
		
		return element;
		
	}
	

}
