package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricinfoLiveScoreCard {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get(
				"https://www.espncricinfo.com/series/sri-lanka-tour-of-bangladesh-2021-1262340/bangladesh-vs-sri-lanka-1st-odi-1262344/full-scorecard");
		Thread.sleep(5000);

		System.out.println(getWicketTakerName("Shakib Al Hasan"));
		getscorecardList("Shakib Al Hasan").stream().forEach(e->System.out.print(e + " "));
	
	}
	
	public static String getWicketTakerName(String batsmanName) {
		return driver
				.findElement(
						By.xpath("//a[contains(text(),'" + batsmanName + "')]/parent::td/following-sibling::td/span"))
				.getText();
	}
	
	public static List<String> getscorecardList(String batsmanName) {
		List<String> scorvaluelist=new ArrayList<String>();
		List<WebElement> scorlist=driver.findElements(By.xpath("//a[contains(text(),'"+batsmanName+"')]/parent::td//following-sibling::td"));
		for(int i=2;i<scorlist.size();i++) {
			String scorvalue=scorlist.get(i).getText();
			scorvaluelist.add(scorvalue);
		}
		return scorvaluelist;
	}
	
}
