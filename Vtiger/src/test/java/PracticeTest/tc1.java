package PracticeTest;

import org.testng.annotations.Test;

public class tc1 {
	
	
	@Test
	public void testc1() {
		
		System.out.println("==========I am Tc1======");

	}
	@Test(groups = "smoke")
	public void smoke() {
		System.out.println("=======i am Smoke test1======");
	}
	
	@Test(groups = "reg")
	public void regrassion() {
		System.out.println("=======i am Regrassion test1======");

	}
	
}
