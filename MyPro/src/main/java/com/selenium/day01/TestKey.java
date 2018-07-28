package com.selenium.day01;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.DriverUtils;

public class TestKey {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","c:/driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/ecshop/admin");
		driver.findElement(By.name("username")).sendKeys("administrator");
		driver.findElement(By.name("password")).sendKeys("test123456");
		driver.findElement(By.cssSelector("div.controls.last>input")).click();	
		Thread.sleep(1000);
		driver.switchTo().frame("header-frame");
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.partialLinkText("个人设置"))).pause(5000).perform();
		action.moveToElement(driver.findElement(By.partialLinkText("退出"))).click().perform();
		Thread.sleep(1000);
		driver.quit();
	}
}
	
