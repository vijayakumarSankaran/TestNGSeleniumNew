package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTestNGTest {
	@BeforeSuite
	public void one() {
		System.out.println("1");
	}
	@BeforeClass
	public void two() {
		System.out.println("2");
	}
	@BeforeTest
	public void three() {
		System.out.println("3");
	}
	@BeforeMethod
	public void four() {
		System.out.println("4");
	}
	@AfterMethod
	public void five() {
		System.out.println("5");
	}
	@AfterTest
	public void six() {
		System.out.println("6");
	}
	@AfterClass
	public void seven() {
		System.out.println("7");
	}
	
	@AfterSuite
	public void eight() {
		System.out.println("8");
	}
	
	@Test
	public void nine() {
		System.out.println("9");
	}
	
	@Test
	public void ten() {
		System.out.println("10");
	}
	
	@Test
	public void eleven() {
		System.out.println("11");
	}
	
	@Test
	public void twelve() {
		System.out.println("12");
	}
	
	@Test
	public void thirteen() {
		System.out.println("13");
	}
}
