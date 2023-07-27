package org.envision.seleniumTestngFeatures.commonUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

    public static String getPropFile(String fileName, String Key) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Ali\\base\\testdatafiles\\input1.properties");
        Properties p = new Properties();
        p.load(fis);
        return p.getProperty(Key);

    }
}
