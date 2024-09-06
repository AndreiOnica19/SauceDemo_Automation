package pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HeaderPage extends BasePage {

    Logger log = LogManager.getLogger(this.getClass().getName());

    public HeaderPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#shopping_cart_container")
    private WebElement cartButton;

    @FindBy(css = ".shopping_cart_badge")
    private WebElement badge;

    public void  clickCartButton() {
        cartButton.click();
        log.info("Clicked cart button");
    }

    public String getCartBadge() {
        log.info("Getting cart badge {}",badge.getText());
        return badge.getText();
    }
}