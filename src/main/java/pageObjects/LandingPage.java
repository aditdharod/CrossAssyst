package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By signin =By.cssSelector(".login");
	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	
	By womenTopNav = By.xpath("//a[@title='Women']");
	public WebElement womenTopNav()
	{
		return driver.findElement(womenTopNav);
	}
	
	By casualDressCategory = By.linkText("Casual Dresses");	
	public WebElement casualDressCat()
	{
		return  driver.findElement(casualDressCategory);
	}
	

}
