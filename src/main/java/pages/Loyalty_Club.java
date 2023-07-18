package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Loyalty_Club {
    WebDriver driver;
	public Loyalty_Club(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
        PageFactory.initElements(driver, this);
	}
//////////////////////////////////////////////////////////////////////////////////////////
public void l_loyalty_club() throws InterruptedException {
	 WebElement ttt = driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul/li[3]/a"));
	    Actions act = new Actions(driver);
	    act.moveToElement(ttt).build().perform();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"main_nav\"]/ul/li[3]/ul/li[2]/a")).click();
	    Thread.sleep(2000);
}
///////////////////////////////////////////////////////////////////////////////////////////
public void  l_addnew() throws InterruptedException {
	driver.findElement(By.xpath("//*[@id=\"main_nav\"]/div[2]/a[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='ilname']")).sendKeys("SELENIUM");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='iedate']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[6]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[text()='SET UP']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='select_dept']")).click();
	Thread.sleep(2000);
	List<WebElement> gg = driver.findElements(By.xpath("//*[@id='select_dept']//option[text()='Dept 101']"));
	for(WebElement vv:gg)
	{
		String ss = vv.getText();
		System.out.println(ss);
		
		if(ss.equalsIgnoreCase("Dept 101")) {
			vv.click();
		}
	}
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//*[@id='select_category']")).click();
	Thread.sleep(2000);
	List<WebElement> ggg = driver.findElements(By.xpath("//*[@id='select_category']//option[text()='Cat 101']"));
	for(WebElement vvv:ggg)
	{
		String sss = vvv.getText();
		System.out.println(sss);
		
	    if(sss.equalsIgnoreCase("Cat 101")) {
			vvv.click();
		}
	}
   
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='select_sub_category']")).click();
	List<WebElement> gggg=driver.findElements(By.xpath("//*[@id='select_sub_category']//option[text()='sub cat 101']"));
	for(WebElement vvvv:gggg)
	{
		String ssss = vvvv.getText();
		System.out.println(ssss);
		if(ssss.equalsIgnoreCase("sub cat 101")) {
			vvvv.click();
		}
	}
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='c_checkbox' and @value='2']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='form-control promo-fields number ioval3']")).sendKeys("10");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[text()='SAVE'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[text()='close']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[text()='SAVE'])[1]")).click();
	Thread.sleep(2000);
}
///////////////////////////////////////////////////////////////////////////////////////////////
public void club_assign_to_customer() throws InterruptedException {
	Customer cus = new Customer(driver);
	cus.c_customer();
	cus.c_addnew();
	driver.findElement(By.xpath("//*[@id=\"customer-row\"]/td[2]/a")).click();
	Thread.sleep(2000);
	
	List<WebElement> ggggg = driver.findElements(By.xpath("//*[@id='loyalty_club']//option[text()='SELENIUM']"));
	for(WebElement vvvvv:ggggg)
	{
		String sssss = vvvvv.getText();
		System.out.println(sssss);
		
		if(sssss.equalsIgnoreCase("SELENIUM")) {
			vvvvv.click();
		}
		List<WebElement> gggggg = driver.findElements(By.xpath("//*[@id='expiry_date']//option[text()='45 Days']"));
		for(WebElement vvvvvv:gggggg)
		{
			String ssssss = vvvvvv.getText();
			System.out.println(ssssss);
			
			if(ssssss.equalsIgnoreCase("45 Days")) {
				vvvvvv.click();
			}
	 driver.findElement(By.xpath("//*[text()='Add']")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//*[@type='submit']")).click();
	 Thread.sleep(2000);
	 
	 
		}}
}
//////////////////////////////////////////////////////////////////////////////////////////////
public void l_update() throws InterruptedException {
	Customer cus = new Customer(driver);
	cus.c_customer();
	
	Thread.sleep(2000);
	cus.c_customer();
	Thread.sleep(2000);

	Loyalty_Club clu = new Loyalty_Club(driver);
	clu.l_loyalty_club();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"customer-row\"]/td[2]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='allow_points']//option[text()='YES']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[text()='SAVE'])[1]")).click();
	Thread.sleep(2000);
}

/////////////////////////////////////////////////////////////////////////////////////////////
public void l_delete() throws InterruptedException {
	Loyalty_Club clu = new Loyalty_Club(driver);
	clu.l_loyalty_club();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//*[@id='customer-row']//*[@name='sloyalty[]'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='employee_delete']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[text()='yes']")).click();
	Thread.sleep(2000);

}
}
