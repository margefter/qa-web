package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class MainPage {
    private Page page;
    private final Locator CART_ICON;
    private final Locator CART_COUNT;
    private final Locator NON_PROMOTIONAL_ITEM;
    private final Locator PROMOTIONAL_ITEM;
    private final Locator ADD_PROMOTIONAL_ITEM;
    private final Locator ADD_NON_PROMOTIONAL_ITEM;


    public MainPage(Page page) {
        this.page = page;
        this.CART_ICON = page.locator("a#dropdownBasket i");
        this.CART_COUNT = page.locator("//li[@id='basketContainer']/span");
        this.NON_PROMOTIONAL_ITEM = page.locator("//div[@data-product='2']");
        this.PROMOTIONAL_ITEM = page.locator("//div[@data-product='1']");
        this.ADD_PROMOTIONAL_ITEM = page.locator("//div[@data-product='1']//button");
        this.ADD_NON_PROMOTIONAL_ITEM = page.locator("//div[@data-product='2']//button");
    }

    public void clickOnTheCartIcon() {
        CART_ICON.isVisible();
        CART_ICON.click();
    }

    public void CountOfItemsInCart(String count) {
        CART_COUNT.isVisible();
        assertThat(CART_COUNT).hasText(count);
    }

    public void addNonPromotionalItemToCart(String item) {
        NON_PROMOTIONAL_ITEM.isVisible();
        ADD_NON_PROMOTIONAL_ITEM.click();
    }

    public void addPromotionalItemToCart(String item) {
        for(int i = 0; i < Integer.valueOf(item); i++) {
            PROMOTIONAL_ITEM.isVisible();
            ADD_PROMOTIONAL_ITEM.click();
        }
    }
}