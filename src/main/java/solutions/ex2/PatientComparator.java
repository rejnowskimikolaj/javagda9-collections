package solutions.ex2;

import java.util.Comparator;

public class PatientComparator implements Comparator<Patient> {
    @Override
    public int compare(Patient patient1, Patient patient2) {
        if(patient1.isPrioritized()&&!patient2.isPrioritized())return -1;
        if(!patient1.isPrioritized()&&patient2.isPrioritized())return 1;
        return patient2.getArrivalTime().compareTo(patient1.getArrivalTime());
    }
}
