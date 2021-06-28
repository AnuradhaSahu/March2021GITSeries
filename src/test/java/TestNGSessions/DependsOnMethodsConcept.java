package TestNGSessions;

import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	//this will always give false results
	//AAA rule will be applied- all the test cases should be independent of each other
	
	@Test
	public void loginTest() {
		System.out.println("Login Page Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homePageTest() {
		System.out.println("Home page Test");
	}

}
