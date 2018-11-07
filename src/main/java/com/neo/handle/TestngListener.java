package com.neo.handle;

import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestngListener extends TestListenerAdapter {
	public static Logger log = Logger.getLogger(TestngListener.class);
	
	@Override
	public void onTestFailure(ITestResult tr) {
		super.onTestFailure(tr);
		log.info(tr.getName() + " Failure");
		log.info("运行失败");
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		super.onTestSkipped(tr);
		log.info(tr.getName() + " Skipped");
		log.info("运行跳过");
	}

	@Override
	public void onTestSuccess(ITestResult tr) {
		super.onTestSuccess(tr);
		log.info(tr.getName() + " Success");
		log.info("运行成功");

	}

	@Override
	public void onTestStart(ITestResult tr) {
		super.onTestStart(tr);
		log.info(tr.getName() + " Start");
	}

	@Override
	public void onFinish(ITestContext testContext) {
		super.onFinish(testContext);

	}

}
