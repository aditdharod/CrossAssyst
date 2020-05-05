package SeleniumLearning.CrossAssyst;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pageObjects.CategoryPage;
import pageObjects.CheckoutPages;
import pageObjects.LandingPage;
import pageObjects.LoginRegisterPage;
import pageObjects.MyAccountPage;
import pageObjects.QuickViewFrame;
import pageObjects.RegisterPage;

public class TestRegression extends base{
	
	@Test
	public void basePageNav() throws IOException
	{
		driver = initializeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
				
		//click on login link and register
		LandingPage lp= new LandingPage(driver);
		lp.getLogin().click();
		
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());	
		
		LoginRegisterPage lr=new LoginRegisterPage(driver);
		lr.getEmailTB().sendKeys(timeStamp+"@yopmail.com");
		lr.createAccountBTN().click();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.genderMale().click();
		rp.customer_firstname().sendKeys("sass");
		rp.customer_lastname().sendKeys("saaas");
		rp.password().sendKeys("password");
		
		Select d = new Select(rp.days());
		d.selectByValue("15");
		
		Select m = new Select(rp.months());
		m.selectByVisibleText("August ");
		
		Select y = new Select(rp.years());
		y.selectByIndex(15);
		
		//rp.firstname().clear();
		//rp.firstname().sendKeys("sass");
		
		//rp.lastname().clear();
		//rp.firstname().sendKeys("saaas");
		
		rp.company().sendKeys("Company");
		rp.address1().sendKeys(" Street Name PO Company");
		rp.address2().sendKeys("Apt 1 Suite 201 9th Floor");
		rp.city().sendKeys("New York");
		
		Select s = new Select(rp.state());
		s.selectByVisibleText("New York");
		
		rp.postcode().sendKeys("10024");
		rp.phone().sendKeys("9170000010");
		rp.submitAcc().click();
		
		Actions a = new Actions(driver);
		
		a.moveToElement(lp.womenTopNav()).build().perform();
		a.moveToElement(lp.casualDressCat()).click().build().perform();
		
		CategoryPage cp = new CategoryPage(driver);
		
		a.moveToElement(cp.productImg()).build().perform();
		a.moveToElement(cp.quickView()).click().build().perform();
		
		QuickViewFrame qk = new QuickViewFrame(driver);
		driver.switchTo().frame(qk.qkviewframe());
		qk.addQtyBtn().click();
		qk.addToCart().click();
		driver.switchTo().defaultContent();
		qk.checkOut().click();
		
		CheckoutPages chk = new CheckoutPages(driver);
		
		//verifying the price now
		Assert.assertEquals(chk.productTotal().getText(), chk.totalProductPrice().getText());
		
		chk.proceedCheckout().click();
		
		lr.signInEmail().sendKeys("akshay2@yopmail.com");
		lr.signInPass().sendKeys("password");
		lr.SubmitLogin().click();
		
		chk.proceedAddress().click();
		chk.TermsCond().click();
		chk.proceedShipping().click();
		chk.priceBeforeOrderPlace().getText();
		System.out.println(chk.priceBeforeOrderPlace().getText());
		chk.payByBankOption().click();
		System.out.println(chk.orderReviewSummaryPrice().getText());
		
		Assert.assertEquals(chk.priceBeforeOrderPlace().getText(), chk.orderReviewSummaryPrice().getText());
		chk.placeOrderbutton().click();
		
		Assert.assertEquals(chk.priceAfterOrderPlaced(), chk.priceBeforeOrderPlace());
		
		MyAccountPage my = new MyAccountPage(driver);
		my.myAccount().click();
		my.myOrders().click();
		
		Assert.assertEquals(my.orderPricemyAccount(), chk.priceAfterOrderPlaced());
		
		System.out.println("The test is passed");
			
				
	}
	@AfterMethod
	public void Stop()
	{		
		driver.quit();
	}

}
