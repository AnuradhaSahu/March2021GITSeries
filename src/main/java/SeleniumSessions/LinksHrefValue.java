package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksHrefValue {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		
		By links=By.tagName("a");
		//for getting the attribute value of tagname a- attribute-href
//		List<WebElement> linkslist=driver.findElements(links);
//		for(WebElement e:linkslist) {
//			String hrefvalue=e.getAttribute("href");
//			System.out.println(hrefvalue);
//		}
		By image=By.tagName("img");
		//for getting the source image jpg value of tagname img
//				List<WebElement> imagelist=driver.findElements(image);
//				for(int i=0;i<imagelist.size();i++) {
//					String srcvalue =imagelist.get(i).getAttribute("src");
//					System.out.println(srcvalue);
//				}
		getAttributelList(links,"href");
		getAttributelList(image,"img");
		
	}
	//moving this to element util library
	public static void getAttributelList(By locator,String att) {
		List<WebElement> Attributelist=driver.findElements(locator);
//		for(int i=0;i<Attributelist.size();i++) {
//			String attlist =Attributelist.get(i).getAttribute(att);
//			System.out.println(attlist);
//		}
//		
//		//ignore blank texts
//		for(WebElement e:Attributelist) {
//			String text=e.getText();
//			if(!text.isEmpty())
//			System.out.println(text);
//		}
	
	}

}

