package stepdefenitions;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import pages.CartPage;

public class CartPageSteps {
    CartPage cartPage = new CartPage(DriverFactory.getPage());

    @Then("cart page opens")
    public void cartPageOpens() {
        cartPage.cartPageOpens();
    }
}
