package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	static WebDriver driver;

	@BeforeTest()
	public void launch(){
		 ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver();
			driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}
  @Test(dataProvider = "myData")
  public void f(String text, String text1, String x) throws InterruptedException {
	 
		WebElement email = driver.findElement(By.name("email"));
		WebElement pass = driver.findElement(By.name("password"));
		email.sendKeys(text);
		pass.sendKeys(text1);
		Thread.sleep(1000);
		email.clear();
		pass.clear();
		Thread.sleep(1000);
		//System.out.println(x);
  }
  
  @DataProvider(name="myData")
  public Object[][] dataProviderMethod(){
	return new Object[][] {{"Selenium","Test@123","rrr"},{"Cypress","acn@333",""},{"Playwright","xyz@333","tt"}};
	  
  }
		  
}
