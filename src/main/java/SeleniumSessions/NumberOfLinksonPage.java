package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NumberOfLinksonPage {

	/*
	 * Count the number of links on a webpage and 
	 * print the text of each link
	 * ignore blank texts
	 */
	static WebDriver driver;
	
	/* This function will take By locator and returns list of webelements
	 * 
	 */
	
//	public static void getElements(By locator) {
//		List<WebElement> links= driver.findElements(By.tagName("a"));
//		System.out.println("Total number of links "+links.size());	//returns total no of links
//		for(WebElement e:links) {
//			String text=e.getText();
//			if(!text.isEmpty()) {
//				System.out.println(text);
//			   }
//	       }
//		}
		
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);// this returns list of webelemnts
	}
	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for(WebElement e : eleList) {
			String text = e.getText();
			if(!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	public static void printElementsText(By locator) {
		getElementsTextList(locator).stream().forEach(e -> System.out.println(e));
	}
	
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		By links=By.tagName("a");
		
//		List<String> actuallinks=getElementsTextList(links);
//		for(String s:actuallinks) {
//			System.out.println(s);
//		}
		printElementsText(links);		
		
		//Count the number of links on a webpage 
		//1st approach
//		List<WebElement> links= driver.findElements(By.tagName("a"));
//		System.out.println("Total number of links "+links.size());	//returns total no of links
//		
//		
//		//print the text of each link-foreach loop
////		for(WebElement e:links) {
////			System.out.println(e.getText());
////		}
//		
////		//using traditional for loop
////		for(int i=0;i<links.size();i++){
////			System.out.println(links.get(i).getText());
////		}
//		
//		//ignore blank texts
//		for(WebElement e:links) {
//			String text=e.getText();
//			if(!text.isEmpty()) {
//				System.out.println(text);
//			}
//		}
		//2nd approach-create generics
		
	}	
}
