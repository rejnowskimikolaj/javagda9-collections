package solutions.ex2;

import org.junit.Before;
import org.junit.Test;

import java.time.Instant;

import static org.junit.Assert.*;

public class EmergencyRoomTest {
    private EmergencyRoom emergencyRoom;
    private Patient patient1;
    private Patient patient2;


    @Before
    public void setUp() throws Exception {
        emergencyRoom = new EmergencyRoom();
        patient1 = new Patient("BobbyTest", Instant.now(),false);
        patient2 = new Patient("JimmyTest", Instant.now(), true);
    }

    @Test
    public void returnsEmptyOptionalWhenNoPatients(){
        assertFalse(emergencyRoom.getNextPatient().isPresent());
    }

    @Test
    public void returnsPatientIfThereIsOnlyOne(){
        emergencyRoom.addPatient(patient1);
        assertEquals(emergencyRoom.getNextPatient().get(), patient1);
    }

    @Test
    public void returnsPatientWithHigherPriority(){
        emergencyRoom.addPatient(patient1);
        emergencyRoom.addPatient(patient2);
        assertEquals(emergencyRoom.getNextPatient().get(), patient2);
    }

    @Test
    public void returnsPatientWithHigherPriority2(){
        emergencyRoom.addPatient(patient2);
        emergencyRoom.addPatient(patient1);
        assertEquals(emergencyRoom.getNextPatient().get(), patient2);
    }

    @Test
    public void returnsEmptyAfterRetrievingLastPatient(){
        emergencyRoom.addPatient(patient1);
        emergencyRoom.getNextPatient();
        assertFalse(emergencyRoom.getNextPatient().isPresent());
    }

}