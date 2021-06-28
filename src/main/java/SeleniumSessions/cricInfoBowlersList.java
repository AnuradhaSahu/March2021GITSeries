package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cricInfoBowlersList {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
			driver
			.get("https://www.espncricinfo.com/series/sri-lanka-tour-of-bangladesh-2021-1262340/bangladesh-vs-sri-lanka-1st-odi-1262344/full-scorecard");
			Thread.sleep(5000);
			List<WebElement> bowlersList=
			driver.findElements
			(By.xpath("//table[@class='table bowler']//child::tbody/tr"));
	           
			for(WebElement e:bowlersList) {
				System.out.println(e.getText());
			}
	}

}
