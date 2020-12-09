package stepDefinitions;

import cucumber.api.java.en.When;

public class LoginPage extends BasePage {

	//@When("^User opens browser$")
	public void user_opens_browser(String browserName) throws Throwable {
		try {
			openBrowser(browserName);
		} catch (Exception e) {
			e.getMessage();
		}
		try {
			navigateToUrl();
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
