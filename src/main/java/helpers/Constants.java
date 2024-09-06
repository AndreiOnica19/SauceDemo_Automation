package helpers;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Constants {
    public static final String USERNAME = FileHelper.getPropertyValue("username");
    public static final String PASSWORD = FileHelper.getPropertyValue("password");
    public static final String BACKPACK_TITLE = FileHelper.getPropertyValue("Sauce Labs Backpack");
}