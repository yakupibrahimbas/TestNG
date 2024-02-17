package techproed.tests.Subat17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class C04 {
    public static String getProperty(String key) throws IOException {
        FileInputStream fis = new FileInputStream("configuration.properties");

        Properties properties = new Properties();

        properties.load(fis);

        properties.getProperty(key);
        return key;
    }
}
