package stepdefenitions;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageSteps {
    MainPage mainPage = new MainPage(DriverFactory.getPage());


    @And("cart is empty")
    public void cartIsEmpty() {
        mainPage.CartIsEmpty();
    }

    @When("click on the cart icon")
    public void clickOnTheCartIcon() {
        mainPage.clickOnTheCartIcon();
    }
}
