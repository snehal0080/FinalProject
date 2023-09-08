package testcase;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Deposit;
import pages.EditAccount;
import pages.LoginPage;
import pages.NewAccount;
import pages.NewCustomerAccount;



public class TC_Login_01 extends BaseClass{
	LoginPage lp;
	NewCustomerAccount newaccount;
	EditAccount editAccount;
	NewAccount newaccount1;
	Deposit deposit;
	
	
	
	@BeforeMethod
	
	public void beforeMethod()
	{
		driver.get(baseURL);
		lp=new LoginPage(driver);
		newaccount= new NewCustomerAccount(driver);
		editAccount = new EditAccount(driver);
		newaccount1=new NewAccount(driver);
		deposit = new Deposit(driver);
		
	}
	
	@Test(priority =1)
	public void loginTest()
	{
		
		
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clickSubmit();
		
		if(lp.getResult().equals("Welcome To Manager's Page of Guru99 Bank")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	
	@Test(priority = 2)
	public void verifyNewRegistration()
	{
		
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clickSubmit();
		newaccount.newCustomerRegistration("sneha", 2, "17/01/2001", "pc", "jalgaon", "maharashtra", "002", "7030261908", "snehal@gmail.com", "245");
		
	}
	
	
	/*@Test
	public void editAccountTest()
	{
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		editAccount.EditAccount1("12345");
			
	}*/
	
	/*@Test
	 public void MouseHover() {
		   SoftAssert softAssert = new SoftAssert();
		   newaccount1.MouseHover();
		   softAssert.assertAll();
		 }
	
	@Test
	public void verifyscrollDown() {
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollBy(0,2000)");
	}
	@Test
	public void verifyscrollUp() {
		JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
		javascriptExecutor.executeScript("window.scrollBy(0,2000)");
	}*/

	/*@Test
	public void deposit1()
	{
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickSubmit();
		deposit.deposit("2345","500","cash");
			
	}*/

}


