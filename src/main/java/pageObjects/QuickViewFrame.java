package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QuickViewFrame {
	
	public WebDriver driver;
	
	public QuickViewFrame(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By quickViewFrame=By.className("fancybox-iframe");
	public WebElement qkviewframe()
	{
		return driver.findElement(quickViewFrame);
	}
	
	By addQtyBtn =By.cssSelector("a.btn:nth-child(4)");
	public WebElement addQtyBtn()
	{
		return driver.findElement(addQtyBtn);
	}
	
	By addToCartBTN =By.xpath("//*[@id='add_to_cart']");
	public WebElement addToCart()
	{
		return driver.findElement(addToCartBTN);
	}
	
	By CheckoutBtn=By.xpath("//a[@title='Proceed to checkout']");
	public WebElement checkOut()
	{
		return driver.findElement(CheckoutBtn);
	}

	

}
