package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHrmAssignment {

	public static void main(String[] args) {

		BrowserUtil br=new BrowserUtil();
		WebDriver driver=br.initDriver("chrome");
		
		br.launchurl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		 
		By subdomainname=By.id("Form_submitForm_subdomain");
		By Firstname=By.id("Form_submitForm_FirstName");
		By lastname=By.id("Form_submitForm_LastName");
		By email=By.id("Form_submitForm_Email");
		By jobtitle=By.id("Form_submitForm_JobTitle");
		By company=By.id("Form_submitForm_CompanyName");
		By phonenumber=By.id("Form_submitForm_Contact");
		By btnsubmit=By.id("Form_submitForm_action_request");
		
		
		
		
	}

}
