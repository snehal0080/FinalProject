package pages;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;

public class NewAccount {
	public static WebDriver driver;
	public static Properties prop;
	
	
	WebDriver ldriver;
	 
	public NewAccount(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
		 
	 }
	@FindBy(xpath="/html/body/div[3]/div/ul/li[5]/a")
	 WebElement newaccountbtn1;
	
	@FindBy(xpath="//*[@id=\"navbar-brand-centered\"]/ul/li[3]/a")
	WebElement hover;
	

	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")
	 WebElement accountType;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
	 WebElement deposit;
	
	 @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
	 WebElement submit;
	 
	 public void newAccountRegistration( String type, String d)
	 {
		
		newaccountbtn1.click();
		deposit.sendKeys(d);
		submit.click();	
		
	 }
	 
	 public NewAccount(){
	        PageFactory.initElements(driver, this);
	    }
	 public void selectAccountType(String term, String value)
	 {
		 accountType.click();
		Utility.selectValue(accountType, term, value);
	 }
	 public void MouseHover() {
			Utility.MouseHover(ldriver,hover);
		}
}

