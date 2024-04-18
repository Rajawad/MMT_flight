package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class S4pagefac {

	WebDriver driver;
	
	
	@FindBy(xpath="//a[@href=\"https://www.makemytrip.com/homestays/\"]")
	WebElement homestays_villas;
	
	@FindBy(xpath="//div[@class=\"hsw_inner\"]/child::div[@class=\"hsw_inputBox selectHtlCity\"]")
	WebElement from1;

	@FindBy(xpath="//div[@class=\"hw__searchInputWrapper\"]/child::input")
	WebElement frominput1;
	
	
	
	@FindBy(xpath="//div[@data-cy=\"HomeStaysSearchWidget_300\"]/label/input[@id=\"checkin\"]")
	WebElement checkin1;
	
	
	@FindBy(xpath="//div[@data-cy=\"HomeStaysSearchWidget_300\"]/label/input[@data-cy=\"checkin\"]")
	WebElement checkout1;
	

	
	@FindBy (xpath="//button[@type=\"button\"]")
    WebElement apply1;
	
	@FindBy (id="RECOMMENDED_HOTELS")
    WebElement result1;
	
	@FindBy(xpath="//div[@class=\"hsw vpsw hswNew\"]/child::p[@class=\"makeFlex vrtlCenter appendTop15\"]/child::button[@id=\"hsw_search_button\"]")
	WebElement search2;
	
	
	@FindBy(xpath="//input[@placeholder=\"Search for locality / hotel name\"]")
	WebElement nearbysearch;

	
	@FindBy(xpath="//input[@placeholder=\"Search for locality / hotel name\"]")
	WebElement nearbysearchvalue;
	
	
	
	
	@FindBy(xpath="//h1[contains(text(),\"108 Properties in Chaityabhoomi, Mumbai\")]")
	WebElement searchresult4;
	
	//p[@class="apldFltr__item--text"]

	public S4pagefac(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
public void Details1() throws InterruptedException, AWTException {
		
		
		homestays_villas.click();
		
		from1.click();
			Thread.sleep(3000);
		frominput1.sendKeys("mumbai");
		
			Thread.sleep(3000);
			   Robot r=new Robot();
		       r.keyPress(KeyEvent.VK_DOWN);
		       Thread.sleep(3000);
	
		       r.keyPress(KeyEvent.VK_ENTER);
		       Thread.sleep(3000);

	         checkin1.click();
		
		
		
	  	JavascriptExecutor js = (JavascriptExecutor)driver;
    	js.executeScript("window.scrollBy(0,200)");
    	Thread.sleep(1000);
    	
    	
       	WebElement selectDate = driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\" and text()=\"26\" and @tabindex=\"-1\" and @role=\"gridcell\" and @aria-label=\"Fri Apr 26 2024\"]"));
       	selectDate.click();
       	
       		Thread.sleep(1000);		

       	
       	WebElement checkout= driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\" and text()=\"3\"]"));
       	checkout.click();
       	
       		Thread.sleep(1000);	
       	
       	
      
       	apply1.click();
       

	}
     

public void Search_stay1() throws InterruptedException {
 	
	 
	 search2.click();
	}	
     
    
      
      
      public void search_nearby_loc() throws InterruptedException, AWTException {
    	  nearbysearch.click();
    	  nearbysearch.sendKeys("chaitanya");
    	  Thread.sleep(3000);
		   Robot r=new Robot();
	       r.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(3000);

	       r.keyPress(KeyEvent.VK_ENTER);
	       Thread.sleep(3000);
	       
		
      }
      
      public void resultshould_appear() throws InterruptedException {
    	  System.out.println("assertwait");
    	  String msg="Chaityabhoomi, Mumbai";
    	 String actualmsg=searchresult4.getText();
 		 Assert.assertTrue(searchresult4.getText().contains(msg));
 		 System.out.println("assert");
      }
      
      

}










