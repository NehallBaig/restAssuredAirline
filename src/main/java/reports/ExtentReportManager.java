package reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ExtentReportManager {

    public static ExtentReports extentReports;

    public static ExtentReports createInstance(String fileName, String reportName, String documentTitle){
        ExtentSparkReporter spark = new ExtentSparkReporter(fileName);
        spark.config().setReportName(reportName);
        spark.config().setDocumentTitle(documentTitle);
        spark.config().setTheme(Theme.DARK);
        spark.config().setEncoding("utf-8");
        extentReports = new ExtentReports();
        extentReports.attachReporter(spark);
        return extentReports;
    }


}
