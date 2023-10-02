package stepdefination;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass {
//1.Non parameterized constructor
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
	}

	// 2.private webElements
	@FindBy(id = "email")
	private WebElement email;

	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement password;

	@FindBy(name = "login")
	private WebElement loginBtn;

	// 3.Getters to access webElements outside the class

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
}
