package Login;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import snapshot.Screenshot;
import common.base;
import dependency.pom;

public class TestCase extends base {
	
	@Test(dataProvider="dp2")
	public void TC_001(String a, String b) throws IOException{
		pom A = new pom(f);
		A.enterusername(a);
		A.enterpassd(b);
		Screenshot s = new Screenshot();
		s.takeScreenshot(f, "Hello");
		
		
		
		
		
		
		}
	
	@DataProvider(name="dp1")
	public Object[][] testdata()
	{
		Object [][] arr = {{"uname1","pass1"},{"uname2","pass2"},{"uname3","pass3"}};
		return arr;
	}
	
	@DataProvider(name="dp2")
	public Object[][] testDataExcel() throws BiffException, IOException
	{
		File f = new File("./Tdata/TestData.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet s1 = wk.getSheet(0);
		int r = s1.getRows();
		
		Object [][] tdata = new Object[r-1][2];
		for(int i=1;i<r;i++)
		{
		   
		   for(int j=0;j<s1.getColumns();j++)
		   {
			    Cell c1 = s1.getCell(j, i);	
			    tdata[i-1][j]=  c1.getContents();
		   }
		}
		
		return tdata;
	}
	
}
