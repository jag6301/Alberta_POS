package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Items {
    WebDriver driver;
	public Items(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
	public void i_hover_on_item() throws InterruptedException {
	    WebElement ttt = driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul/li[5]/a"));
	    Actions act = new Actions(driver);
	    act.moveToElement(ttt).build().perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul/li[5]/ul/li[1]/a")).click();
	    Thread.sleep(2000);
	}
/////////////////////////////////////////////////////////////////////////////////////////////////////
	public void i_add_new() {
		
		driver.findElement(By.xpath("//*[@id=\"main_nav\"]/div[2]/a")).click();
	}
	public void i_sku(String sku) {
		WebElement ss = driver.findElement(By.xpath("//*[@id='input-sku']"));
		ss.sendKeys(sku);
	}
	public void i_item_name(String name) {
		WebElement ss = driver.findElement(By.xpath("//*[@id='input-sku']"));
		ss.sendKeys(name);
	}
	public void i_department() {
		driver.findElement(By.xpath("//*[@id='select2-dept_code-container']")).click();
		
		List<WebElement> gg = driver.findElements(By.xpath("//*[@id='select2-dept_code-container']//option[text()='Dept 101']"));
		for(WebElement vv:gg)
		{
			String kk = vv.getText();
			System.out.println(kk);
			
			if(kk.equalsIgnoreCase("Dept 101")) {
				vv.click();
			}
		}
	}
	
	

}
