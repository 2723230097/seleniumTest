package com.selenium.day01;


import org.testng.annotations.DataProvider;

public class TestParam {

  @DataProvider(name="shareData")
  public Object[][] dp() {
    return new Object[][] {
        new Object[] { 1, 2,3 },
        new Object[] { 2, 4,6 },
        new Object[] { -2, 4,2 },    
    };
  }
}
