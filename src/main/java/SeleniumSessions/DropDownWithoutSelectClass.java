package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelectClass {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country=By.id("Form_submitForm_Country");
		By industry=By.id("Form_submitForm_Industry");
		
//		List<WebElement> optionslist=driver.findElements
//				(By.xpath("//select[@id='Form_submitForm_Industry']/option"));
//		
//		for(WebElement e: optionslist) {
//			System.out.println(e.getText());
//			if(e.getText().equals("Travel"));
//			e.click();
//			break;
//		}
	
		By indusOptions=By.xpath("//select[@id='Form_submitForm_Industry']/option");
		doSelectValues(indusOptions,"Travel");
		
	}
	
	public static void doSelectValues(By locator,String value) {
		List<WebElement> optionslist=driver.findElements(locator);
		
		for(WebElement e: optionslist) {
			if(e.getText().equals(value));
			e.click();
			break;
		}
	}

}
