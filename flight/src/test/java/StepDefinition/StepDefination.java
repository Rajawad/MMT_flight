package StepDefinition;


import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DriverSetup.DriverClass;

import Page.Pagefactoryflight;
import Page.S2Pagefac;
import Page.S3pagefac;
import Page.S4pagefac;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	static WebDriver driver;
	Pagefactoryflight obj;
	S2Pagefac s2;
	S3pagefac s3;
	S4pagefac s4;
	
//................................................................................................................................	
	/* 
	 * created by:RashidaJawadWala 
	 * Reviewed by:Akasha_KC
	 * Description: To validate one way option with search button 
*/
//.........................................StepDef-1.................................................................................
	
	@Given("User is on homepage")
	public void user_is_on_homepage() {
		driver=DriverClass.edgedriver();  
		 obj=new Pagefactoryflight(driver);
		// Alert al=driver.switchTo().alert();
			//al.dismiss();
		 s2=new S2Pagefac(driver);
		 s3=new S3pagefac(driver);
		 s4=new S4pagefac(driver);
	
	}
	
	
	@When("User enter value in  {string} ,{string},{string} and {string}")
	public void user_enter_value_in_and(String From, String to, String Departure, String TravellerClass) throws InterruptedException, AWTException {
		obj.Details(From, to);  
	}
	
	@And("click on search")
	public void click_on_search() {
	 	 obj.SearchFlight();
	}

	@Then("flights from source to destination")
	public void flights_from_source_to_destination() {
	  
		
		obj.Landingpage();
	}
	
/*-------------------------------------------------------------------------------------------------------------------------*/
	
	/* created by:RashidaJawadWala 
	 * Reviewed by:Akasha_KC
	 * Description: To validate Homestays & villa option
	 
.........................................StepDef-2.......................................................................	 */
//
	@When("User enter value in  {string} and {string}")
	public void user_enter_value_in_and(String string, String string2) throws InterruptedException, AWTException {
	
		obj.Details2(string, string2);
	}
	
	
	@Then("{string} message should be displayed")
	public void message_should_be_displayed(String string) {
	    
		obj.errormsg();	
	}

	
	@AfterStep
	public static void takeScreendown(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}
	
	
//........................................................................................................................
	/* created by:RashidaJawadWala 
	 * Reviewed by:Akasha_KC
	 * Description: To validate one way option with search button 

.................................................StepDef-3.........................................................................	 */
	
	
	@When("User enter value in  {string},{string} ,{string}, {string},{string}")
	public void user_enter_value_in(String string, String string2, String string3, String string4, String string5) throws InterruptedException, AWTException {
	   obj.Details3("indore");
	
	}
	
	
	@And("click searchbutton to get result")
	public void click_searchbutton_to_get_result() throws InterruptedException {
	    obj.Search_stay3();
	}

	
	@Then("search result should appear")
	public void search_result_should_appear() throws InterruptedException {
		 
		
		obj.result3();
        
	}
	@AfterStep
	public static void takeScreendown3(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}

	
//..........................................................................................................................
	/* created by:RashidaJawadWala 
	 * Reviewed by:Akasha_KC
	 * Description:  To validate search functionality 

................................................StepDef-4......................................................................*/	
	
	@When("User enter value in  from,to,return,guest,price")
	public void user_enter_value_in_from_to_return_guest_price() throws InterruptedException, AWTException {
	  
	    obj.Details3("mumbai");
	}

	@And("by clicking on search result appear")
	public void by_clicking_on_search_result_appear() throws InterruptedException, AWTException {
	
	 obj.Search_stay3();
	}
 

	@And("in searchbar user enters the near by location")
	public void in_searchbar_user_enters_the_near_by_location() throws InterruptedException, AWTException {
	    
	    obj.search_nearby_loc();
	    
	}
	@Then("result according to  search should be visible")
	public void result_according_to_search_should_be_visible() throws InterruptedException {
		obj.resultshould_appear();
	}
	
	@AfterStep
	public static void takeScreendown4(Scenario scenerio) {
		   TakesScreenshot ts= (TakesScreenshot) driver;
		   final byte[] src = ts.getScreenshotAs(OutputType.BYTES);
		   scenerio.attach(src, "image/png",scenerio.getName());
	}
	
//........................................................................................................................
	/* created by:RashidaJawadWala 
	 * Reviewed by:Akasha_KC
	 * Description: To validate invalid search functionality 
....................................................StepDef-5..................................................................*/	
	
	
	
	@When("User enter the invalid input in searchbar")
	public void user_enter_the_invalid_input_in_searchbar() throws InterruptedException, AWTException {
	    obj.Details3("bengalore");
	    obj.Search_stay4();
	    obj.invalid_value();
	   
	}

	@Then("error message should be displayed")
	public void error_message_should_be_displayed() throws InterruptedException {
	   obj.error_message();
	}
	
	
	
//........................................................................................................................
	/* created by:RashidaJawadWala 
	 * Reviewed by:Akasha_KC
	 * Description: To validate homeStayVilla option button 

.....................................................StepDef-6.................................................................*/	
	
	
	@When("User enter all the value")
	public void user_enter_all_the_value() throws InterruptedException, AWTException {
	   
		obj.Details3("jaipur");
	}

	@And("get on landing page")
	public void get_on_landing_page() throws InterruptedException {
	    obj.Search_stay3();
	}

	@And("click on homestayVilla option")
	public void click_on_homestay_villa_option() {
	    obj.click_on_homestay();
	}

	@Then("homepage should appear")
	public void homepage_should_appear() {
	   obj.homepage();
	}

	
	
	
	
	
	
	
	
}
