package com.company.base;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static final String currDir=System.getProperty("user.dir");
	public static WebDriver driver;
	public static Properties pro;

	@BeforeSuite
	public void initBrowser() {
		
		loadConfig(currDir+"\\src\\test\\resources\\config\\config.properties");
		
		String browser=pro.getProperty("browser");
		
		if ("chrome".equalsIgnoreCase(browser)) {
			driver=new ChromeDriver();
		}else if ("firefox".equalsIgnoreCase(browser)) {
			driver=new FirefoxDriver();
		}else if ("edge".equalsIgnoreCase(browser)) {
			driver=new EdgeDriver();
		}else {
			System.out.println("Given browser " +browser+" have to impletemnt ......");
		}
		
		driver.manage().window().maximize();
		driver.get(pro.getProperty("QA"));
	}

	public void loadConfig(String path) {
		try {
			FileInputStream fis=new FileInputStream(path);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}


}
