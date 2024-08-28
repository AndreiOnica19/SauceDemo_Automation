package helpers;
import lombok.SneakyThrows;
import java.io.FileInputStream;
import java.util.Properties;

public class FileHelper {

    @SneakyThrows
    public static String getPropertyValue(String name) {
        Properties properties = new Properties();
        FileInputStream input = new FileInputStream("src/main/properties/credentials.properties");
        properties.load(input);
        return properties.getProperty(name);
    }
}