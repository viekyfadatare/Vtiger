package PracticeTest;

import org.testng.annotations.Test;

public class tc3Test {

	@Test
	public void tc1() {
		
		System.out.println("==========I am Tec3======");

	}
	@Test(groups = "smoke")
	public void smoke() {
		System.out.println("=======i am Smoke test3======");
	}
	
	@Test(groups = "reg")
	public void regrassion() {
		System.out.println("=======i am Regrassion test3======");

	}
	
	@Test
	public void yeMethod() {
		System.out.println("=======method of TC3=====");
	}
}
