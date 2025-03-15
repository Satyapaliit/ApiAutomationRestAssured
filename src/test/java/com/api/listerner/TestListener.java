package com.api.listerner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
	private static final Logger logger=LogManager.getLogger(TestListener.class);
	
	public void onStart(ITestContext context) {
	    logger.info("Test Suite started!");
	  }

	public void onTestStart(ITestResult result) {
		logger.info("Started! "+result.getMethod().getMethodName());
		logger.info("Description! "+result.getMethod().getDescription());
	}

	public void onTestSuccess(ITestResult result) {
		logger.info("Test Passed!");
	}

	public void onTestFailure(ITestResult result) {
		logger.error("Test Failed!");
	}

	public void onTestSkipped(ITestResult result) {
		logger.warn("Test Skipped!");
	}

	public void onFinish(ITestContext context) {
		logger.info("Test Suite completed!");
	}

}
