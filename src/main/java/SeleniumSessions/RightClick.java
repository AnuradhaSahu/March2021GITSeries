package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
/*
 * In html language-right click-Context click
 */
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
			
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
		act.contextClick(rightclick).perform();
		
		List<WebElement> rightclicklist=driver.findElements(By.xpath("//ul[@class=\"context-menu-list context-menu-root\"]//span"));
		
		for(WebElement e: rightclicklist) {
			System.out.println(e);
			System.out.println(e.getText());
			if(e.getText().equals("Edit")) {
				e.click();
				break;
			}
		}
	}

}
