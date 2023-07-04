package class03;

import org.testng.ITestListener;
import utils.CommonMethods;

import java.io.IOException;

public class task1 extends CommonMethods implements ITestListener {
    @Override
    public void onTestSuccess(org.testng.ITestResult result) {
        try {
            takeScreenshot(result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void onTestFailure(org.testng.ITestResult result) {
        try {
            takeScreenshot(result.getName());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
