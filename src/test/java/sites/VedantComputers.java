package sites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class VedantComputers {
  @Test
  public void snapdeal() {
	  Reporter.log("Opening vedantcomputers",true);
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.vedantcomputers.com/");
	  driver.quit();
	  
  }
}
