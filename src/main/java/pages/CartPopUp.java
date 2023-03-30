package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CartPopUp {
    private Page page;
    private final Locator CART_POP_UP;
    private final Locator GO_TO_CART;

    public CartPopUp(Page page) {
        this.page = page;
        this.GO_TO_CART = page.locator("//a[@href='/basket']");
        this.CART_POP_UP = page.locator("//div[@aria-labelledby='dropdownBasket']");
    }

    public void cartPopupIsAvailable() {
        CART_POP_UP.isVisible();
    }

    public void clickGoToCart() {
        GO_TO_CART.isVisible();
        GO_TO_CART.click();
    }
}
