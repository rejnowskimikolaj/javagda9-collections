package solutions.ex3;

import java.util.UUID;

public class UtilClass {

    private static int counter;

    public static String generateID(Report report){
        return report.getReportType().toString().charAt(0)+report.getTimestamp().toEpochMilli()+"_"+counter;

    }
}
