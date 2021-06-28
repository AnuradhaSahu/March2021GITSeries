package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CriInfoBowlersLiveScoreCard {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver
		.get("https://www.espncricinfo.com/series/sri-lanka-tour-of-bangladesh-2021-1262340/bangladesh-vs-sri-lanka-1st-odi-1262344/full-scorecard");
		Thread.sleep(5000);
		getBowlerScorelist("Wanindu Hasaranga").stream().
		forEach(e->System.out.print(e+" "));
		
	}
	public static List<String> getBowlerScorelist(String BowlerName) {
		List<String> scoreListBowler=new ArrayList<String> ();
		
		List<WebElement> BowlerScorelist=
		driver.
		findElements
		(By.xpath("//a[contains(text(),'"+BowlerName+"')]/parent::td/following-sibling::td"));
		for(int i=1;i<BowlerScorelist.size();i++) {
			String ScroreValue=BowlerScorelist.get(i).getText();
			scoreListBowler.add(ScroreValue);
		}
		return scoreListBowler;
	}

}
