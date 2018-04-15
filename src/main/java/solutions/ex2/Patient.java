package solutions.ex2;

import java.time.Instant;

public class Patient {

    private final String name;
    private final Instant arrivalTime;
    private final boolean isPrioritized;

    public Patient(String name, Instant arrivalTime, boolean isPrioritized) {
        this.name = name;
        this.arrivalTime = arrivalTime;
        this.isPrioritized = isPrioritized;
    }

    public String getName() {
        return name;
    }

    public Instant getArrivalTime() {
        return arrivalTime;
    }

    public boolean isPrioritized() {
        return isPrioritized;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "name='" + name + '\'' +
                ", arrivalTime=" + arrivalTime +
                ", isPrioritized=" + isPrioritized +
                '}';
    }
}
