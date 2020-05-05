package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CategoryPage {
	
	public WebDriver driver;
	
	public CategoryPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By productImage =By.xpath("//img[@title='Printed Dress']");
	public WebElement productImg()
	{
		return driver.findElement(productImage);
	}
	
	
	By quickview = By.xpath("//a[@class='quick-view']");
	public WebElement quickView()
	{
		return driver.findElement(quickview);
	}

}
