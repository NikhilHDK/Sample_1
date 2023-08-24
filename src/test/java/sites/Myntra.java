package sites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void amazon () {
	  Reporter.log("Opening myntra",true);
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.myntra.com/");
	  driver.quit();
	  
	  System.out.println("Hey Nik");
  }
}
