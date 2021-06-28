package SeleniumSessions;

public class WaitOverviewSynchronisation {

	public static void main(String[] args) {

		/*
		 * Synchronization- sync between selenium script which 
		 * we have written and the appliaction, which may be slow due tosome or other reason
		 * 
		 * To resolve this type of problem we have introduced wait concept
		 * 2 Types of wait:
		 * 1.Static wait-when the script pauses for some time - ex-Thread.sleep(2000) in milli sec
		 * 2.Dynamic wait- When u wait for  specific element to get displayed
		 *  2 types of dynamic wait:
		 *  1.Implicit wait-It is a global wait- same amt of time is given for every element to get displayed
		 *  2.Explicit wait
		 *   2 types of explicit wait
		 *   1.Webdriver wait
		 *   2.fleunt wait
		 *  
		 *  Webdriver wait(Class) is a child of fluent wait(class) , 
		 *  fluent wait implements wait(Interface)
		 *  wait has one Until() method
		 *  
		 * 
		 * Webdriver wait- we have to create an object of webdriver wait , it has only 1 method in sele coumentation
		 * Webdriverwaut wait=new webdriverwait(driver,timeout)
		 * wait.until(Expectedcondtion.presence of elemnt(....))
		 * 
		 * Fluent wait-it contains a lot of methods until() + other methods
		 * Top casting is used to create fluent wait
		 * 
		 * Wait<Webdriver> wait=new Fluent<Webdriver>(driver)
		 * .withTimeout(durationofseconds(10))
		 * .pollintime(Durationofmillisec(2))
		 * .ignoring(exception1,exception2) 
		 * 
		 */
	}

}
