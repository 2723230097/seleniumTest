package com.selenium.day01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestListenDemo {
  @Test
  public void testSuc() {
	  System.out.println("This is testSuc");
	  Assert.fail();
  }
  @Test
  public void testFail() {
	  System.out.println("This is testFail");
  }
}
