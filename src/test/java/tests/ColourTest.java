package tests;

import helpers.Colours;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pages.HomePage;
import pages.LoginPage;

class ColourTest extends TestBase {

    @BeforeEach
    public void login() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
    }

    @Test
    void verifyAddToCartButtonColourTest() {
        HomePage homePage = new HomePage(driver);
        String actualColour = homePage.getCartButtonColour();
        String value = Colours.CART_BUTTON_COLOUR.getValue();
        Assertions.assertEquals(value, actualColour);
    }
}