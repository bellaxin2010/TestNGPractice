package demo;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestFunction implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult){
        System.out.println("用例启动"+ iTestResult.toString());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("用例执行成功"+ iTestResult.toString());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("用例 失败");

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("跳过"+ iTestResult.toString());

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    @Test
    public void listenerExample(){
        Assert.assertEquals(2,2);
    }


}
