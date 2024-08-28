import org.junit.jupiter.api.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest{
    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername();
        loginPage.inputPassword();
        loginPage.clickLoginButton();
    }
}
