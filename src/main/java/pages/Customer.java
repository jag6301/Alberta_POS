package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Customer {
    WebDriver driver;
	public Customer(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
//////////////////////////////////////////////////////////////////////////////////////////
public void c_customer() throws InterruptedException {
    WebElement ttt = driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul/li[3]/a"));
    Actions act = new Actions(driver);
    act.moveToElement(ttt).build().perform();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul/li[3]/ul/li[1]/a")).click();
    Thread.sleep(2000);
}
///////////////////////////////////////////////////////////////////////////////////////////
public void  c_addnew() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"main_nav\"]/div[2]/a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='vcustomername']")).sendKeys("SELENIUM CUSTOMER");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='vphone']")).sendKeys("9637011508");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='fa fa-save']")).click();
	Thread.sleep(2000);
}
///////////////////////////////////////////////////////////////////////////////////////////////
public void c_update() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"customer-row\"]/td[2]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@name='vfname']")).sendKeys("RAKESH");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='fa fa-save']")).click();
	Thread.sleep(2000);
}
//////////////////////////////////////////////////////////////////////////////////////////////
public void c_delete() throws InterruptedException {
	driver.findElement(By.xpath("(//*[@id='customer-row']//*[@name='selected[]'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='customer_delete']")).click();
	Thread.sleep(2000);
	

}
/////////////////////////////////////////////////////////////////////////////////////////////

}
