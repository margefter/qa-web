package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class MainPage {
    private Page page;
    private final Locator CART_ICON;
    private final Locator CART_COUNT;

    public MainPage(Page page) {
        this.page = page;
        this.CART_ICON = page.locator("a#dropdownBasket i");
        this.CART_COUNT = page.locator("//li[@id='basketContainer']/span");
    }

    public void CartIsEmpty() {
        CART_COUNT.isVisible();
        assertThat(CART_COUNT).hasText("0");
    }

    public void clickOnTheCartIcon() {
        CART_ICON.isVisible();
        CART_ICON.click();
    }
}