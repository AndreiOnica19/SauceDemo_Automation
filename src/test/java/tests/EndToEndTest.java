package tests;

import helpers.Data;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.LoginPage;
import pages.HomePage;
import pages.ProductPage;
import pages.HeaderPage;
import pages.CheckoutPage;
import pages.CartPage;

class EndToEndTest extends TestBase {

    @BeforeEach
    public void login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
    }

    @Test
    void BuyItemsTest() {
        HomePage homePage = new HomePage(driver);
        homePage.clickSauceLabsBikeLight();
        ProductPage productPage = new ProductPage(driver);
        productPage.clickAddToCartButton();
        productPage.clickBackToProductsButton();
        homePage.clickSauceLabsBackpack();
        productPage.clickAddToCartButton();
        HeaderPage headerPage = new HeaderPage(driver);
        headerPage.clickCartButton();
        CartPage cartPage = new CartPage(driver);
        cartPage.clickCheckoutButton();
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.inputFirstName();
        checkoutPage.inputLastName();
        checkoutPage.inputPostalCode();
        checkoutPage.clickContinueButton();
        checkoutPage.clickFinishButton();
        String value = checkoutPage.getTextFromSuccessMessage();
        Assertions.assertEquals(Data.SUCCESS_MESSAGE.getValue(), value);
        checkoutPage.clickBackToProductsButton();
    }
}