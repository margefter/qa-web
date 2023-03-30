package stepdefenitions;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;

public class MainPageSteps {
    MainPage mainPage = new MainPage(DriverFactory.getPage());


//    @And("cart is empty")
//    public void cartIsEmpty() {
//        mainPage.CartIsEmpty();
//    }

    @When("click on the cart icon")
    public void clickOnTheCartIcon() {
        mainPage.clickOnTheCartIcon();
    }

    @Then("{string} is visible near cart")
    public void isVisibleNearCart(String count) {
        mainPage.CountOfItemsInCart(count);
    }

    @When("add {string} non-promotional item to cart")
    public void addNonPromotionalItemToCart(String item) {
        mainPage.addNonPromotionalItemToCart(item);
    }

    @When("add {string} promotional item to cart")
    public void addPromotionalItemToCart(String item) {
        mainPage.addPromotionalItemToCart(item);
    }

    @When("add {string} items to cart")
    public void addItemsToCart(String item) {
        mainPage.addItemsToCart(item);
    }
}
