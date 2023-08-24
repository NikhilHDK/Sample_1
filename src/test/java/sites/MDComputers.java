package sites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MDComputers {
  @Test
  public void amazon () {
	  Reporter.log("Opening Mdcomputers",true);
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://mdcomputers.in/");
	  driver.quit();
	  
	  System.out.println("Hey Nik");
  }
}
