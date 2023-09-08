package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Deposit {
	WebDriver ldriver;
	 
	public Deposit(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
		 
	 }
	@FindBy(xpath="/html/body/div[3]/div/ul/li[8]/a")
	WebElement deposit;

	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
	WebElement AccountNo;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")
	WebElement amount;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
	WebElement description;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input[1]")
	WebElement submit;

	 
	 public void deposit(String a, String b ,String text)
	 {
		
		deposit.click();
		AccountNo.sendKeys(a);
		amount.sendKeys(b);
		description.sendKeys(text);
		submit.click();
		
	 }

}
