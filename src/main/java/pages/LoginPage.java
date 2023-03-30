package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import utils.WebActions;

public class LoginPage {
    private Page page;
    private final Locator USERNAME_INPUT;
    private final Locator PASSWORD_INPUT;
    private final Locator LOGIN_BUTTON;

    public LoginPage(Page page) {
        this.page = page;
        this.USERNAME_INPUT = page.locator("//input[@id='loginform-username']");
        this.PASSWORD_INPUT = page.locator("//input[@id='loginform-password']");
        this.LOGIN_BUTTON = page.locator("//button[@name = 'login-button']");
    }

    public void Authorization(String url, String username, String password) {
        this.page.navigate(WebActions.getProperty(url));
        USERNAME_INPUT.fill(WebActions.getProperty(username));
        PASSWORD_INPUT.fill(WebActions.getProperty(password));
        LOGIN_BUTTON.click();
    }

}
