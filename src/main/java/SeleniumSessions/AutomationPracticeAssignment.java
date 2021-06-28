package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeAssignment {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();	
		driver.get("http://automationpractice.com/index.php");
	    driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Dress");
	    Thread.sleep(5000);

	   List<WebElement> dresslist= 
	   driver.findElements(By.xpath("//div[@class='ac_results']//li"));
	   
	   System.out.println(dresslist.size());
	   
	   String SelectedTshirt="Faded Short Sleeve T-shirts";
	 //  By SelectedText=By.xpath("//div[@class='pb-center-column col-xs-12 col-sm-4' ]/h1");
	   
	   for(WebElement e:dresslist) {
		   System.out.println(e.getText());
		   if(e.getText().equals("T-shirts > Faded Short Sleeve T-shirts")) {
			   e.click();
			   System.out.println("T-shirts > Faded Short Sleeve T-shirts is selected");
			  if(SelectedTshirt.equals("Faded Short Sleeve T-shirts")) {
				  System.out.println("Faded Short Sleeve T-shirts selected");
				  break;
			  }
			 
		   }
	   }
	   
		
	}

}
