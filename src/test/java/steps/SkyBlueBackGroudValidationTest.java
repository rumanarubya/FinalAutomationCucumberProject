package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SkyBlueBackGroundValidationPage;
import util.BrowserFactory;

public class SkyBlueBackGroudValidationTest {
	
	WebDriver driver;

	@Given("^user should be able to login techfios site$")
	public void user_should_be_able_to_login_techfios_site() throws Throwable {
	    driver = BrowserFactory.launchBrwser();
	   
	}

	@When("^user will set SkyBlue Background button Exist$")
	public void user_will_set_SkyBlue_Background_button_Exist() throws Throwable {
		
		SkyBlueBackGroundValidationPage skyblue = PageFactory.initElements(driver, SkyBlueBackGroundValidationPage.class);
		skyblue.skyBlueBackGround();
	}

	@Then("^user will click on the button$")
	public void user_will_click_on_the_button() throws Throwable {
	   
	}

	@Then("^the background color will change to blue$")
	public void the_background_color_will_change_to_blue() throws Throwable {
	    	}


	
}
