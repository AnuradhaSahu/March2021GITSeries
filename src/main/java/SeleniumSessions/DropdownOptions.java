package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownOptions {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country=By.id("Form_submitForm_Country");
		By industry=By.id("Form_submitForm_Industry");
		
//		Select indus=new Select(driver.findElement(industry));
//		List<WebElement> indusoptions=indus.getOptions();
//		//get all values from dropdown
//		
//		for(WebElement e:indusoptions) {
//			System.out.println(e.getText());
//		}
		
//		for(int i=0;i<indusoptions.size();i++) {
//			System.out.println(indusoptions.get(i).getText());
//		}
//		
//		indusoptions.stream().forEach(e->System.out.println(e.getText()));
//		
		printDropDownOptions(country);
		
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void printDropDownOptions(By locator) {
//		Select select =new Select(getElement(locator));
//		List<WebElement> optionslist=select.getOptions();
//		optionslist.stream().forEach(e->System.out.println(e.getText()));

		getDropDownOptions(locator).stream().forEach(e->System.out.println(e));
		
		
		
	}
	
	public static List<String> getDropDownOptions(By locator) {
		Select select =new Select(getElement(locator));
		List<WebElement> optionslist=select.getOptions();//store the values of this list inanother list
		
		List<String> optionsTextlist=new ArrayList<String>();
		
		for(WebElement e: optionslist) {			
			optionsTextlist.add(e.getText());//storing the value of other list in this
		}
		return optionsTextlist;
	}
	
	public static void doSelectValuefromDropdown(By locator,String value) {
		Select select =new Select(getElement(locator));
		List<WebElement> optionslist=select.getOptions();
		
		for(WebElement e:optionslist) {
			if(e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
