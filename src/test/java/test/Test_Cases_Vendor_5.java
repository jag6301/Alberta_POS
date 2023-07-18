package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.Excel_Read;

public class Test_Cases_Vendor_5 extends Base_Test{
	
	@Test(priority = 1)
    public void login_banglore() throws IOException, InterruptedException {
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
	public void click_on_vendor() throws InterruptedException {
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		rr.v_vendor();
	}
///////////////////////////////////////////////////////////////////////////////////////	
	@Test(priority = 3)
	public void vendor_created() throws InterruptedException, IOException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String mm = Excel_Read.read(driver,1,1,0);
		rr.v_vendor_name(mm);
		
		String mmm = Excel_Read.read(driver,1,1,1);
		rr.v_first_name(mmm);
		
		String mmmm = Excel_Read.read(driver,1,1,2);
		rr.v_last_name(mmmm);
		
		
		
		
		
		
		Thread.sleep(2000);
        String aaaa = "ok";
		WebElement bbbb = driver.findElement(By.xpath("//*[@class='alert alert-success']"));
	    String cccc = bbbb.getText();
	    System.out.println(cccc);
	    SoftAssert sb = new SoftAssert();
	    sb.assertEquals(aaaa,cccc);
		
	    Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
//////////////////////////////////////////////////////////////////////////////////////	
	@Test(priority = 4)
	public void vendor_updated() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		rr.v_update();
		
		String aaaaa = "Vendor Updated Successfully";
		WebElement bbbbb = driver.findElement(By.xpath("//*[@class='alert alert-success']"));
	    String ccccc = bbbbb.getText();
	    System.out.println(ccccc);
	    SoftAssert sb = new SoftAssert();
	    sb.assertEquals(aaaaa,ccccc);
	    driver.navigate().refresh();
		
	    Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
//////////////////////////////////////////////////////////////////////////////////////	
	@Test(priority = 5)
	public void vendor_deleted() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		rr.v_delete();
		 SoftAssert sb = new SoftAssert();
		
		
	}
//////////////////////////////////////////////////////////////////////////////////////	
	

}
