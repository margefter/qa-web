package stepdefenitions;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPopUp;

public class CartPopUpSteps {
    CartPopUp cartPopUp = new CartPopUp(DriverFactory.getPage());

    @Then("cart popup is available")
    public void cartPopupIsAvailable() {
        cartPopUp.cartPopupIsAvailable();
    }

    @When("click Перейти в корзину")
    public void clickGoToCart() {
        cartPopUp.clickGoToCart();
    }
}
