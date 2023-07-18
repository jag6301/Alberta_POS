package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Excel_Read {
	
static WebDriver driver;
public Excel_Read(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}

public static String read(WebDriver driver,int m,int i,int k) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\Excel_Sheet\\Books1.xlsx";
		
		File aa = new File(path);
		
		FileInputStream bb = new FileInputStream(aa);
		
		XSSFWorkbook cc = new XSSFWorkbook(bb);
		
		XSSFSheet sh = cc.getSheetAt(m);
		
		String out = sh.getRow(i).getCell(k).getStringCellValue();
		
		System.out.println(out);
		return out;
		
		}


}
