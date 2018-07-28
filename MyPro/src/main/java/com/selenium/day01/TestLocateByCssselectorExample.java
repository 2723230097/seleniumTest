package com.selenium.day01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.utils.DriverUtils;

public class TestLocateByCssselectorExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("browser.type", "firefox");
		WebDriver driver = DriverUtils.getDriver();
		driver.get("http://localhost:5555/demo/survey/cybbbk/qdjcqk.htm");
		driver.findElement(By.partialLinkText("Ìµ¾ú¼ì²éÇé¿ö")).click();
		for (int i = 0; i <= 3; i++) {
			driver.findElement(By.id("tianjia_buttoncdqk")).click();
		}
	     WebElement table=driver.findElement(By.cssSelector(""));

		Thread.sleep(2000);
		driver.quit();
	}

}
