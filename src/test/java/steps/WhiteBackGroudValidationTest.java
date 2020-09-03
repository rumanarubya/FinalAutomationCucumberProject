package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.WhiteBackGroundValidationPage;
import util.BrowserFactory;

public class WhiteBackGroudValidationTest {
	
	WebDriver driver;
	
	


	@Given("^user is able to login into sight$")
	public void user_is_able_to_login_into_sight() throws Throwable {
		driver = BrowserFactory.launchBrwser();
	}

	@When("^user will check the whitebackground button$")
	public void user_will_check_the_whitebackground_button() throws Throwable {
		WhiteBackGroundValidationPage whitebackground = PageFactory.initElements(driver, WhiteBackGroundValidationPage.class);
		whitebackground.whiteBackGround();
	  
	}

	@Then("^user will click on the whitebarckgroundbutton$")
	public void user_will_click_on_the_whitebarckgroundbutton() throws Throwable {
	   
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws Throwable {
	    
	}


	

}
