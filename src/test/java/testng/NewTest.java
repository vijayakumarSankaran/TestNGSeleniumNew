package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class NewTest {
  @Test
  public void f() {
  }
  @Parameters({"param"})
  @Test
  public void beforeTest(String text) {
	  System.out.println(text);
  }
 
  @Test(groups = {"Regression"})
  public void one() {
	  System.out.println("1");
  }
  
  @Test(groups = {"Regression"})
  public void two() {
	  System.out.println("2");
  }
  
  @Test(groups = {"Somke"})
  public void three() {
	  System.out.println("3");
  }
  
  @Test(groups = {"Sanity"})
  public void four() {
	  System.out.println("4");
  }
  
  @Test
  public void five() {
	  System.out.println("5");
  }

}
