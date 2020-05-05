package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginRegisterPage {
	
public WebDriver driver;

public LoginRegisterPage(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

	By emailTB =By.xpath("//*[@id='email_create']");
	public WebElement getEmailTB()
	{
		return driver.findElement(emailTB);
	}
	
	By createAccBTN = By.xpath("//*[@id='SubmitCreate']");
	public WebElement createAccountBTN()
	{
		return driver.findElement(createAccBTN);
	}
	
	By SignInEmailTB = By.id("email");
	public WebElement signInEmail()
	{
		return driver.findElement(SignInEmailTB);
	}
	
	By SignInPassTB=By.id("passwd");	
	public WebElement signInPass()
	{
		return driver.findElement(SignInPassTB);
	}
	
	By SubmitLoginBTN = By.xpath("//button[@id='SubmitLogin']");
	public WebElement SubmitLogin()
	{
		return driver.findElement(SubmitLoginBTN);
	}
	

}
