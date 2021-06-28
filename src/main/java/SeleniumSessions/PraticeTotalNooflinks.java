package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PraticeTotalNooflinks {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		By links = By.tagName("a");
		
		printElementsText(links);

	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static List<String> getElementTextList(By locator) {
		List<WebElement> elelist=getElements(locator);
		List<String> eleTextlist=new ArrayList<String>();
		for(WebElement e:elelist) {
			String text=e.getText();
			if(!text.isEmpty()) {
				eleTextlist.add(text);
			}
		}
		return eleTextlist;
	}
	
	public static void printElementsText(By locator) {
		getElementTextList(locator).stream().forEach(e->System.out.println(e));
	}
		
}
