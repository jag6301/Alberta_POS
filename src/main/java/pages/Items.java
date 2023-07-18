package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Items {
    WebDriver driver;
	public Items(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	
	

}
