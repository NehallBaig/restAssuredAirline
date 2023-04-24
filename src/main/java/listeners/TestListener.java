package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import reports.ExtentReportManager;
import utils.Utils;

import static reports.ExtentReportManager.extentReports;

public class TestListener implements ITestListener {

    public void onStart(ITestContext context) {
        String fileName = Utils.getReportNameWithTimeStamp();
        String reportPathWithFileName = System.getProperty("user.dir") + "\\reports\\" + fileName;
        extentReports = ExtentReportManager.createInstance(reportPathWithFileName, "Test API Automation Report", "Test Execution Report");
    }

    public void onFinish(ITestContext context) {
        if (extentReports != null) {
            extentReports.flush();
        }
    }

}
