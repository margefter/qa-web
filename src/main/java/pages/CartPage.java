package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CartPage {
    private Page page;
    private final Locator CART_TITLE;

    public CartPage(Page page) {
        this.page = page;
        this.CART_TITLE = page.locator("//div[text()='Cart']");

    }
    //todo update locator after fix of 500 on cart page
    public void cartPageOpens() {
        assertThat(CART_TITLE).hasText("Cart");
    }
}
