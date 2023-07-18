package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Cases_Login_1 extends Base_Test {
	@Test(priority = 1)
	
	public void login_with_invalid1_1_credential() throws IOException {
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		kk.enterusername("jagdeesh@gmail.com");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		kk.enterpassword("123456");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		kk.clickonlogin();
		String a = "These credentials do not match our records.";
		
	    WebElement b = driver.findElement(By.xpath("//*[@class='alert alert-danger']"));
	    
	    String c = b.getText();
	    
	    System.out.println(c);
	    
	    SoftAssert sb = new SoftAssert();
	    
	    sb.assertEquals(a,c);
	    
	    
	    
	  
		
	}
	

	

   
	
	

}
