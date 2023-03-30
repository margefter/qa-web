package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CartPopUp {
    private Page page;
    private final Locator CART_POP_UP;
    private final Locator GO_TO_CART;
    private final Locator ITEM_NAME;
    private final Locator ITEM_COST;
    private final Locator TOTAL_AMOUNT;

    public CartPopUp(Page page) {
        this.page = page;
        this.GO_TO_CART = page.locator("//a[@href='/basket']");
        this.CART_POP_UP = page.locator("//div[@aria-labelledby='dropdownBasket']");
        this.ITEM_NAME = page.locator("//div[@aria-labelledby='dropdownBasket']//span[@class='basket-item-title']");
        this.ITEM_COST = page.locator("//div[@aria-labelledby='dropdownBasket']//span[@class='basket-item-price']");
        this.TOTAL_AMOUNT = page.locator("//div[@aria-labelledby='dropdownBasket']//span[@class='basket_price']");
    }

    public void cartPopupIsAvailable() {
        CART_POP_UP.isVisible();
    }

    public void clickGoToCart() {
        GO_TO_CART.isVisible();
        GO_TO_CART.click();
    }

    public void itemNameShouldBeVisible() {
        ITEM_NAME.isVisible();
    }
}
