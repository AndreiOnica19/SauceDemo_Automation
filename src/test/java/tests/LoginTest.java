package tests;

import helpers.Constants;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import pages.HomePage;
import pages.LoginPage;

class LoginTest extends TestBase {

    @Test
    void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
        HomePage homePage = new HomePage(driver);
        String value = homePage.getSauceLabsBackpackTitle();
        Assertions.assertEquals(Constants.BACKPACK_TITLE, value);
    }
}