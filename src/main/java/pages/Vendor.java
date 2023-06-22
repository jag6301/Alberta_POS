package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vendor {
    WebDriver driver;
    
	
	public Vendor(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
        PageFactory.initElements(driver, this);
	    //wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	}

	public void vvvv() throws InterruptedException {
		WebElement ho = driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul/li[2]/a"));
		
		ho.click();
		
		Thread.sleep(2000);
		
		WebElement ko = driver.findElement(By.xpath("//*[@id=\"main_nav\"]/div/a"));
		
		ko.click();
		
		Thread.sleep(2000);
		
		WebElement jo = driver.findElement(By.xpath("//*[@id='input_vendor_name']"));
		
		jo.sendKeys("SELENIUM VENDOR");
		
		Thread.sleep(2000);
		
		WebElement ok = driver.findElement(By.xpath("//*[@id='form-vendor']"));
		
		ok.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"vendor-row1\"]/td[3]/a")).click();
		
		Thread.sleep(2000);
		
		WebElement oj = driver.findElement(By.xpath("//*[@id='input-phone']"));
		
		oj.sendKeys("9637011508");

		Thread.sleep(2000);
		
        WebElement ook = driver.findElement(By.xpath("//*[@class='fa fa-save']"));
		
		ook.click();
		
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//*[@id='vendor-row1']//*[@name='selected[]']")).click();
	  //*[@id='selectAll']
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//*[@id='vender_delete']")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.switchTo().alert().accept();
	    //driver.findElement(By.xpath("(//*[@type='button'])[1]")).click();
	    
	    Thread.sleep(5000);
	    
	    
		
		
		
	}
	
	

}
