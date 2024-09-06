package pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    Logger log = LogManager.getLogger(CartPage.class);

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#checkout")
    private WebElement checkoutButton;

    public void clickCheckoutButton() {
        checkoutButton.click();
        log.info("Checkout button clicked");
    }
}