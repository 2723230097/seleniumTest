package com.selenium.day01;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestRadio {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriverService service = new ChromeDriverService.Builder()
				.usingAnyFreePort()
				.usingDriverExecutable(new File("c:/driver/chromedriver.exe")).build();
       service.start();
       WebDriver driver= new RemoteWebDriver(service.getUrl(),DesiredCapabilities.chrome());
       driver.get("http://localhost/demo/survey/cybbbk/qdjcqk.htm");
       List<WebElement> radios=driver.findElements(By.xpath("//input[@name='vcGgyy']"));
       for(WebElement radio:radios) {
    	   radio.click();
    	   Thread.sleep(1000);
    	   }
       driver.findElement(By.xpath("//input[@name='vcGgyy' and @value='3']")).click();    
       for(WebElement radio:radios) {
    	   if(radio.isSelected()) {
    		   System.out.println("选中的单选框的值为："+radio.getAttribute("value"));
    	   }
       }
       List<WebElement> checks=driver.findElements(By.xpath("//input[@name='vcJsfs']"));
       for(int i=0;i<checks.size();i++) {
    	   checks.get(i).click();
    	   Thread.sleep(1000);
    	   }   

	}

}
