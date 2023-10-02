package stepdefination;

import org.base.BaseClass;
import org.sam.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass {
	FbLoginPojo f;
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
		launchBrowser();
		windowMaximize();
	  }

	@When("To launch the url of the facebook application")
	public void to_launch_the_url_of_the_facebook_application() {
	    launchUrl("https://www.facebook.com/");
	}

	@When("To pass valid username in username field")
	public void to_pass_valid_username_in_username_field() {
		 f = new FbLoginPojo();
		passText("th@gmail.com", f.getEmail());
	   
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
	    f = new FbLoginPojo();
	   passText("", f.getPassword());
	}

	@When("To click login button")
	public void to_click_login_button() {
		f = new FbLoginPojo();
		clickBtn(f.getLoginBtn());
	   
	}

	@When("To check whether navigate to homepage or not")
	public void to_check_whether_navigate_to_homepage_or_not() {
		System.out.println("To check your login credetials");
	 
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	    
	}

}
