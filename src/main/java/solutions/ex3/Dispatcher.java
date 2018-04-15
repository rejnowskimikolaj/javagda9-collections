package solutions.ex3;

import java.util.*;
import java.util.stream.Collectors;

public class Dispatcher {

    private final Map<String,Report> reports;

    public Dispatcher() {

        reports = new HashMap<>();
    }

    public String addReport(Report report){

        String id = UtilClass.generateID(report);
        reports.put(id,report);
        return id;
    }

    public List<Report> getReportsOfType(ReportType type){
        return reports.values().stream()
                                    .filter(x->x.getReportType()==type)
                                    .collect(Collectors.toList());
    }

    public List<Report> getLast(int amount){
        return reports.values().stream()
                                .sorted(Comparator.comparing(Report::getTimestamp))
                                .limit(amount)
                                .collect(Collectors.toList());
    }

    public Optional<Report> getReportBy(String id){
        return Optional.ofNullable(reports.get(id));
    }
}
