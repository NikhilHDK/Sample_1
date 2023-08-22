package sites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void flipkart() {
	  Reporter.log("Opening Flipkart",true);
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.quit();
  }
}
