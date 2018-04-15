package solutions.ex3;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        Report report1 = new Report("mialem wypadek",ReportType.ACCIDENT, Instant.now());
        Report report2 = new Report("zawał serca",ReportType.EMS, Instant.now().plusSeconds(100));
        Report report3 = new Report("stodola sie pali",ReportType.FIRE, Instant.now().plusSeconds(50));
        Report report4 = new Report("szybe mi wybii",ReportType.OTHER, Instant.now().plus(2, ChronoUnit.DAYS));
        Report report5 = new Report("ukradli mi torebke",ReportType.POLICE, Instant.now());
        Report[]reports = {report1,report2,report3,report4,report5};
        for (Report report : reports) {
            dispatcher.addReport(report);
        }

        System.out.println(dispatcher.getLast(2));
        System.out.println(dispatcher.getLast(4));
        System.out.println(dispatcher.getReportsOfType(ReportType.POLICE));
    }
}
