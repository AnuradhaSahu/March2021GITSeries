package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(2000);
		
		WebElement SourceEle=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement TargetEle=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		Actions act=new Actions(driver);
		act.clickAndHold(SourceEle).moveToElement(TargetEle).
		release().build().perform();// multiple actions-.build,.perform
		
		act.dragAndDrop(SourceEle, TargetEle).perform();//single action
	}

}
