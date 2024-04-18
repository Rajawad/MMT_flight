package DriverSetup;


import org.openqa.selenium.Alert;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;



public class DriverClass {
	public static WebDriver driver;
	public static ChromeOptions options;
	public static EdgeOptions Eoptions;
	
	//DO NOT CHANGE THE CODE TO CREATE DRIVER 
	
	public static WebDriver chromedriver() {
		WebDriverManager.chromedriver().setup();
		options=new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("disable-notifications");
		options.addArguments("disable-popup-blocking");
		
//	options.addArguments("disable-notifications");
	//	options.addArguments("disable-popup-blocking");
		//options.addArguments("headless");
		//options.addArguments("disable-blink-features-AutomationControlled");
		driver = new ChromeDriver(options);

		//driver.get("https://www.makemytrip.com/flights/");
		//Alert al=driver.switchTo().alert();
		//al.dismiss();
		return driver;
	}
	
	
	
	
	public static WebDriver edgedriver() {
		   WebDriverManager.edgedriver().setup();
		   Eoptions= new EdgeOptions();
		   
		   Eoptions.addArguments("--start-maximized");
		   Eoptions.addArguments("disable-notifications");
		   Eoptions.addArguments("disable-popup-blocking");
	//	   Eoptions.addArguments("--headless");
		   Eoptions.addArguments("disable-blink-features-AutomationControlled");
			driver = new EdgeDriver(Eoptions);
			 driver.get("https://www.makemytrip.com/flights/");
		   return driver;
	   }




}
