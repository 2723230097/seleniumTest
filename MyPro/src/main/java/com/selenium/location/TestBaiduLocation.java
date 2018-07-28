package com.selenium.location;

import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils;

public class TestBaiduLocation {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "ie");
		new DriverUtils();
		WebDriver driver=DriverUtils.getDriver();
		driver.get("http://www.baidu.com");
	}
}
