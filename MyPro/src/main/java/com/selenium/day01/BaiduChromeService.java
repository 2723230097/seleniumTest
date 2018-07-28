package com.selenium.day01;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BaiduChromeService {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeDriverService service = new ChromeDriverService.Builder()
				.usingAnyFreePort()
				.usingDriverExecutable(new File("c:/driver/chromedriver.exe")).build();
       service.start();
       WebDriver driver= new RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
       driver.get("http://www.baidu.com");
       driver.close();
       driver= new RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
       driver.get("http://www.51testing.com");
       driver.quit();
       service.stop();
	}

}
