package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Cases_Login_4 extends Base_Test{
	
	@Test(priority = 1)

	public void login_with_valid_4_credential() throws IOException, InterruptedException {
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		kk.enterusername("jagdeesh@albertapayments.com");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		kk.enterpassword("123456");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		kk.clickonlogin();
		  
		String e = "nice to good";
		Thread.sleep(2000);
		String d = driver.getTitle();
		System.out.println(d);
		Thread.sleep(2000);
		 SoftAssert sb = new SoftAssert();
		    
		    sb.assertEquals(e,d);
		    //Customer-Alberta | Dashboard
		    
		   
	}

}
