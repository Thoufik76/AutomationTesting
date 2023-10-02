package stepdefination;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sample extends BaseClass{
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		windowMaximize();
		
		FbLoginPojo f = new FbLoginPojo();
		passText("selenium", f.getEmail());
		passText("mom12", f.getPassword());
		clickBtn(f.getLoginBtn());
}

}
