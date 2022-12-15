package com.amazon.genericlib;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Baseclass
{
	public static AndroidDriver driver;
	 @BeforeClass
	 public void configBC() throws MalformedURLException, InterruptedException
	 {
		 DesiredCapabilities capabilities = new DesiredCapabilities();
			
			capabilities.setCapability("automationName","Appium");
			capabilities.setCapability("platformName","Android");
			capabilities.setCapability("deviceName","3200d0f4fe7895fb");
			capabilities.setCapability("platformVersion","10");
			//capabilities.setCapability("unicodeKeyboard", true);
			capabilities.setCapability("app","C:\\Dona\\Automation\\Amazon\\amazon-india-shopping-24-18-0-300.apk");
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver(url,capabilities);
			Thread.sleep(10000);
		
		 
		 
	 }
	 @Test
	 public void amazontest()
	 {
		 System.out.println("hi");
	 }

	 @AfterClass
	 public void configAC()
	 {
		 driver.close();
			System.out.println("hi");
	 }

}
