package TestNGSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {
	
	/*1.giving demo to client
	 * 2.doing negative testing
	 * 
	 */
	
	@Test(priority=1, expectedExceptions = {ArithmeticException.class, NullPointerException.class})
	public void a_test() {
		System.out.println("a_test");
		int i=9/0;
	}

}
