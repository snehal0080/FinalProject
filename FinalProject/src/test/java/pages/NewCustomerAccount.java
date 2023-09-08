package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Utility;



public class NewCustomerAccount{
	WebDriver ldriver;
	
	//constructor
	public NewCustomerAccount(WebDriver rdriver)
	 {
		 ldriver=rdriver;
		 PageFactory.initElements(rdriver, this);
		 
	 }
 @FindBy(xpath="/html/body/div[3]/div/ul/li[2]/a")
 WebElement newaccountbtn;
 
 @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
 WebElement customername;
 
 @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
 WebElement maleradiobtn;
 
 @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")
 WebElement femaleradiobtn;
 

 @FindBy(xpath="//*[@id=\"dob\"]")
 WebElement dob;
 
 @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
 WebElement address;
 
 @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
 WebElement city;
 
 @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
 WebElement state;
 

 @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
 WebElement pinno;
 
 @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
 WebElement mobno;
 
 @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
 WebElement email;
 
 @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")
 WebElement password;
 
 @FindBy(xpath="/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")
 WebElement submit;
 
 public void newCustomerRegistration(String name, int a, String dob1, String addr, String c, String s, String pin, String mob,String e, String pwd)
 {
	 newaccountbtn.click();
	customername.sendKeys(name);
	if(a==1) {
		maleradiobtn.click();
	}
	else {
		femaleradiobtn.click();
	}
	
	dob.sendKeys(dob1);
	address.sendKeys(addr);
	city.sendKeys(c);
	state.sendKeys(s);
	pinno.sendKeys(pin);
	mobno.sendKeys(mob);
	email.sendKeys(e);
	password.sendKeys(pwd);
	
	submit.click();
	
	
 }
 

 
}
