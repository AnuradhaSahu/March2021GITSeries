package seleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NaukriBrowserPopup {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		
		
		//collecting the window ids
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it =handles.iterator();
		
		while(it.hasNext()) {
			String id=it.next();
			driver.switchTo().window(id);
			System.out.println(driver.getTitle());
			driver.close();
			
		}
		
		
		
		
		
		
		
	}

}
