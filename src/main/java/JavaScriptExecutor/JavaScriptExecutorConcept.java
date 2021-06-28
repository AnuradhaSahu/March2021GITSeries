package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
/*There are certain things that selenium is not capable f doing like Scrolling, captcha controlling, otp  etc
 * 
 *  Java script(Browser Language) code for throwing pop up-   alert('This is anuradha Here')
 *  Refresh the page-History.go(0)
 *  -create object of javascript util class to use the javascript eecutor methods
 * 	2 ways of getting the title of the page:-
 * 1.driver.getTitle;
 * 2.getTitleByJS

 */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.freshworks.com/");
		
		WebElement  empEng= driver.findElement(By.xpath("//h1[contains(text(),'Best-in-class customer and employee engagement')]"));
//Creating object of JS utility
		
		JavaScriptExecutorUtility js=new JavaScriptExecutorUtility(driver);
//		String title=js.getTitleByJS();// document(entire DOM).title
//		System.out.println(title);
//		
		//js.refreshBrowserByJS();
		
		//- when giving demo to client- giving alert
	//	js.generateAlert("I am on login Page");
		
		//content testing - getpageinner text- not avialabel in selenium
//	   if(js.getPageInnerText().contains("Vishal Gupta")){
//			System.out.println("Pass");
//		}
		
//	   js.drawBorder(empEng);
//	   
//	   js.flash(empEng);
//	   
//	   WebElement getstarted=driver.findElement(By.xpath("//div[contains(text(),'Get started')]"));
//	   //if nothing is working then click using js- when we get element not intractable error then use this , like a backdoor entry
//	   js.clickElementByJS(getstarted);// 
	   
	   WebElement strong=driver.findElement(By.xpath("//strong[contains(text(),'The Freshworks Promise')]"));
	   //scrolling
	   js.scrollPageDown();
	   js.scrollPageUp();
	   js.scrollPageDown("700");
	   
	   js.scrollIntoView(strong);

		
	}

}
