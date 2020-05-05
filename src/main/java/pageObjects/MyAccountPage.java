package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

public WebDriver driver;
	
	
	public MyAccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By MyOrders=By.xpath("//a[@title='Orders']");
	public WebElement myOrders()
	{
		return driver.findElement(MyOrders);
	}
	
	By myAccount =By.className("account");
	public WebElement myAccount()
	{
		return driver.findElement(myAccount);
	}
	
	By orderPricemyAccount=By.xpath("//tr[@class='first_item ']//td[@class='history_price']/span");
	public WebElement orderPricemyAccount()
	{
		return driver.findElement(orderPricemyAccount);
	}
}
