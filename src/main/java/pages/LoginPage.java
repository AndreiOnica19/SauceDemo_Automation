package pages;
import helpers.Constants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

    Logger log = LogManager.getLogger(this.getClass().getName());

    @FindBy(css = "#user-name")
    private WebElement usernameField;

    @FindBy(css = "#password")
    private WebElement passwordField;

    @FindBy(css = "#login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputUsername() {
        usernameField.sendKeys(Constants.USERNAME);
        log.info("Username entered");
    }

    public void inputPassword() {
        passwordField.sendKeys(Constants.PASSWORD);
        log.info("Password entered");
    }

    public void clickLoginButton() {
        loginButton.click();
        log.info("Login button clicked");
    }
}