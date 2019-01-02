package com.qa.runner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		prop = new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("/Users/horace/Documents/eclipse-workspace/freeCrmBDDFramework/src/main/java/com/qa/config/config.properties");
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	
	public static void initialization() {
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		
		//Commenting this line due to an issue with Chrome v.71 and the WebDriver
		//driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtils.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtils.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("baseUrl"));
		
	}
	
	public static void takeScreenshot(String fileName) {
		//Take the screenshot and save it as a file
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Copy the screenshot into a target file
		try {
			FileUtils.copyFile(file, new File("/Users/horace/Documents/eclipse-workspace/freeCrmBDDFramework/reports/execution_reports/screenshots/"+fileName+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
