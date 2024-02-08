package Util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class Listener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
    }

    WebDriver driver = null;
    String filePath = "D:\\testing\\Automation project\\Project-nopcommerce\\reports";
    @Override
    public void onTestFailure(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) { // Check if the test has failed
            System.out.println("***** Error " + result.getName() + " test has failed *****");
            String methodName = result.getName().toString().trim();
            ITestContext context = result.getTestContext();
            driver = (WebDriver) context.getAttribute("driver"); // Assign the WebDriver instance
            takeScreenShot(methodName, driver);
        }
    }

    public void takeScreenShot(String methodName, WebDriver driver) {
        if (driver != null) {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            // The below method will save the screen shot in d drive with the test method name
            try {
                FileUtils.copyFile(scrFile, new File(filePath + methodName + ".png"));
                System.out.println("***Placed screen shot in " + filePath + " ***");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("WebDriver instance is null. Cannot capture screenshot.");
        }
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);
    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
    }
}
