package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathNooncom {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.noon.com");
		
		String Recommended=
		driver.findElement(By.xpath("(//div[@class=\"sc-gsTCUz bhdLno\"])[1]")).getText();

		System.out.println(Recommended);
		
		List<WebElement> recommendedlist=
				driver.findElements(By.xpath("(//div[@class=\"swiper-wrapper\"])[1]"));
		for(WebElement e:recommendedlist) {
			System.out.println(e.getText());
		}
		
	}

}
