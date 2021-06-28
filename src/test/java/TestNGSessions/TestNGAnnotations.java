package TestNGSessions;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	//Pre conditions- @BeforeSuite,@BeforeTest,@BeforeClass,@BeforeMethod
	
	//Test Case-@Test->Assertions-Actual Vs Expected
	//Test Case-@Test->Assertions-Actual Vs Expected
	//Test Case-@Test->Assertions-Actual Vs Expected
	//Test Case-@Test->Assertions-Actual Vs Expected
	
	//Post Conditions-@AfterMethod,@AfterClass,@AfterTest,@AfterSuite
	
	/*
	 * Pairs -@BM@TC1@AM, @BM@TC2@AM, @BM@TC3@AM, @BM@TC4@AM          
	 *
	 * Order in which it will get picked
	 * @BS- 1
	 * @BT- 2
	 * @BC- 3
	 * 
	 * @BM- 4
	 * @SearchTest-T1
	 * @AM -5
	 * 
	 * @BM- 6
	 * @SearchTest-T2
	 * @AM -7
	 * 
	 * @AC-8
	 * @AT-9
	 * @AS-10 
	 * It will be picked alphabetically order
	 */
	@BeforeSuite
	public  void beforeSuite() {
		System.out.println("Before Suite--------create a user in DB");
	}	
	@BeforeTest
	public  void beforeTest() {
		System.out.println("Before Test-----launch browser");
	}
	@BeforeClass
	public  void beforeClass() {
		System.out.println("Before Class-----enter url");
	}	
	@BeforeMethod
	public  void beforeMethod() {
		System.out.println("Before Method-----login to app");
	}	
	@ Test
	public  void titleTest() {
		System.out.println("titleTest");
		Assert.assertEquals("Google", "Google");
	}	
	@Test
	public  void SearchTest() {
		System.out.println("SearchTest");
		Assert.assertEquals("Google", "Google");
	}	
	@AfterMethod
	public  void AfterMethod() {
		System.out.println("AfterMethod-----logout");
	}	
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClassTest-----closetheborwser");
	}	
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test------delete the created user");
	}	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("AfterClassTest-----close the DB connection");
	}
}
