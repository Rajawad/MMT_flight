package DriverSetup;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dummy {
@Test
	public static void chromedriver() throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("disable-notifications");
		options.addArguments("disable-popup-blocking");
		
		options.addArguments("disable-notifications");
		options.addArguments("disable-popup-blocking");
		//options.addArguments("headless");
		options.addArguments("disable-blink-features-AutomationControlled");
		ChromeDriver driver = new ChromeDriver(options);
  
		driver.get("https://www.makemytrip.com/flights/");
		//Thread.sleep(3000);
//		WebElement from =driver.findElement(By.xpath("//div[@class=\\\"flt_fsw_inputBox searchCity inactiveWidget \\\"]"));
//		from.click();
//		from.sendKeys("Indore");
//		Select s=new Select(from);
//		s.selectByIndex(0);
		
		WebElement from =driver.findElement(By.xpath(""));
		from.click();
	}
}
