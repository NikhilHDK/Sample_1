package sites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Snapdeal {
  @Test
  public void snapdeal() {
	  Reporter.log("Opening Snapdeal",true);
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.snapdeal.com/");
	  driver.quit();
	  
  }
}
