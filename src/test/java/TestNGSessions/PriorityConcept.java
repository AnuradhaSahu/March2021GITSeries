package TestNGSessions;

import org.testng.annotations.Test;

public class PriorityConcept {
	/*
	 * 1.By defualt if no priority is given then it will run as per alphabettically
	 * 2.prority can be 0
	 * 3.test can have no priority as well
	 * -Non priority -1st
	 * -0 priority-2nd 
	 * -priority-1,2,....-3rd
	 */
	
	@Test(priority=0)//-----1
	public void a_test() {
		System.out.println("a_test");
	}
	@Test(priority=1)//-------------4
	public void b_test() {
		System.out.println("b_test");
	}
	@Test//------------------2
	public void c_test() {
		System.out.println("c_test");
	}
	@Test(priority=0)//-------------------3
	public void d_test() {
		System.out.println("d_test");
	}
	@Test(priority=5)//-----------5
	public void e_test() {
		System.out.println("e_test");
	}
	@Test(priority=6)//------------6
	public void f_test() {
		System.out.println("f_test");
	}

}
