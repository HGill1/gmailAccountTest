package com.gill.gmailAccountTest.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestUtil {
	
public static void loadProperties(Properties properties, String fileName) throws IOException{
		
	FileInputStream fis = new FileInputStream(fileName);	
		properties.load(fis);
		fis.close();
	}

}
