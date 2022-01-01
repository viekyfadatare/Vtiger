package PracticeTest;

import org.testng.annotations.Test;

public class tc4Test {

	@Test
	public void tc1() {
		
		System.out.println("==========I am Tc4======");

	}
	@Test(groups = "smoke")
	public void smoke() {
		System.out.println("=======i am Smoke test4======");
	}
	
	@Test(groups = "reg")
	public void regrassion() {
		System.out.println("=======i am Regrassion test4======");

	}
	
	@Test
	
	public void yebHiEkMethodTC4() {
		System.out.println("=========new Method of TC4=====");
	}
}
