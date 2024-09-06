package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    Logger log = LogManager.getLogger(HomePage.class);

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#shopping_cart_container")
    private WebElement cartButton;

    @FindBy(css = "#item_0_title_link")
    private WebElement sauceLabsBikeLight;

    @FindBy(css = "#item_4_title_link")
    private WebElement sauceLabsBackpack;

    @FindBy(css = "#add-to-cart-sauce-labs-bike-light")
    private WebElement sauceLabsBikeLightAddToCartButton;

    public String getCartButtonColour() {
        log.info("Get cart button colour {}", cartButton.getCssValue("color"));
        return cartButton.getCssValue("color");
    }

    public void clickSauceLabsBikeLight() {
        sauceLabsBikeLight.click();
        log.info("Sauce Labs Bike Light clicked");
    }

    public void clickSauceLabsBackpack() {
        sauceLabsBackpack.click();
        log.info("Sauce Labs Backpack clicked");
    }

    public String getPageTitle() {
        log.info("Get page title {}", "Products");
        return driver.getTitle();
    }

    public void clickAddBikeLightToCart() {
        sauceLabsBikeLightAddToCartButton.click();
        log.info("Click add bike light to cart button");
    }

    public String getSauceLabsBackpackTitle() {
        return sauceLabsBackpack.getText();
    }
}