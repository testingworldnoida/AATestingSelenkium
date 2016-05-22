package snapshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Screenshot {

	
	public void takeScreenshot(FirefoxDriver f, String fname) throws IOException
	{
		File f1 = f.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\"+fname+".png");
		FileUtils.copyFile(f1, f2);
	}
	
	
}
