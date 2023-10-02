package stepdefination;

import org.base.BaseClass;
import org.junit.Test;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
@Before(order = 1)
//precondition
private void precondition2() {
launchBrowser();
System.out.println("launch the browser");
}
@Before(order = 2)
private void precondition1() {
windowMaximize();
System.out.println("maximize the window");
}
@Before(order = 3, value = " @Smoke")
private void precondition3() {
System.out.println("precondition3");
}

@After(order = 10, value = " @Smoke")
//postcondition
private void postcondition2() {
System.out.println("Take screenshot of scenarios");
}
@After(order = 4)
private void postcondition1() {
closeEntireBrowser();
System.out.println("close entire browser");
}
}
