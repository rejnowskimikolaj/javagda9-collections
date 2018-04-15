package solutions.ex2;

import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class EmergencyRoom {

    private final PriorityQueue<Patient> patients;


    public EmergencyRoom() {
        patients = new PriorityQueue<>(new PatientComparator());

    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public Optional<Patient> getNextPatient() {
        return Optional.ofNullable(patients.poll());
    }

    public void printPatientsFromQueue() {
        System.out.println(patients);
    }

    public void printPatientsInPrioritizedOrder() {
        List<Patient> patientListSorted = patients.stream().sorted(new PatientComparator())
                                                            .collect(Collectors.toList());
        System.out.println(patientListSorted);
    }
}
