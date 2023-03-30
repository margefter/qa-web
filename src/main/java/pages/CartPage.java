package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CartPage {
    private Page page;
    private final Locator CART_TITLE;

    public CartPage(Page page) {
        this.page = page;
        this.CART_TITLE = page.locator("//*[text()='Корзина']");

    }
    //todo update locator after fix of 500 on cart page
    public void cartPageOpens() {
        CART_TITLE.isVisible();
    }
}
