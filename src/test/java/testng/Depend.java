package testng;

import org.testng.annotations.Test;

public class Depend {
  @Test(dependsOnMethods = {"b"})
public void a() {
	  System.out.println("Sign in should depended on Launch Browser method..");
  }
  
  @Test
  public void b() {
	  System.out.println("Launch success...");
  }
}
