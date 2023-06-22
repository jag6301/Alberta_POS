package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class Excel_Read {
	
   public Excel_Read(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

public String read(int i,int k) throws IOException {
		
		String path = System.getProperty("user.dir")+"\\Excel_Sheet\\Books1.xlsx";
		
		File aa = new File(path);
		
		FileInputStream bb = new FileInputStream(aa);
		
		XSSFWorkbook cc = new XSSFWorkbook(bb);
		
		XSSFSheet sh = cc.getSheetAt(0);
		
		String out = sh.getRow(i).getCell(k).getStringCellValue();
		
		System.out.println(out);
		return out;
		
		}


}
