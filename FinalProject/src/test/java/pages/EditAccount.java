package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditAccount {
	WebDriver ldriver;
	 
	public EditAccount(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
		 
	 }
	@FindBy(xpath="/html/body/div[3]/div/ul/li[6]/a")
	WebElement editAccount;

	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	WebElement AccountNo;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")
	WebElement submit;

	 
	 public void EditAccount1(String a)
	 {
		
		editAccount.click();
		AccountNo.sendKeys(a);
		submit.click();
		
	 }
}
