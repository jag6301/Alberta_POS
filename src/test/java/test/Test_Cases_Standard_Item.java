package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import utility.Excel_Read;

public class Test_Cases_Standard_Item extends Base_Test{
	
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
	public void click_on_items() throws InterruptedException {
	    www.i_hover_on_item();
	}
///////////////////////////////////////////////////////////////////////////////////////	
	@Test(priority = 3)
	public void standard_item_created() throws InterruptedException, IOException {
		
		www.i_add_new();
		
		www.i_sku("992265");
		
		www.i_item_name("STD");
		
		www.i_department();
		
		
		
		
		
		
	
		
	   
	}
//////////////////////////////////////////////////////////////////////////////////////	
	@Test(priority = 4)
	public void standard_item_updated() throws InterruptedException {
		
	}
//////////////////////////////////////////////////////////////////////////////////////	
	@Test(priority = 5)
	public void standard_item_deleted() throws InterruptedException {
	
		
	}
//////////////////////////////////////////////////////////////////////////////////////	
	

}
