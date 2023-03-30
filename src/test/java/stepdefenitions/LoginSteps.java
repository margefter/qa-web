package stepdefenitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage = new LoginPage(DriverFactory.getPage());

    @Given("the user is authorized in the system")
    public void theUserIsAuthorizedInTheSystem() {

    }

    @Given("the user is authorized on the {string} with {string} and {string}")
    public void theUserIsAuthorizedOnTheWithAnd(String arg0, String arg1, String arg2) {
        loginPage.Authorization(arg0, arg1, arg2);
    }
}
