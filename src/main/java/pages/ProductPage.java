package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ProductPage extends BasePage {
    Logger log = LogManager.getLogger(this.getClass().getName());

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#add-to-cart")
    WebElement addToCartButton;

    @FindBy(css = "#back-to-products")
    WebElement backToProductsButton;

    public void clickAddToCartButton() {
        addToCartButton.click();
        log.info("Clicked on Add To Cart");
    }

    public void clickBackToProductsButton() {
        backToProductsButton.click();
        log.info("Clicked on Back To Products");
    }
}