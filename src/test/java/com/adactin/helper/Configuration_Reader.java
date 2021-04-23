package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {

	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File(
				"C:\\Users\\Administrator\\eclipse-workspace\\Final_Project\\src\\test\\java\\com\\adactin\\propertiesfiles\\Configuration.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		// load(to add values in properties)

		p.load(fis);
	}

	public String getBrowser() {

		String browser = p.getProperty("browser");

		return browser;

	}

	public String getURL() {

		String url = p.getProperty("url");

		return url;

	}
	
	public String getCreditNo() {

		String CreditcardNo = p.getProperty("db_CreditNo");
		
		return CreditcardNo;
		
	}
	
	public String getCvvNo() {
		
		String cvv = p.getProperty("db_CvvNo");
		
		return cvv;
	}

	
	


}
