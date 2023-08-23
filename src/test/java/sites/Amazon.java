package sites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Amazon {
  @Test
  public void amazon () {
	  Reporter.log("Opening Amazon",true);
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.in/");
	  driver.quit();
	  
	  System.out.println("Hey Nik");
  }
}
