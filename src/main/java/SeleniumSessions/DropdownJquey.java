package SeleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownJquey {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		/*jQuery -js framework used for designeing ui dropdowns,
		 * does not hve select class
		 * 
		 */
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		Thread.sleep(2000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		Thread.sleep(2000);
		
//		List<WebElement> choicelist=
//				driver.findElements(By.cssSelector(".ComboTreeItemChlid"));
//		
//		for(int i=0;i<choicelist.size();i++) {
//		    String text=choicelist.get(i).getText();
//		    System.out.println(text);
//		    if(text.equals("choice 5")) {
//		    	choicelist.get(i).click();
//		    	break;
//		    }
//		}
		
		By choices=By.cssSelector(".ComboTreeItemChlid");
		
		//TC1-Single selection
		//selectchoice(choices,"choice 4");
		//selectchoice(choices,"choice 2 3");//but we cannot keep on writing this method if we have multiple selections
		
		//TC2-Multi selction
		//selectchoice(choices,"choice 4","choice 2 2","choice 7","choice 6 2 1","choice 6 2 3");
		
		//TC3-All selction
		Thread.sleep(2000);
		selectchoice(choices,"all");


		
	}
	/*This Method is used to select values from teh dropdown and it covers 3 use cases
	 * 1.single selection
	 * 2.multi selction
	 * 3.all selction
	 * 
	 */
	
	public static void selectchoice(By locator,String... value) {
		List<WebElement> choicelist=driver.findElements(locator);
		
		if(!value[0].equalsIgnoreCase("all")) {
		for(int i=0;i<choicelist.size();i++) {
		    String text=choicelist.get(i).getText();
		  //  System.out.println(text);		    
		    for(int j=0;j<value.length;j++) {
		    if(text.equals(value[j])) {
		    	choicelist.get(i).click();
		    	break;
		      } 
		    }
	      }
        }else {
        	try {
        	for(WebElement e:choicelist) {
               e.click();
        	}
        	}catch(Exception e) {
        		
        	}
        }
	
	
}
}