package steps;

import helpers.Data;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pages.HeaderPage;
import pages.HomePage;
import pages.LoginPage;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private HeaderPage headerPage;

    @Given("user opens the browser and navigates to SauceDemo website")
    public void openBrowser() {
        this.driver = new EdgeDriver();
        driver.get(Data.BASE_URL.getValue());
        driver.manage().window().maximize();
    }

    @When("user inputs username and password")
    public void userInputsUsernameAndPassword() {
        this.loginPage = new LoginPage(driver);
        loginPage.inputUsername();
        loginPage.inputPassword();
    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("the products title is displayed on the page")
    public void theProductsTitleIsDisplayedOnThePage() {
        this.homePage = new HomePage(driver);
        String actualTitle = homePage.getPageTitle();
        Assertions.assertEquals("Swag Labs", actualTitle);
    }

    @And("user clicks add bike light to cart")
    public void userClicksAddBikeLightToCart() {
        this.homePage = new HomePage(driver);
        homePage.clickAddBikeLightToCart();
    }

    @Then("number of products appears on cart button badge")
    public void numberOfProductsAppearsOnCartButtonBadge() {
        this.headerPage = new HeaderPage(driver);
        String badge = headerPage.getCartBadge();
        Assertions.assertEquals("1", badge);
    }

    @Then("colour of the cart button is displayed")
    public void colourOfTheCartButtonIsDisplayed() {
        this.homePage = new HomePage(driver);
        String colour = homePage.getCartButtonColour();
        Assertions.assertEquals("rgba(19, 35, 34, 1)", colour);
    }
}