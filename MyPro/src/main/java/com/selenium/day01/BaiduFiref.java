package com.selenium.day01;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;


public class BaiduFiref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "c:/driver/geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		FirefoxOptions firefoxOptions=new FirefoxOptions();
		firefoxOptions.setBinary("C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		GeckoDriverService service = new GeckoDriverService.Builder()
				.usingFirefoxBinary(new FirefoxBinary(new File("C:/Program Files (x86)/Mozilla Firefox/firefox.exe")))
				.usingDriverExecutable(new File("c:/driver/geckodriver.exe")).usingAnyFreePort().build();
		WebDriver driver = new FirefoxDriver(service);
		driver.get("http://www.baidu.com");
	}

}
