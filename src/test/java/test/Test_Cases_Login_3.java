package test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Cases_Login_3 extends Base_Test{
	
	@Test(priority = 1)
	
	public void login_with_invalid_3_credential() throws IOException {
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		kk.enterusername("jagdeesh@alberta.com");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		kk.enterpassword("654321");
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		kk.clickonlogin();
        String aaa = "These credentials do not match our records.";
		
	    WebElement bbb = driver.findElement(By.xpath("//*[@class='alert alert-danger']"));
	    
	    String ccc = bbb.getText();
	    
	    System.out.println(ccc);
	    
	    SoftAssert sb = new SoftAssert();
	    
	    sb.assertEquals(aaa,ccc);
	    
	   
}

}
