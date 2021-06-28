package SeleniumAssignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoondotCom {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.noon.com/uae-en/");
		String Recommended4u=driver.findElement(By.xpath("//h3[contains(text(),'Recommended for you')]")).getText();
	
		System.out.println(Recommended4u);
		
		List<WebElement> recommendedlist=
				driver.findElements(By.xpath("(//div[@class='swiper-wrapper'])[2]"));
		
		int i=0;
		while(true) {
			if(driver.findElements
					(By.xpath("(//span[contains(text(),'Apple iPhone 12')])[1]")).size()==1){
				
				
			}
		}
	
	
	
	
	}
	public static void selectproduct(String product) {
		
	}

}
