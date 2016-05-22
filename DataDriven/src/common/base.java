package common;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base {
public FirefoxDriver f;

@BeforeMethod

public void bft () {
	
	f = new FirefoxDriver();
	
	f.get("https://www.facebook.com");
	
	}

@AfterMethod
public void aft(){
	f.quit();
}

}
