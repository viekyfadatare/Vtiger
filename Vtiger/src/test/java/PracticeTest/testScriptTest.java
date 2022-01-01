package PracticeTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class testScriptTest {
	
	
	
	@Test
	public void printLn() {
		
		System.out.println("===========I am Vieky=========");
	}
	
	@Test
	public void ekOrMethodLagaDe() {
		System.out.println("==== laga di ek or meyhod===");
	}
	
	/*@Test
	public void testS() {

		WebDriver driver;
		
		String URL = System.getProperty("url");
		String BROWSER = System.getProperty("browser");
		
		
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			driver.get(URL);
		}else if (BROWSER.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			driver.get(URL);

		}
		
	}*/
		
	
}
