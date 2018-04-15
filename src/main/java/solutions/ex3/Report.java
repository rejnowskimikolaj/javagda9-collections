package solutions.ex3;

import java.time.Instant;

public class Report {

    private final String content;
    private final ReportType reportType;
    private final Instant timestamp;


    public Report(String content, ReportType reportType, Instant timestamp) {
        this.content = content;
        this.reportType = reportType;
        this.timestamp = timestamp;
    }

    public String getContent() {
        return content;
    }

    public ReportType getReportType() {
        return reportType;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "Report{" +
                "content='" + content + '\'' +
                ", reportType=" + reportType +
                ", timestamp=" + timestamp +
                '}';
    }

}
