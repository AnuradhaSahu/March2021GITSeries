package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetTextConcept {
	
	public static void main(String[] args) {
		
		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.initDriver("chrome");
		
		driver.get("https://www.freshworks.com/");
		
		By header=By.tagName("h2");
		ElementUtilLibrary ele=new ElementUtilLibrary(driver);
		ele.doGetText(header);
		
		br.closeBrowser();
	}

}
