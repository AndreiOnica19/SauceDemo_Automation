package pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {
    Logger log = LogManager.getLogger(this.getClass().getName());

    @FindBy(css = "#user-name")
    WebElement usernameField;

    @FindBy(css = "#password")
    WebElement passwordField;

    @FindBy(css = "#login-button")
    WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void inputUsername() {
        usernameField.sendKeys("standard_user");
        log.info("Username entered");
    }

    public void inputPassword() {
        passwordField.sendKeys("secret_sauce");
        log.info("Password entered");
    }

    public void clickLoginButton() {
        loginButton.click();
        log.info("Login button clicked");
    }
}