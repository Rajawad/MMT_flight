package Page;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class S2Pagefac {
	private WebDriver driver;
	
	@FindBy(xpath="//div[@class=\"flt_fsw_inputBox searchCity inactiveWidget \"]")
	WebElement from;
	
	@FindBy(xpath="//div[@class=\"autoSuggestPlugin hsw_autocomplePopup\"]/child::div/input")
	WebElement fromInput;
	
	@FindBy(xpath="//div[@class=\"flt_fsw_inputBox searchToCity inactiveWidget \"]")
	WebElement to;
	
	@FindBy(xpath="//div[@class=\"autoSuggestPlugin hsw_autocomplePopup makeFlex column spaceBetween\"]/child::div/input")
	WebElement toInput;

	@FindBy(xpath="//div[@class=\"fltErrorSection makeFlex\"]")
	WebElement errormsg;
	
	public S2Pagefac(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void Details1(String from1 , String To) throws InterruptedException, AWTException {
		
		Thread.sleep(3000);
		from.click();
		Thread.sleep(3000);
		fromInput.sendKeys(from1);
		Thread.sleep(3000);
		   Robot r=new Robot();
	       r.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(3000);

	       r.keyPress(KeyEvent.VK_ENTER);
	       Thread.sleep(3000);
		to.click();
		Thread.sleep(3000);
		toInput.sendKeys(To);
		
	       r.keyPress(KeyEvent.VK_DOWN);
	       Thread.sleep(5000);
	       r.keyPress(KeyEvent.VK_ENTER);
	       Thread.sleep(3000);
	     
	
	
	}
	public void errormsg() {
		 String msg="From & To airports cannot be the same";
		 Assert.assertTrue(errormsg.getText().contains(msg));

	}
	
	

}
