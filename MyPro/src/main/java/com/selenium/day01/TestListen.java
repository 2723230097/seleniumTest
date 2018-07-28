package com.selenium.day01;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListen  extends TestListenerAdapter{
	@Override
	public void onTestFailure(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestFailure(tr);
		System.out.println("The test is failed!");
	}
	@Override
	public void onTestSuccess(ITestResult tr) {
		// TODO Auto-generated method stub
		super.onTestSuccess(tr);
		System.out.println("The test is Succeed!");
	}
}
