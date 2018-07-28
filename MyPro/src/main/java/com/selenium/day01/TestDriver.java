package com.selenium.day01;

import org.openqa.selenium.WebDriver;

import com.utils.DriverUtils;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "ie");
		WebDriver driver=new DriverUtils().getDriver();
		driver.get("http://www.baidu.com");
	}

}
