package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Vendor;
import pages.Login_Page;
import utility.Excel_Read;

public class Base_Test   {
	Excel_Read good;
	WebDriver driver;
	Login_Page kk;
	Vendor rr;
	@BeforeSuite
	public void browser() throws InterruptedException   {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://customer.albertapayments.com/");
        Thread.sleep(3000)	;
		
	
	}
	@BeforeClass
    public void object() {
	    kk = new Login_Page(driver);
	    
	    good = new Excel_Read(driver);
	    
	    rr = new Vendor(driver);
	}
	@AfterSuite
	public void closebrowser() {
		driver.quit();
	}
	
}
