package students.Yasmin.Aydin.Utils;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileReader {

    private static Properties configfile;

    static {
        try {
            FileInputStream fileInputStream = new FileInputStream("configuration.properties");
            configfile = new Properties();
            configfile.load(fileInputStream);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getProperties(String browser) {

        return browser;
    }
}

