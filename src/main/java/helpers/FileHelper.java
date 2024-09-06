package helpers;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.util.Properties;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FileHelper {

    @SneakyThrows
    public static String getPropertyValue(String name) {
        Properties properties = new Properties();
        try (FileInputStream input = new FileInputStream("src/main/properties/credentials.properties")) {
            properties.load(input);
            return properties.getProperty(name);
        }
    }
}