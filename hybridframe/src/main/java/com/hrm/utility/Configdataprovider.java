package com.hrm.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configdataprovider {

	public Properties pro;

	public Configdataprovider() {

		File f = new File("./properties/config.properties");

		try {
			FileInputStream file = new FileInputStream(f);
			pro = new Properties();
			pro.load(file);
		} catch (Exception e) {

			System.out.println("config data is missing" + e.getMessage());
		}

	}

	public String getbrowser() {
		return pro.getProperty("Browser");
	}

	public String geturl() {

		return pro.getProperty("url");
	}
}
