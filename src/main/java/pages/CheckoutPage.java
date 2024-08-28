package pages;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {
    Logger log = LogManager.getLogger(CheckoutPage.class);

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#first-name")
    WebElement firstNameField;

    @FindBy(css = "#last-name")
    WebElement lastNameField;

    @FindBy(css = "#postal-code")
    WebElement postalCodeField;

    @FindBy(css = "#continue")
    WebElement continueButton;

    @FindBy(css = "#finish")
    WebElement finishButton;

    @FindBy(css = "#back-to-products")
    WebElement backToProductsButton;

    @FindBy(css = ".complete-header")
    WebElement thankYouMessage;

    public void inputFirstName() {
        firstNameField.sendKeys("Onica");
        log.info("{} entered in First Name field", "Onica");
    }

    public void inputLastName() {
        lastNameField.sendKeys("Andrei");
        log.info("{} entered in Last Name field", "Andrei");

    }

    public void inputPostalCode() {
        postalCodeField.sendKeys("123456");
        log.info("{} entered in Postal Code field", "123456");
    }

    public void clickContinueButton() {
        continueButton.click();
        log.info("{} clicked continue", "Continue");
    }

    public void clickFinishButton() {
        finishButton.click();
        log.info("{} clicked finish", "Finish");
    }

    public void clickBackToProductsButton() {
        backToProductsButton.click();
        log.info("{} clicked back to products", "Back to products");
    }

    public String getTextFromSuccessMessage() {
        return thankYouMessage.getText();
    }
}