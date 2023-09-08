package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import testbase.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	public String baseURL=readconfig.getApplicationURL();
    String username=readconfig.getUsername();
	public String password=readconfig.getPassword();
	public static WebDriver driver;	
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome,driver",readconfig.getChromePath());
	driver=new ChromeDriver();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}

