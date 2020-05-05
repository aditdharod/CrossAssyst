package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPages {
	
	public WebDriver driver;
	
	public CheckoutPages(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By productTotal =By.xpath("//td[@class='cart_total']/span[@class='price']");
	public WebElement productTotal()
	{
		return driver.findElement(productTotal);
	}
	
	By totalProductPrice =By.xpath("//td[@id='total_product']");
	public WebElement totalProductPrice()
	{
		return driver.findElement(totalProductPrice);
	}
		
	By finalPrice = By.id("total_price_container");
	public WebElement finalPrice()
	{
		return driver.findElement(finalPrice);
	}
	
	By proceedCheckout =By.cssSelector(".standard-checkout");
	public WebElement proceedCheckout()
	{
		return driver.findElement(proceedCheckout);
	}
	
	By proceedAddress = By.xpath("//button[@name='processAddress']");
	public WebElement proceedAddress()
	{
		return driver.findElement(proceedAddress);
	}
	
	By tncCheckbox = By.xpath("//input[@id='cgv']");
	public WebElement TermsCond()
	{
		return driver.findElement(tncCheckbox);
	}
	
	By priceOrderConfirmPage =By.xpath("//div[@class='box']//span[@class='price']/strong");
	public WebElement priceAfterOrderPlaced()
	{
		return driver.findElement(priceOrderConfirmPage);
	}
	
	By proceedShipping = By.xpath("//button[@name='processCarrier']");
	public WebElement proceedShipping()
	{
		return driver.findElement(proceedShipping);
	}
	
	By priceBeforeOrderPlace = By.cssSelector("#total_price");
	public WebElement priceBeforeOrderPlace()
	{
		return driver.findElement(priceBeforeOrderPlace);
	}
	
	By payByBankOption = By.cssSelector(".bankwire");
	public WebElement payByBankOption()
	{
		return driver.findElement(payByBankOption);
	}
	
	By orderReviewSummaryPrice = By.xpath("//*[@id='amount']");
	public WebElement orderReviewSummaryPrice()
	{
		return driver.findElement(orderReviewSummaryPrice);
	}
	
	By placeOrderbutton = By.xpath("//button[@type='submit']//i");
	public WebElement placeOrderbutton()
	{
		return driver.findElement(placeOrderbutton);
	}

}
