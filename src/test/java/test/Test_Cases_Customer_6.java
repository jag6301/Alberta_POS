package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Cases_Customer_6 extends Base_Test {

	@Test(priority = 1)
    public void login_banglore_1() throws IOException, InterruptedException {
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		kk.enterusername("jagdeesh@albertapayments.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		kk.enterpassword("123456");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		kk.clickonlogin();
		
		String e = "Customer-Alberta | Dashboard";
		Thread.sleep(2000);
		String d = driver.getTitle();
		System.out.println(d);
		Thread.sleep(2000);
		SoftAssert sb = new SoftAssert();
		sb.assertEquals(e,d);
	}
///////////////////////////////////////////////////////////////////////////////////////	
	@Test(priority = 2)
	public void click_on_customer() throws InterruptedException {
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		tt.c_customer();
	}
///////////////////////////////////////////////////////////////////////////////////////	
	@Test(priority = 3)
	public void customer_created() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		tt.c_addnew();
		String aaaaaa = "customers created Successfully";
		WebElement bbbbbb = driver.findElement(By.xpath("//*[@class='alert alert-success']"));
	    String cccccc = bbbbbb.getText();
	    System.out.println(cccccc);
	    SoftAssert sb = new SoftAssert();
	    sb.assertEquals(aaaaaa,cccccc);
		
	    Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}
//////////////////////////////////////////////////////////////////////////////////////
	@Test(priority = 4)
	public void customer_updated() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		tt.c_update();
		
		String aaaaaaa = "Custom Successfully";
		WebElement bbbbbbb = driver.findElement(By.xpath("//*[@class='alert alert-success']"));
	    String ccccccc = bbbbbbb.getText();
	    System.out.println(ccccccc);
	    SoftAssert sb = new SoftAssert();
	    sb.assertEquals(aaaaaaa,ccccccc);
		
	    Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}
//////////////////////////////////////////////////////////////////////////////////////	
	@Test(priority = 5)
	public void customer_deleted() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		tt.c_delete();

		String aaaaaaaa = "Customer Deleted Successfully";
		WebElement bbbbbbbb = driver.findElement(By.xpath("//*[@class='alert alert-success']"));
	    String cccccccc = bbbbbbbb.getText();
	    System.out.println(cccccccc);
	    SoftAssert sb = new SoftAssert();
	    sb.assertEquals(aaaaaaaa,cccccccc);
		
	    Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
	}
//////////////////////////////////////////////////////////////////////////////////////
}
