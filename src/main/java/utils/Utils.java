package utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Utils {

    public static String getReportNameWithTimeStamp(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH-mm-ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        String formattedDateTime = dateTimeFormatter.format(localDateTime);
        String reportName = "AirlineTestReport"+formattedDateTime+".html";
        return reportName;
    }
}
