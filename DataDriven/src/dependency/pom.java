package dependency;
import org.openqa.selenium.firefox.FirefoxDriver;


public class pom {
	FirefoxDriver f;
	public pom(FirefoxDriver f)
	{
		this.f=f;
	}
	
	public void enterusername(String uname){
		
		f.findElementById("email").sendKeys(uname);
	}
	
	public void enterpassd(String pass){
		f.findElementById("pass").sendKeys(pass);
	}
	
	public void abc(String s)
	{
		
	}
	
}
