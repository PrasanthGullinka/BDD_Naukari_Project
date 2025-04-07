package com.naukari.listerens;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersUtility implements ITestListener  {
	
	@Override
	public void onTestStart(ITestResult result) {
		
		 System.out.println("[STARTED] Test: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		 System.out.println("[PASSED] Test: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		 System.out.println("[FAILED] Test: " + result.getMethod().getMethodName());
	        System.out.println("Reason: " + result.getThrowable().getMessage());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("[SKIPPED] Test: " + result.getMethod().getMethodName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		 System.out.println("========== Test Suite Started: " + context.getName() + " ==========");
	}

	@Override
	public void onFinish(ITestContext context) {
		
        System.out.println("========== Test Suite Finished: " + context.getName() + " ==========");

	}

}
