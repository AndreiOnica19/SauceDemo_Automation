import helpers.Data;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import pages.LoginPage;

public class BaseTest {
    WebDriver driver;

    @BeforeEach
    public void setUp() {
        this.driver = new EdgeDriver();
        driver.get(Data.BASE_URL.getValue());
        driver.manage().window().maximize();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}