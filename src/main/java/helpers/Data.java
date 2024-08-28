package helpers;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Data {
    BASE_URL("https://www.saucedemo.com/"),
    SUCCESS_MESSAGE("Thank you for your order!");

    private final String value;
}