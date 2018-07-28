package com.selenium.day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.utils.DriverUtils;

public class TestWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "Chrome");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/wait1");
		WebElement element=new WebDriverWait(driver,20).until(ExpectedConditions.presenceOfElementLocated(By.id("sid8")));
        element.click();
	}
}
	
