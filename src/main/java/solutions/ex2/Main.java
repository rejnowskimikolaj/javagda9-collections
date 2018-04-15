package solutions.ex2;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient("johhny", Instant.now(),false);
        Patient patient3 = new Patient("cathie", Instant.now().plus(6, ChronoUnit.HOURS),false);
        Patient patient4 = new Patient("jimmy", Instant.now().plus(7, ChronoUnit.HOURS),true);
        Patient patient5 = new Patient("billy", Instant.now(),true);
        Patient patient2 = new Patient("bobby", Instant.now().plus(5, ChronoUnit.HOURS),false);
        EmergencyRoom emergencyRoom = new EmergencyRoom();
        List<Patient> patients = Arrays.asList(patient1,patient2,patient3,patient4,patient5);
        for (Patient patient : patients) {
            emergencyRoom.addPatient(patient);
        }

        patients.stream().limit(3);
        emergencyRoom.printPatientsFromQueue();
        System.out.println("##############");
        emergencyRoom.printPatientsInPrioritizedOrder();

    }
}
