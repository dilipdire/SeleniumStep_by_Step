package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchpageObjectModel {
	
	WebDriver driver = null;
	By searchTextBox = By.name("q");
	By clickOnSearchBtn = By.xpath(("//input[@class='gLFyf gsfi']"));

	
	public SearchpageObjectModel(WebDriver driver) {
		
		this.driver = driver;
	}
	public void getSearchText(String text)
	{
		driver.findElement(searchTextBox).sendKeys(text);
		//driver.findElement(By.xpath(("//input[@class='gLFyf gsfi']")));
	}
	public void getClickOnSearch()
	{
		driver.findElement(clickOnSearchBtn).sendKeys(Keys.RETURN);
	}
}
