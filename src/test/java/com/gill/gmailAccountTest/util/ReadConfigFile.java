package com.gill.gmailAccountTest.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadConfigFile {

	protected static Properties properties = null;
	protected InputStream fis = ReadConfigFile.class.getClassLoader()
			.getResourceAsStream("com/gill/gmailAccountTest/config.properties");

	public ReadConfigFile() throws IOException {

		properties = new Properties();
		properties.load(fis);

	}

	public static String getUrl() {

		return properties.getProperty("url");

	}

	public static String getDriverWait() {
		return properties.getProperty("driver_wait");
	}

	public static String getMaxWindow() {
		return properties.getProperty("maximize_browser");
	}
	
	public static String getBrowser(){
		
		return properties.getProperty("browser_name");
	}

	public static String getChromeDriver() {
		return properties.getProperty("chrome_server_location_ubuntu");
	}
	
	public static String getIEDriver() {
		return properties.getProperty("ie_server_location");
	}

}
