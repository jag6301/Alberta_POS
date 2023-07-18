package utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.Base_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;


public class Scree extends Base_Test {
	
	
	static WebDriver driver;
	public Scree(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public static String captureScreenshotWithPath(String filename) throws IOException
	{
       //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));// Adjust the timeout as needed
        
        // Wait for an element on the page to be visible
       //wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("body")));

		
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		
//	String path = "F:\\Desktop\\VimanNagar\\16 Apr\\screenshots\\"+filename+".png";
	
//	String path = "F:\\Desktop\\VimanNagar\\May 21\\16 April Selenium Basics\\screenshot\\"+filename+".png";	
	
	String path  = System.getProperty("user.dir")+"\\Take\\"+filename+".png";
	
		File destination = new File(path);
			
		FileHandler.copy(source,destination);
		
		return path;
		
	}
	public static void captureScreenshot(WebDriver driver, String filename) throws IOException
	{
		TakesScreenshot scrshot = (TakesScreenshot)driver;
		
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		
//	String path = "F:\\Desktop\\VimanNagar\\16 Apr\\screenshots\\"+filename+".png";
	
//	String path = "F:\\Desktop\\VimanNagar\\May 21\\16 April Selenium Basics\\screenshot\\"+filename+".png";	
	
	String path  = System.getProperty("user.dir")+"\\screenshot\\"+filename+".png";
	
		File destination = new File(path);
			
		FileHandler.copy(source, destination);
	}
	
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Desktop\\VimanNagar\\16 Apr\\Selenium download\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		
		driver.get("https://www.facebook.com/signup");
		
		
	TakesScreenshot scrshot = (TakesScreenshot)driver;
		
	File source = scrshot.getScreenshotAs(OutputType.FILE);
	
	String path = "F:\\Desktop\\VimanNagar\\16 Apr\\screenshots\\facebook.png";
	
	File destination = new File(path);
		
	FileHandler.copy(source, destination);

	}
	
	
	
	
	

}
