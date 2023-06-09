package com.company.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseClass {

	public static String currDir=System.getProperty("user.dir");
	public static WebDriver driver;
	public static Properties pro;
	public static FileInputStream fis;

	@BeforeSuite
	public void initBrowser() {
		
		loadConfig(currDir+"\\src\\test\\resources\\config\\config.properties");
		
		if ("chrome".equalsIgnoreCase(pro.getProperty("browser"))) {
			driver=new ChromeDriver();
		}else if ("firefox".equalsIgnoreCase(pro.getProperty("browser"))) {
			driver=new FirefoxDriver();
		}else if ("edge".equalsIgnoreCase(pro.getProperty("browser"))) {
			driver=new EdgeDriver();
		}else {
			System.out.println("Given browser " +pro.getProperty("browser")+" have to impletemnt ......");
		}
		
		driver.manage().window().maximize();
		driver.get(pro.getProperty("QA"));
	}

	public void loadConfig(String path) {
		try {
			fis=new FileInputStream(path);
			pro=new Properties();
			pro.load(fis);
		} catch (Exception e) {
			
		}finally {
		    try {
				fis.close();
			} catch (IOException e) {
				
			}
		  }
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}


}
