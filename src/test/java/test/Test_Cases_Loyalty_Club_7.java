package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Cases_Loyalty_Club_7 extends Base_Test {
	
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
	public void click_on_loyalty() throws InterruptedException {
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    ttt.l_loyalty_club();
	    
	}
///////////////////////////////////////////////////////////////////////////////////////	
	@Test(priority = 3)
	public void loyalty_created() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ttt.l_addnew();
		
		Thread.sleep(2000);
        String aaaa = "Loyalty is successfully added";
		WebElement bbbb = driver.findElement(By.xpath("//*[text()='Loyalty is successfully added!']"));
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
	public void loyalty_club_assign_to_customer() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		ttt.club_assign_to_customer();
		
		Thread.sleep(2000);
        String aaaaa = "SELENIUM";
		WebElement bbbbb = driver.findElement(By.xpath("//*[text()='SELENIUM']"));
	    String ccccc = bbbbb.getText();
	    System.out.println(ccccc);
	    SoftAssert sb = new SoftAssert();
	    sb.assertEquals(aaaaa,ccccc);
		
	    Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
//////////////////////////////////////////////////////////////////////////////////////
@Test(priority = 5)
public void loyalty_updated() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    ttt.l_update();
    
    Thread.sleep(2000);
    String aaaaaa = "Record is successfully updated";
	WebElement bbbbbb = driver.findElement(By.xpath("//*[text()='Record is successfully updated']"));
    String cccccc = bbbbbb.getText();
    System.out.println(cccccc);
    SoftAssert sb = new SoftAssert();
    sb.assertEquals(aaaaaa,cccccc);
	
    Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);

}
///////////////////////////////////////////////////////////////////////////////////////
@Test(priority = 6)
public void loyalty_delete() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	ttt.l_delete();
	
	Thread.sleep(2000);
	driver.navigate().refresh();
	Thread.sleep(2000);
	 SoftAssert sb = new SoftAssert();
	 
	
}

}
