package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
	
	By genderMale= By.id("id_gender1");
	public WebElement genderMale(){
		return driver.findElement(genderMale);
	}
	
	By cfname=By.id("customer_firstname");
	public WebElement customer_firstname()
	{
		return driver.findElement(cfname);
	}
	
	By clname= By.id("customer_lastname");
	public WebElement customer_lastname()
	{
		return driver.findElement(clname);
	}
	
	By pwd=By.id("passwd");
	public WebElement password()
	{
		return driver.findElement(pwd);
	}
	
	By daysDropdown=By.id("days");
	public WebElement days()
	{
		return driver.findElement(daysDropdown);
	}
	
	By monthsDropdown=By.id("months");
	public WebElement months()
	{
		return driver.findElement(monthsDropdown);
	}
	
	By yearsDropdown=By.id("years");
	public WebElement years()
	{
		return driver.findElement(yearsDropdown);
	}
	
	By fname=By.id("firstname");
	public WebElement firstname()
	{
		return driver.findElement(fname);
	}
	
	By lname=By.id("lastname");
	public WebElement lastname()
	{
		return driver.findElement(lname);
	}	
	
	By company=By.id("company");
	public WebElement company()
	{
		return driver.findElement(company);
	}
	
	By address1=By.id("address1");
	public WebElement address1()
	{
		return driver.findElement(address1);
	}
	
	By address2=By.id("address2");
	public WebElement address2()
	{
		return driver.findElement(address2);
	}
	
	By city=By.id("city");
	public WebElement city()
	{
		return driver.findElement(city);
	}
	
	By stateDropdown=By.id("id_state");
	public WebElement state()
	{
		return driver.findElement(stateDropdown);
	}
	
	By postcode=By.id("postcode");
	public WebElement postcode()
	{
		return driver.findElement(postcode);
	}
	
	
	By phoneNumber=By.id("phone_mobile");
	public WebElement phone()
	{
		return driver.findElement(phoneNumber);
	}
	
	By submitBTN = By.xpath("//*[@id='submitAccount']");
	public WebElement submitAcc()
	{
		return driver.findElement(submitBTN);
	}
	
	public WebDriver driver;
	public RegisterPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

}
