package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWait {

	public static void main(String[] args) {

		/*
		 * 1.Only applicable for webelements
		 * 2.Not applicable for non webelements-Ex-Title,URL,Alerts,Window etc
		 * 3.It is gloval wait- it will be applied to all the webelements throughout the session	
		 * 4.it is dynamic in nature->total time=10 sec,found-2 sec , then 8 sec will be ignored
		 * 5.used immeidiately after launching the browser
		 * 6.applied with findelement method
		 * 7.we can override implicit wait by chnaging teh value of the it 
		 * 8.Limitation:
		 * -by default it applies same wait for all the elements ex- 10 sec
		 * - for every page if we need to change th wait then we have to override , nullify and declare for new elements again
		 * -never used in realtime
		 * -no need to create utility for implicitly wait
		 * 
		 * */
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		//used immeidiately after launching the browser
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("https://www.opencart.com/index.php?route=account/login");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anu@123.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("678KK");
		driver.findElement
		(By.xpath("//button[@class='btn btn-primary btn-lg btn-block visible-xs-block']")).click();
		
		//changing the value of implicit wiat
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);	

		//Nullification
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);		


		
		
		
		
		
	}

}
