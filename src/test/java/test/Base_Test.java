package test;

import java.io.IOException;
import java.lang.StackWalker.Option;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import listener.Test_Listener;
import pages.Vendor;
import pages.Customer;
import pages.Items;
import pages.Login_Page;
import pages.Loyalty_Club;
import utility.Excel_Read;

import utility.Read_Property;
import utility.Scree;

public class Base_Test   {
	Excel_Read good;
	protected WebDriver driver;
	Login_Page kk;
	Vendor rr;
	Customer tt;
	Loyalty_Club ttt;
	Test_Listener te;
	Scree sc;
	Items www;
	@BeforeSuite
	public void browser() throws IOException, InterruptedException   {
		
        WebDriverManager.chromedriver().setup();
        
       // chrome_options = webdriver.ChromeOptions();
        		//chrome_options.add_argument("--headless")  # Run Chrome in headless mode
        		//chrome_options.add_argument("--window-size=1920x1080")  # Set window size

        		//# Initialize Chrome driver
        		//driver = webdriver.Chrome(chrome_options=chrome_options)
		
		         ChromeOptions options = new ChromeOptions();
        		
        		//options.addArguments("--headless");
        		options.addArguments("--remote-allow-origins=*");
        		//options.addArguments("--window-size=1920x1080");
        		//options.addArguments("--disable-web-security");
        		//options.addArguments("--allow-running-insecure-content");
		
		//options.addArguments("--disable-notifications");
		
//		options.addArguments("--incognito");
		
		//options.addArguments("--start-maximized");
		
//		options.addArguments("--headless");
		
		 driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get(Read_Property.getPropData("productionurl"));
        Thread.sleep(3000)	;
		
	
	}
	@BeforeClass
    public void object() {
	    kk = new Login_Page(driver);
	    
	    good = new Excel_Read(driver);
	    
	    rr = new Vendor(driver);
	    
	    tt = new Customer(driver);
	    
	    ttt = new Loyalty_Club(driver);
	    
        www = new Items(driver);
	    
	    sc = new Scree(driver);
	}
	@AfterSuite
	public void closebrowser() {
		driver.quit();
	}
	
}
