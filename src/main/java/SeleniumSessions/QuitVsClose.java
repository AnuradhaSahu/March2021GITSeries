package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {

	public static void main(String[] args) {


		//Quit()
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");//sessionid generated
		String title=driver.getTitle();//sessionid remains same
		System.out.println(title);//sessionid remains same
		driver.quit();//sessionid remains same
		System.out.println(driver.getTitle());//sessionid becomes null
		/*
		 * No such session exception- id is null
		 */
		
		//close()

		driver.get("https://www.facebook.com/");//session id generated
		String Title=driver.getTitle();//sessionid remians same
		System.out.println(Title);//sessionid remians same
		driver.close();//sessionid remians same
		System.out.println(driver.getTitle());//session id not null, invalid session id
		/*No such element exception- invalid session id
	     To solve this problem we need to create new session id 
	    */
		//Creating new session id
		driver.get("https://www.facebook.com/");//session id generated
        String T=driver.getTitle();		
		System.out.println(T);
		
		
		
		
		
		
		
	}

}
