package deep.in;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdrivermanagerTest {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().browserVersion("94.0.4606.61").setup();
		WebDriver driver = new ChromeDriver();
		
		 driver.get("https://google.com");
		 driver.findElement(By.xpath(("//input[@class='gLFyf gsfi']"))).sendKeys("Dilip Kumar");
		
		 driver.findElement(By.xpath(("//input[@type='submit']"))).sendKeys(Keys.RETURN);
		 
		 //driver.get("https://automationstepbystep.com/");
		
	}

}
