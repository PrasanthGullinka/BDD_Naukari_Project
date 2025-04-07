package Utility_Common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfiqReader {

	public static Properties prop;
	
	public static void loadproperties() {
		try {	
		FileInputStream input=new FileInputStream("src/test/resources/Confiq.properties");
		prop=new Properties();
		prop.load(input);
		}
		catch(IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Failed to load Confiq file");
		}
	}

public static String getProperty(String key) {
    if (prop == null) {
    	loadproperties();
    }
    return prop.getProperty(key);
}
}
