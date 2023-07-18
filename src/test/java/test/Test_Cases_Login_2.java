package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Cases_Login_2 extends Base_Test{
	
@Test(priority = 1)
	
	public void login_with_invalid_2_credential() throws IOException {
	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		kk.enterusername("Jagdeesh@albertapayments.com");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        kk.enterpassword("654321");
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		kk.clickonlogin();
String aa = "These credentials do not match our records.";
		
	    WebElement bb = driver.findElement(By.xpath("//*[@class='alert alert-danger']"));
	    
	    String cc = bb.getText();
	    
	    System.out.println(cc);
	    
	    SoftAssert sb = new SoftAssert();
	    
	    sb.assertEquals(aa,cc);
	    
	    
	    
	    
	}

}
