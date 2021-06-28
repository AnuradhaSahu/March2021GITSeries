package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchDropdowns {
    static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
		driver.get("https://www.google.com/");
	    driver.findElement(By.name("q")).sendKeys("naveen automation labs");
	    Thread.sleep(2000);
	    
	    List<WebElement> sugglist=
	    driver.findElements(By.xpath("//ul[@role='listbox']//div[@class='wM6W7d']//span"));
		
	    System.out.println(sugglist.size());
	     for(WebElement e:sugglist) {
	    	System.out.println(e.getText());
	    	if(e.getText().equals("naveen automation labs selenium course")) {
	    		e.click();
	    		System.out.println("naveen automation labs selenium course is selected");
	    		break;
	    	}
	    }
	}
}
