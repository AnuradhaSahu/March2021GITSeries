package TestNGSessions;

import org.testng.annotations.Test;

public class InvocationCount {
	
	/*
	 * 	It is used when we hit the create user API/ any api back to back for certain times
	 * But same scenario from UI will not be prefered
	 */
	
	@Test(invocationCount=5)
	public void createUserTest() {
		System.out.println("User Test");
	}

}
