package com.selenium.day01;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TestAddParam2 {
	Calculator calculator;
	  @Test(dataProvider = "shareData",dataProviderClass=TestParam.class)
	  public void f(int num1,int num2,int expected) {
		 calculator.add(num1); 
		 calculator.add(num2);
		 int result=calculator.getResult();
		 Assert.assertEquals(result, expected);
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		 calculator.clear(); 
	  }

	  @AfterMethod
	  public void afterMethod() {
		
	  }

	  @BeforeClass
	  public void beforeClass() {
		  calculator=new Calculator();
	  }

	  @AfterClass
	  public void afterClass() {
		  calculator=null;
	  }


}
