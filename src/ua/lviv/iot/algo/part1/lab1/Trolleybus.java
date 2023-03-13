package ua.lviv.iot.algo.part1.lab1;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Trolleybus {
    public static final int DEFAULT_TROLLEYBUS_COUNT = 4;
    private int id = 100;
    private int routeNumber;
    private String currentStop;
    private float maxSpeed;
    private int capacity;
    private int passengers;
    private static Trolleybus defaultTrolleybus = new Trolleybus();

    public static Trolleybus getInstance() {
        return defaultTrolleybus;
    }

    public void stop() {
        float currentSpeed = 0;
    }

    public void start() {
        float currentSpeed = 20;
    }

    public int addPassenger() {
        if (passengers < capacity) {
            passengers += 1;
            return passengers;
        }
        return 0;
    }

    public void removePassenger() {
        if (passengers == 0) {
            return;
        }
        passengers -= 1;
    }

    public static void main(String[] args) {
        var trolleybuses = new Trolleybus[DEFAULT_TROLLEYBUS_COUNT];
        trolleybuses[0] = new Trolleybus();
        trolleybuses[1] = new Trolleybus(122, 22, "Sknylivok", 70, 50, 42);
        trolleybuses[2] = getInstance();
        trolleybuses[3] = getInstance();

        for (var trolleybus : trolleybuses) {
            System.out.println(trolleybus);
        }
    }
}