package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
    
	 
    @FindBy(xpath = "//*[@id='input_email']")
    WebElement user;
    
    @FindBy(id = "input-password")
    WebElement pass;
    
    @FindBy(xpath = "//*[text()='Login']")
    WebElement enter;
    
	WebDriver driver;
    public Login_Page(WebDriver driver) {
		// TODO Auto-generated constructor stub
       this.driver=driver;
       PageFactory.initElements(driver,this);
       
    }
	
    public void enterusername(String username) {
    	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    		
		user.sendKeys(username);
	}
	
    public void enterpassword(String password) {
    	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    		
		pass.sendKeys(password);
	}
    
    public void clickonlogin() {
    	 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    		
		enter.click();
	}
    


}
