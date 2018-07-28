package com.selenium.day01;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverService;


public class Baiduxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.gecko.driver", "c:/driver/geckodriver.exe");
//		WebDriver driver=new FirefoxDriver();
		FirefoxOptions firefoxOptions=new FirefoxOptions();
		firefoxOptions.setBinary("C:/Program Files (x86)/Mozilla Firefox/firefox.exe");
		GeckoDriverService service = new GeckoDriverService.Builder()
				.usingFirefoxBinary(new FirefoxBinary(new File("C:/Program Files (x86)/Mozilla Firefox/firefox.exe")))
				.usingDriverExecutable(new File("c:/driver/geckodriver.exe")).usingAnyFreePort().build();
		WebDriver driver = new FirefoxDriver(service);
		driver.get("http://bbs.51testing.com/forum.php");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("软件测试新手上路")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tbody[contains(@id, 'normalthread')]/tr/th/a[3]")).click();
	}

}
