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

    public void addPassenger() {
        if (passengers < capacity) {
            passengers += 1;
        } else {
            System.out.println("There is no free seats!");
        }
    }

    public void removePassenger() {
        if (passengers != 0) {
            passengers -= 1;
        } else {
            System.out.println("There is no passengers to remove!");
        }
    }

    public static void main(String[] args) {
        Trolleybus[] trolleybuses = new Trolleybus[4];

        trolleybuses[0] = new Trolleybus();

        trolleybuses[1] = new Trolleybus(122, 22, "Sknylivok", 70, 50, 42);

        trolleybuses[2] = getInstance();
        trolleybuses[2].setId(568);
        trolleybuses[2].setRouteNumber(38);
        trolleybuses[2].setCurrentStop("Kulparkiv");
        trolleybuses[2].setMaxSpeed(60);
        trolleybuses[2].setCapacity(40);
        trolleybuses[2].setPassengers(13);

        trolleybuses[3] = getInstance();

        for (Trolleybus trolleybus : trolleybuses) {
            System.out.println(trolleybus);
        }
    }
}