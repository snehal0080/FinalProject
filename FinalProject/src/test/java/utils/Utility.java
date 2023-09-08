package utils;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import testbase.ReadConfig;

public class Utility extends ReadConfig {
	static WebDriver ldriver;
	public static void selectValue(WebElement element, String term, String value) {
		// TODO Auto-generated method stub
		Select dropDown=new Select(element);
		if(term.equalsIgnoreCase("byValue")){
            dropDown.selectByValue(value);
        }else if(term.equalsIgnoreCase("byIndex")){
            dropDown.selectByIndex(Integer.parseInt(value));
        }else if(term.equalsIgnoreCase("byVisibleText")){
            dropDown.selectByVisibleText(value);
        }else{
            System.out.println("Please select the correct value");
        }
	}
		public static void MouseHover(WebDriver driver, WebElement element){
	        Actions action=new Actions(driver);
	        action.moveToElement(element)
	                .build()
	                .perform();
	       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	   }
		
		public static void scrollDownByElement(WebDriver driver, WebElement element){
	        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
	        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", element);
	    }
		
		public static void scrollUp(WebDriver driver) {
			
			JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
			javascriptExecutor.executeScript("window.scrollBy(0,800)");
			javascriptExecutor.executeScript("window.scrollBy(0,-800)");
		}
		

	
	}





